#!/usr/bin/perl

use common::sense;
use JSON::XS;
use IO::File;
use Unicode::Normalize;

my $json_text_handle=new IO::File("3rdParty/src/gegl-build/docs/operations.json", "r");
my $json_text = join("", <$json_text_handle>);
$json_text=~s/^window.opdb=//;
$json_text=~s/\[Invalid UTF-8\] \\x[a-z0-9]{2}//gc;
my $data = decode_json($json_text);

my %java_type_map=(
	"boolean"=>"boolean",
	"double"=>"double",
	"int"=>"int",
	"string"=>"String",
	"filepath"=>"String",
	"path"=>"GeglVector",
	"color"=>"GeglColor",
	"enum"=>"String",
	"seed"=>"int",
	"format"=>"Babl",
	"object"=>"GeglBuffer",
	"pointer"=>"Pointer",
	"uri"=>"String",
	"curve"=>"GeglCurve"
	);


foreach my $operation_spec (@$data)
{
# Operation name - as provided when instanciating the filter
#say $operation_spec->{op};
    my $operation_id = $operation_spec->{op};
my @op_elements = split /:/, $operation_id;
my $filter_name = pop @op_elements;
my $namespace = "com.jibee.gegl.filters.".join(".", @op_elements);
my $className = make_wikiname($filter_name);


# parent class. Probably specifies some commonalities?
    delete $operation_spec->{parent};

# input pads
#say join(", ", @{$operation_spec->{"input-pads"}}) if $operation_spec->{"input-pads"};
    my $inputPads = processPads($operation_spec->{"input-pads"}, "InputPad");
    my $outputPads = processPads($operation_spec->{"output-pads"}, "OutputPad");
    delete $operation_spec->{"input-pads"};
#say join(", ", @{$operation_spec->{"output-pads"}}) if $operation_spec->{"output-pads"};
    delete $operation_spec->{"output-pads"};
# other name this filter can be refered as.
    delete $operation_spec->{"compat-name"};
# description of the filter
    my $description = $operation_spec->{"description"};
# Filter source code. can be safely ignored
    delete $operation_spec->{"source"};

# Filter categories
    my $categories = arrayRefToJavaArray($operation_spec->{'categories'});
# Filter friendly name. Not always there
    my $title = $operation_spec->{title};

# Example image.
    delete $operation_spec->{image};

# Properties. We really need to parse this...
    my $props = parse_properties($className, $operation_spec->{properties});
    my $property_declarations = $props->{declaration};
    my $used_types = $props->{used_types};
    $used_types->{GeglFilter}=1;
    $used_types->{InputPad}=1 if $inputPads;
    $used_types->{OutputPad}=1 if $outputPads;

    my %type_import_specs = (
	    "OutputPad"=>"import com.jibee.gegl.OutputPad;",
	    "InputPad"=>"import com.jibee.gegl.InputPad;",
	    "GeglFilter"=>"import com.jibee.gegl.GeglFilter;",
	    "Pointer"=>"import com.sun.jna.Pointer;",
	    "Babl"=>"import com.jibee.gegl.Babl;",
	    "GeglBuffer"=>"import com.jibee.gegl.GeglBuffer;",
	    "GeglColor"=>"import com.jibee.gegl.GeglColor;",
	    "GeglVector"=>"import com.jibee.gegl.GeglVector;",
	    "GeglCurve"=>"import com.jibee.gegl.GeglCurve;",
	    "ParameterOutOfRangeException"=>"import com.jibee.gegl.ParameterOutOfRangeException;"
	    );
    my %types = map { $type_import_specs{$_}=>1 } keys(%$used_types);
    my $type_imports = join("\n", grep {$_} keys(%types));

# Aternative name for this filter
    delete $operation_spec->{"compat-op"};

# Filter license
    my $license = $operation_spec->{license};

# Position dependent flag. Not sure what it means
#say $operation_spec->{"position-dependent"} if $operation_spec->{'position-dependent'};
    my $position_dependant = $operation_spec->{'position-dependent'}?"true":"false";
# Indicates if the filter supports OpenCL accelerated calculation
#say $operation_spec->{"opencl-support"} if $operation_spec->{'opencl-support'};
    my $support_openCL = $operation_spec->{'opencl-support'}?"true":"false";
    delete $operation_spec->{'opencl-support'};
# exemple of invocation of the filter in a XML representation
#say $operation_spec->{"reference-composition"} if $operation_spec->{'reference-composition'};
    delete $operation_spec->{'reference-composition'};

my $class_contents = <<"EOF";
package $namespace;

$type_imports
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.Filter;

/**
 * $title
 *
 * $description
 * 
 * License: $license
 * Supports OpenCL: $support_openCL
 * Position Dependant: $position_dependant
 */
\@Filter(license="$license", opencl=$support_openCL, position_dependant=$position_dependant, categories={$categories})
public class $className extends GeglFilter
{
    /** Constructs a $title.
     *
     * $description
     */
    public $className(GeglNode container)
    {
        super(container, "$operation_id");
    }
    /** Constructs a $title.
     *
     * $description
     */
    public $className(GeglFilter parent)
    {
        super(parent, "$operation_id");
    }

    $property_declarations$inputPads$outputPads
}

EOF

    my $target_file = "JWeb/src/main/java/".$namespace;
    $target_file =~s/\./\//g;
    warn($target_file) unless -d $target_file;
    $target_file.="/".$className.".java";

    my $file = new IO::File($target_file, "w");
    print $file $class_contents;
    close $file;
}

sub processPad
{
    my ($padspec, $class)=@_;
    my $padName=make_wikiname($padspec);
    my $text = <<"EOF";
    public $class $padName()
    {
        return new $class(this, "$padspec");
    }
EOF

    return $text;
}

sub processPads
{
    my ($padspecs, $class)=@_;
    return "" unless $padspecs;
    return join("\n", map{processPad($_, $class)} @$padspecs);
}

sub arrayRefToJavaArray
{
    my $ref = shift;
    my @elements= $ref?@{$ref}:();
    return join(", ", map { "\"".$_."\"" } @elements);
}

sub parse_properties
{
    my ($className, $ops)=@_;
    my $retval = "";
    my %used_types = ();
    foreach my $op (@$ops)
    {
	my $props = parse_property($className, $op);
	$retval .= $props->{declaration};
	%used_types = (%used_types, %{$props->{used_types}});

    }
    return {declaration=>$retval, used_types=>\%used_types};
}


sub parse_property
{
    my ($className, $op)=@_;
    my $name = $op->{name};
    my $type = $op->{type};
    my $label = $op->{label};

    my %used_types;
# description
    my $description = $op->{description} if $op->{description};
    my $java_type = $java_type_map{$type};
    warn("No java type for $type - $description") unless $java_type;

    my $shortName = make_wikiname($name);
    my $fieldname = "m_".$shortName;

#say("Name: $name\tType: $type\tLabel: $label");
# default value
    my $default = $op->{default} if $op->{default};

    my $default_value_init = "";
    if($default)
    {
	if($java_type eq "boolean")
	{
	    $default = "false" if $default eq "False";
	    $default = "true" if $default eq "True";
	}
	if($java_type eq "String")
	{
            $default =~ s/\n/\\n"+\n"/g;
	    $default = '"'.$default.'"';
	}
	if($java_type eq "double")
	{
	    $default = 'Double.POSITIVE_INFINITY' if $default eq "+inf";
	}
	if($java_type eq "GeglColor")
	{
	    $default = 'makeColor("'.$default.'")';
	}
	$default_value_init = " = ".$default;
    }
    $used_types{$java_type}=1;


# Min values and max values
    my $minimum = $op->{minimum} if $op->{minimum};
    my $maximum = $op->{maximum} if $op->{maximum};
    $maximum = undef if $maximum eq "+inf";
    $minimum = undef if $minimum eq "-inf";
    my $allowed_range_check = "";
    my $exception_declaration = "";
    if($minimum or $maximum)
    {
	$exception_declaration = " throws ParameterOutOfRangeException";
	$used_types{ParameterOutOfRangeException}=1;
	if($minimum and $maximum)
	{
	    $allowed_range_check = <<"EOF";
	if(value > $maximum || value < $minimum)
	{
	    throw new ParameterOutOfRangeException(value, $minimum, $maximum);
	}
EOF
	}
	elsif($minimum)
	{
	    $allowed_range_check = <<"EOF";
	if(value < $minimum)
	{
	    throw new ParameterOutOfRangeException(value, $minimum, Double.POSITIVE_INFINITY);
	}
EOF
	}
	elsif($maximum)
	{
	    $allowed_range_check = <<"EOF";
	if(value > $maximum)
	{
	    throw new ParameterOutOfRangeException(value, Double.NEGATIVE_INFINITY, $maximum);
	}
EOF
	}
    }

# Role. Not clear
    my $role = $op->{role} if $op->{role};

# unit of the variable
    my $unit = $op->{unit} if $op->{unit};

# Indication of the axis to which this variable applies
    my $axis = $op->{axis} if $op->{axis};


# UI indications
# ui-step-small, ui-step-big, ui-digits, ui-minimum, ui-gamma, ui-maximum
    delete $op->{$_} foreach (qw/name type label default description minimum maximum role ui-step-small ui-step-big ui-digits ui-minimum ui-gamma ui-maximum unit axis/);
#say join(", ", keys %$op) if %$op;
    my $property_declaration = <<"EOF";

    /** $label
     *
     * $description
     *
     * Unit: $unit
     * Default value: $default
     * Acceptable Range: $minimum $maximum
     * */
    private $java_type $fieldname $default_value_init;

    /** $label
     *
     * $description
     *
     * Unit: $unit
     * Default value: $default
     * Acceptable Range: $minimum $maximum
     */
    public $className set$shortName($java_type value)$exception_declaration
    {
	$allowed_range_check
        $fieldname = value;
        setProperty("$name", value);
        return this;
    }

    /** $label
     *
     * $description
     *
     * Unit: $unit
     * Default value: $default
     * Acceptable Range: $minimum $maximum
     */
    public $java_type get$shortName()
    {
        return $fieldname;
    }

EOF
    return {declaration=>$property_declaration, used_types=>\%used_types};
}

sub make_ascii
{
    my ($title) = @_;
##  convert to Unicode first
##  if your data comes in Latin-1, then uncomment:
#    $_ = Encode::decode( 'iso-8859-1', $_ );  

    $title=~s/\xe4/ae/g;  ##  treat characters ä ñ ö ü ÿ
    $title=~s/\xf1/ny/g;  ##  this was wrong in previous version of this doc
    $title=~s/\xf6/oe/g;
    $title=~s/\xfc/ue/g;
    $title=~s/\xff/yu/g;

    $title = NFD( $title );   ##  decompose (Unicode Normalization Form D)
    $title=~s/\pM//g;         ##  strip combining characters

# additional normalizations:

    $title=~s/\x{00df}/ss/g;  ##  German beta “ß” -> “ss”
    $title=~s/\x{00c6}/AE/g;  ##  Æ
    $title=~s/\x{00e6}/ae/g;  ##  æ
    $title=~s/\x{0132}/IJ/g;  ##  Ĳ
    $title=~s/\x{0133}/ij/g;  ##  ĳ
    $title=~s/\x{0152}/Oe/g;  ##  Œ
    $title=~s/\x{0153}/oe/g;  ##  œ

    $title=~tr/\x{00d0}\x{0110}\x{00f0}\x{0111}\x{0126}\x{0127}/DDddHh/; # ÐĐðđĦħ
    $title=~tr/\x{0131}\x{0138}\x{013f}\x{0141}\x{0140}\x{0142}/ikLLll/; # ıĸĿŁŀł
    $title=~tr/\x{014a}\x{0149}\x{014b}\x{00d8}\x{00f8}\x{017f}/NnnOos/; # ŊŉŋØøſ
    $title=~tr/\x{00de}\x{0166}\x{00fe}\x{0167}/TTtt/;                   # ÞŦþŧ

    $title=~s/[^\0-\x80]//g;  ##  clear everything else; optional
    return $title;
}

sub make_slug
{
    my $title = make_ascii(@_);
    $title=~s/[^a-zA-Z0-9]/_/g;
    $title =~ s/_+/_/g;
    $title =~ s/_$//g;
    return lc($title);
}

sub make_wikiname
{
    my ($base)=@_;
    $base =~ s/-/ /g;
    $base=~s/^[0-9]*//;
    my @elements = split / /, $base;
    @elements = map { split /_/, make_slug($_) } @elements;
    s/^(.)/\u$1/ foreach @elements;
    return join '', @elements;
}


