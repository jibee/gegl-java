package com.jibee.gegl.priv;

import java.util.HashMap;

import org.gstreamer.lowlevel.GObjectAPI.GParamSpec;
import org.gstreamer.lowlevel.GType;
import org.gstreamer.lowlevel.GValueAPI.GValue;
import org.gstreamer.lowlevel.OurGTypeMapper;

import com.jibee.gegl.BablFormat;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglColor;
import com.jibee.gegl.GeglConfig;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.GeglOperation;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

/** GEGL library interface; implementation to be provided by the native library through JNA
 * 
 * @author jibee
 *
 */
public interface Gegl extends Library {


	/** Tile backend type
	 * 
	 *
	 */
	public interface GeglTileBackend {

	}


	/** Sampler type
	 * 
	 *
	 */
	public interface GeglSampler {
		/**
		 * gegl_sampler_get:
		 * @param sampler a GeglSampler gotten from gegl_buffer_sampler_new
		 * @param x x coordinate to sample
		 * @param y y coordinate to sample
		 * @param scale matrix representing extent of sampling area in source buffer.
		 * @param output memory location for output data.
		 * @param repeat_mode how requests outside the buffer extent are handled.
		 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
		 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
		 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
		 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
		 *
		 * Perform a sampling with the provided @sampler.
		 */
		/*
		void              gegl_sampler_get            (GeglSampler sampler,
				double         x,
				double         y,
				GeglMatrix2 scale,
				Pointer           output,
				GeglAbyssPolicy repeat_mode);
		 */
		/* code template utility, updates the jacobian matrix using
		 * a user defined mapping function for displacement, example
		 * with an identity transform (note that for the identity
		 * transform this is massive computational overhead that can
		 * be skipped by passing NULL to the sampler.
		 *
		 * #define gegl_unmap(x,y,dx,dy) { dx=x; dy=y; }
		 *
		 * gegl_sampler_compute_scale (scale, x, y);
		 * gegl_unmap(x,y,sample_x,sample_y);
		 * gegl_buffer_sample (buffer, sample_x, sample_y, scale, dest, format,
		 *                     GEGL_SAMPLER_LOHALO);
		 *
		 * #undef gegl_unmap      // IMPORTANT undefine map macro
		 */
		/*
	#define gegl_sampler_compute_scale(matrix, x, y) \
	{                                       \
	  float ax, ay, bx, by;                 \
	  gegl_unmap(x + 0.5, y, ax, ay);       \
	  gegl_unmap(x - 0.5, y, bx, by);       \
	  matrix.coeff[0][0] = ax - bx;         \
	  matrix.coeff[1][0] = ay - by;         \
	  gegl_unmap(x, y + 0.5, ax, ay);       \
	  gegl_unmap(x, y - 0.5, bx, by);       \
	  matrix.coeff[0][1] = ax - bx;         \
	  matrix.coeff[1][1] = ay - by;         \
	}
		 */

		/**
		 * gegl_sampler_get_context_rect:
		 * @sampler: a GeglSampler gotten from gegl_buffer_sampler_new
		 *
		 * Returns:The context rectangle of the given @sampler.
		 */
		//		GeglRectangle  gegl_sampler_get_context_rect (GeglSampler sampler);

	}


	/** Matrix type */
	public interface GeglMatrix2 {

	}


/** Abyss Policy type
 * 
 *
 */
	public interface GeglAbyssPolicy {

	}


	/** Destroy notifier type */
	public interface GDestroyNotify {

	}


	/** Callback type  */
	public interface GCallback {

	}


	/** (native) implementation of this interface
	 * 
	 */
	Gegl INSTANCE = (Gegl)Native.loadLibrary("gegl-0.4", Gegl.class,new HashMap<String, Object>() {
		private static final long serialVersionUID = 4534904554735816797L;
		{
			put(Library.OPTION_TYPE_MAPPER, new OurGTypeMapper());
		}});

	/* From gegl-init.h */

	/**
	 * gegl_init:
	 * @param argc (inout): a pointer to the number of command line arguments.
	 * @param argv (inout) (array length=argc) (allow-none): a pointer to the array of command line arguments.
	 *
	 * Call this function before using any other GEGL functions. It will
	 * initialize everything needed to operate GEGL and parses some
	 * standard command line options. @argc and @argv are adjusted
	 * accordingly so your own code will never see those standard
	 * arguments.
	 *
	 * Note that there is an alternative way to initialize GEGL: if you
	 * are calling g_option_context_parse() with the option group returned
	 * by #gegl_get_option_group(), you don't have to call #gegl_init().
	 **/
	void gegl_init(IntByReference argc, PointerByReference argv);
	/**
	 * gegl_exit:
	 *
	 * Call this function when you're done using GEGL. It will clean up
	 * caches and write/dump debug information if the correct debug flags
	 * are set.
	 */
	void gegl_exit();
	/**
	 * gegl_load_module_directory:
	 * @param path the directory to load modules from
	 *
	 * Load all gegl modules found in the given directory.
	 */
	void gegl_load_module_directory (String path);

	/**
	 * gegl_config:
	 *
	 * Returns a GeglConfig object with properties that can be manipulated to control
	 * GEGLs behavior.
	 *
	 * @return Return value: (transfer none): a #GeglConfig
	 */
	GeglConfig gegl_config();
	/* end of gegl-init.h */

	/* gegl-node.h */
	/***
	 * GeglNode:
	 *
	 * The Node is the image processing primitive connected to create compositions
	 * in GEGL. The toplevel #GeglNode which contains a graph of #GeglNodes is
	 * created with #gegl_node_new. Using this toplevel node we can create children
	 * of this node which are individual processing elements using #gegl_node_new_child
	 *
	 * A node either has an associated operation or is a parent for other nodes,
	 * that are connected to their parent through proxies created with
	 * #gegl_node_get_input_proxy and #gegl_node_get_output_proxy.
	 *
	 * The properties available on a node depends on which <a
	 * href='operations.html'>operation</a> is specified.
	 *
	 * ---
	 * GeglNode gegl, *load, *bcontrast;
	 *
	 * gegl = gegl_node_new ();
	 * load = gegl_node_new_child (gegl,
	 * "operation", "gegl:load",
	 * "path", "input.png",
	 * NULL);
	 * bcontrast = gegl_node_new_child (gegl,
	 * "operation", "gegl:brightness-contrast",
	 * "brightness", 0.2,
	 * "contrast", 1.5,
	 * NULL);
	 */

	/**
	 * gegl_node_new:
	 *
	 * Create a new graph that can contain further processing nodes.
	 *
	 * @return Return value: (transfer full): A new top level #GeglNode (which can be used as a graph). When you
	 * are done using this graph instance it should be unreferenced with g_object_unref.
	 * This will also free any sub nodes created from this node.
	 */
	GeglNode gegl_node_new();

	/**
	 * gegl_node_new_child:
	 * @param parent : a #GeglNode
	 * @param first_property_name : the first property name
	 * @param args  first property value, optionally followed by more key/value pairs, ended
	 * terminated with NULL.
	 *
	 * Creates a new processing node that performs the specified operation with
	 * a NULL terminated list of key/value pairs for initial parameter values
	 * configuring the operation. Usually the first pair should be "operation"
	 * and the type of operation to be associated. If no operation is provided
	 * the node doesn't have an initial operation and can be used to construct
	 * a subgraph with special middle-man routing nodes created with
	 * #gegl_node_get_output_proxy and #gegl_node_get_input_proxy.
	 *
	 * @return Return value: (transfer none): A newly created #GeglNode. The node will be destroyed by the parent.
	 * Calling g_object_unref on a node will cause the node to be dropped by the
	 * parent. (You may also add additional references using
	 * g_object_ref/g_object_unref, but in general relying on the parents reference
	 * counting is easiest.)
	 */
	GeglNode gegl_node_new_child(GeglNode parent, String first_property_name, Object... args);

	/***
	 * Making connections:
	 *
	 * Nodes in GEGL are connected to each other. The resulting graph of nodes
	 * represents the image processing pipeline to be processed.
	 *
	 * ---
	 * gegl_node_link_many (background, over, png_save, NULL);
	 * gegl_node_connect_to (translate, "output", over, "aux");
	 * gegl_node_link_many (text, blur, translate, NULL);
	 */

	/**
	 * gegl_node_connect_from:
	 * @param sink the node we're connecting an input to
	 * @param input_pad_name the name of the input pad we are connecting to
	 * @param source the node producing data we want to connect.
	 * @param output_pad_name the output pad we want to use on the source.
	 *
	 * Makes a connection between the pads of two nodes.
	 *
	 * @return Returns TRUE if the connection was succesfully made.
	 */

	boolean gegl_node_connect_from(
			GeglNode sink,
			String input_pad_name,
			GeglNode source,
			String output_pad_name
			);

	/**
	 * gegl_node_connect_to:
	 * @param source the node producing data we want to connect.
	 * @param output_pad_name the output pad we want to use on the source.
	 * @param sink the node we're connecting an input to
	 * @param input_pad_name the name of the input pad we are connecting to
	 *
	 * Makes a connection between the pads of two nodes.
	 *
	 * @return Returns TRUE if the connection was succesfully made.
	 */
	boolean gegl_node_connect_to(GeglNode source,
			String output_pad_name,
			GeglNode sink,
			String input_pad_name);

	/**
	 * gegl_node_link:
	 * @param source the producer of data.
	 * @param sink the consumer of data.
	 *
	 * Synthetic sugar for linking the "output" pad of @source to the "input"
	 * pad of @sink.
	 */
	void gegl_node_link (GeglNode source, GeglNode sink);

	/**
	 * gegl_node_link_many:
	 * @param source the producer of data.
	 * @param first_sink the first consumer of data.
	 * @param others NULL, or optionally more consumers followed by NULL.
	 *
	 * Synthetic sugar for linking a chain of nodes with "input"->"output". The
	 * list is NULL terminated.
	 */
	@Deprecated
	void gegl_node_link_many(GeglNode source, GeglNode first_sink, GeglNode... others);



	/**
	 * gegl_node_disconnect:
	 * @param node a #GeglNode
	 * @param input_pad the input pad to disconnect.
	 *
	 * Disconnects node connected to @input_pad of @node (if any).
	 *
	 * @return Returns TRUE if a connection was broken.
	 */
	boolean gegl_node_disconnect(GeglNode node, String input_pad);

	/***
	 * Properties:
	 *
	 * Properties can be set either when creating the node with
	 * #gegl_node_new_child as well as later when changing the initial
	 * value with #gegl_node_set.
	 *
	 * To see what properties are available for a given operation look in the <a
	 * href='operations.html'>Operations reference</a> or use
	 * #gegl_node_get.
	 */

	/**
	 * gegl_node_set:
	 * @param node a #GeglNode
	 * @param first_property_name name of the first property to set
	 * @param args value for the first property, followed optionally by more name/value
	 * pairs, followed by NULL.
	 *
	 * Set properties on a node, possible properties to be set are the properties
	 * of the currently set operations as well as <em>"name"</em> and
	 * <em>"operation"</em>. <em>"operation"</em> changes the current operations
	 * set for the node, <em>"name"</em> doesn't have any role internally in
	 * GEGL.
	 * ---
	 * gegl_node_set (node, "brightness", -0.2,
	 * "contrast", 2.0,
	 * NULL);
	 */
	void gegl_node_set(GeglNode node, String first_property_name, Object ... args);

	/**
	 * gegl_node_get:
	 * @param node a #GeglNode
	 * @param first_property_name name of the first property to get.
	 * @param args return location for the first property, followed optionally by more
	 * name/value pairs, followed by NULL.
	 *
	 * Gets properties of a #GeglNode.
	 * ---
	 * double level;
	 * char *path;
	 *
	 * gegl_node_get (png_save, "path", &path, NULL);
	 * gegl_node_get (threshold, "level", &level, NULL);
	 */
	void gegl_node_get(GeglNode node, String first_property_name, Object... args);


	/***
	 * Processing:
	 *
	 * There are two different ways to do processing with GEGL, either you
	 * query any node providing output for a rectangular region to be rendered
	 * using #gegl_node_blit, or you use #gegl_node_process on a sink node (A
	 * display node, an image file writer or similar). To do iterative processing
	 * you need to use a #GeglProcessor. See #gegl_processor_work for a code
	 * sample.
	 */

	/**
	 * gegl_node_blit: (skip)
	 * @param node a #GeglNode
	 * @param scale the scale to render at 1.0 is default, other values changes the
	 * width/height of the sampled region.
	 * @param roi the rectangle to render from the node, the coordinate system used is
	 * coordinates after scale has been applied.
	 * @param format the #BablFormat desired.
	 * @param buf a memory buffer large enough to contain the data, can be
	 * left as NULL when forcing a rendering of a region.
	 * @param rowstride rowstride in bytes, or GEGL_AUTO_ROWSTRIDE to compute the
	 * rowstride based on the width and bytes per pixel for the specified format.
	 * @param flags an or'ed combination of GEGL_BLIT_DEFAULT, GEGL_BLIT_CACHE and
	 * GEGL_BLIT_DIRTY. if cache is enabled, a cache will be set up for subsequent
	 * requests of image data from this node. By passing in GEGL_BLIT_DIRTY the
	 * function will return with the latest rendered results in the cache without
	 * regard to wheter the regions has been rendered or not.
	 *
	 * Render a rectangular region from a node.
	 */
	void gegl_node_blit (GeglNode node,
			double scale,
			GeglRectangle roi,
			TypedPointer<BablFormat> format,
			byte[] buf,
			int rowstride,
			int flags);

	/**
	 * gegl_node_blit_buffer:
	 * @param node a #GeglNode
	 * @param buffer (transfer none) (allow-none): the #GeglBuffer to render to.
	 * @param roi (allow-none): the rectangle to render.
	 *
	 * Render a rectangular region from a node to the given buffer.
	 */
	void gegl_node_blit_buffer (GeglNode node,
			GeglBuffer buffer,
			GeglRectangle roi);

	/**
	 * gegl_node_process:
	 * @param sink_node a #GeglNode without outputs.
	 *
	 * Render a composition. This can be used for instance on a node with a "png-save"
	 * operation to render all neccesary data, and make it be written to file. This
	 * function wraps the usage of a GeglProcessor in a single blocking function
	 * call. If you need a non-blocking operation, then make a direct use of
	 * #gegl_processor_work. See #GeglProcessor.
	 *
	 * ---
	 * GeglNode gegl;
	 * GeglRectangle roi;
	 * GeglNode png_save;
	 * unsigned char *buffer;
	 *
	 * gegl = gegl_parse_xml (xml_data);
	 * roi = gegl_node_get_bounding_box (gegl);
	 * # create png_save from the graph, the parent/child relationship
	 * # only mean anything when it comes to memory management.
	 * png_save = gegl_node_new_child (gegl,
	 * "operation", "gegl:png-save",
	 * "path", "output.png",
	 * NULL);
	 *
	 * gegl_node_link (gegl, png_save);
	 * gegl_node_process (png_save);
	 *
	 * buffer = malloc (roi.w*roi.h*4);
	 * gegl_node_blit (gegl,
	 * 1.0,
	 * &roi,
	 * babl_format("R'G'B'A u8"),
	 * buffer,
	 * GEGL_AUTO_ROWSTRIDE,
	 * GEGL_BLIT_DEFAULT);
	 */
	void gegl_node_process (GeglNode sink_node);


	/***
	 * Reparenting:
	 *
	 * Sometimes it is useful to be able to move nodes between graphs or even
	 * handle orphaned nods that are not part of a graph. gegl_node_adopt_child
	 * and gegl_node_get_parent are provided to handle such cases.
	 */

	/**
	 * gegl_node_add_child:
	 * @param graph a GeglNode (graph)
	 * @param child a GeglNode.
	 *
	 * Make the GeglNode @graph, take a reference on child. This reference
	 * will be dropped when the reference count on the graph reaches zero.
	 *
	 * @return Return value: (transfer none): the child.
	 */
	GeglNode  gegl_node_add_child (GeglNode  graph,
			GeglNode child);

	/**
	 * gegl_node_remove_child:
	 * @param graph a GeglNode (graph)
	 * @param child a GeglNode.
	 *
	 * Removes a child from a GeglNode. The reference previously held will be
	 * dropped so increase the reference count before removing when reparenting
	 * a child between two graphs.
	 *
	 * @return Return value: (transfer none): the child.
	 */
	GeglNode  gegl_node_remove_child (GeglNode graph,
			GeglNode child);

	/**
	 * gegl_node_get_parent:
	 * @param node a #GeglNode
	 *
	 * Returns a GeglNode that keeps a reference on a child.
	 *
	 * @return Return value: (transfer none): the parent of a node or NULL.
	 */
	GeglNode  gegl_node_get_parent (GeglNode node);


	/***
	 * State queries:
	 *
	 * This section lists functions that retrieve information, mostly needed
	 * for interacting with a graph in a GUI, not creating one from scratch.
	 *
	 * You can figure out what the bounding box of a node is with #gegl_node_get_bounding_box,
	 * retrieve the values of named properties using #gegl_node_get.
	 */



	/**
	 * gegl_node_detect:
	 * @param node a #GeglNode
	 * @param x x coordinate
	 * @param y y coordinate
	 *
	 * Performs hit detection by returning the node providing data at a given
	 * coordinate pair. Currently operates only on bounding boxes and not
	 * pixel data.
	 *
	 * @return Return value: (transfer none): the GeglNode providing the
	 * data ending up at @x,@y in the output of @node.
	 */
	GeglNode  gegl_node_detect (GeglNode node,
			int x,
			int y);


	/**
	 * gegl_node_find_property:
	 * @param node the node to lookup a paramspec on
	 * @param property_name the name of the property to get a paramspec for.
	 *
	 * Return value: (transfer none): the GParamSpec of property or NULL
	 * if no such property exists.
	 */
	/*
GParamSpec * gegl_node_find_property (GeglNode node,
 String property_name);
	 */


	/**
	 * gegl_node_get_bounding_box: (skip)
	 * @param node a #GeglNode
	 *
	 * @return Returns the position and dimensions of a rectangle spanning the area
	 * defined by a node.
	 */
	GeglRectangle.ByValue gegl_node_get_bounding_box (GeglNode node);

	/**
	 * gegl_node_get_children:
	 * @param node the node to retrieve the children of.
	 *
	 * @return Return value: (element-type Gegl.Node) (transfer container): a list
	 * of the nodes contained within a GeglNode that is a subgraph.
	 * Use g_list_free () on the list when done.
	 */
	/*
GSList * gegl_node_get_children (GeglNode node);
	 */
	/**
	 * gegl_node_get_consumers:
	 * @param node the node we are querying.
	 * @param output_pad the output pad we want to know who uses.
	 * @param nodes (out callee-allocates) (array zero-terminated=1) (allow-none): optional return location for array of nodes.
	 * @param pads (out callee-allocates) (array zero-terminated=1) (allow-none): optional return location for array of pad names.
	 *
	 * Retrieve which pads on which nodes are connected to a named output_pad,
	 * and the number of connections. Both the location for the generated
	 * nodes array and pads array can be left as NULL. If they are non NULL
	 * both should be freed with g_free. The arrays are NULL terminated.
	 *
	 * @return Returns the number of consumers connected to this output_pad.
	 */
	/*
int gegl_node_get_consumers (GeglNode node,
 String output_pad,
 GeglNode **nodes,
 String **pads);
	 */
	/**
	 * gegl_node_get_input_proxy:
	 * @param node a #GeglNode
	 * @param pad_name the name of the pad.
	 *
	 * Proxies are used to route between nodes of a subgraph contained within
	 * a node.
	 *
	 * @return Return value: (transfer none): Returns an input proxy for the named pad.
	 * If no input proxy exists with this name a new one will be created.
	 */
	GeglNode  gegl_node_get_input_proxy (GeglNode node,
			String pad_name);

	/**
	 * gegl_node_get_operation:
	 * @param node a #GeglNode
	 *
	 * @return Return value: The type of processing operation associated with this
	 * node, or NULL if there is no op associated. The special name
	 * "GraphNode" is returned if the node is the container of a subgraph.
	 */
	String  gegl_node_get_operation (GeglNode  node);

	/**
	 * gegl_node_get_gegl_operation:
	 * @param node a #GeglNode
	 *
	 * @return Return value: (transfer none) (allow-none): The operation object
	 * assoicated with this node or NULL if there is no op associated.
	 */
	GeglOperation gegl_node_get_gegl_operation (GeglNode node);

	/**
	 * gegl_node_get_output_proxy:
	 * @param node a #GeglNode
	 * @param pad_name the name of the pad.
	 *
	 * Proxies are used to route between nodes of a subgraph contained within
	 * a node.
	 *
	 * @return Return value: (transfer none): Returns a output proxy for the named pad.
	 * If no output proxy exists with this name a new one will be created.
	 */
	GeglNode  gegl_node_get_output_proxy (GeglNode node,
			String pad_name);

	/**
	 * gegl_node_get_producer:
	 * @param node the node we are querying
	 * @param input_pad_name the input pad we want to get the producer for
	 * @param output_pad_name (allow-none): optional pointer to a location where we can store a
	 * freshly allocated string with the name of the output pad.
	 *
	 * @return Return value: (transfer none): the node providing data
	 * or NULL if no node is connected to the input_pad.
	 */
	GeglNode  gegl_node_get_producer (GeglNode  node,
			String input_pad_name,
			PointerByReference output_pad_name);

	/**
	 * gegl_node_has_pad:
	 * @param node the node we are querying
	 * @param pad_name the pad name we are looking for
	 *
	 * @return Returns TRUE if the node has a pad with the specified name
	 */
	boolean gegl_node_has_pad (GeglNode node,
			String pad_name);

	/**
	 * gegl_node_list_input_pads:
	 * @param node the node we are querying
	 *
	 * If the node has any input pads this function returns a null terminated
	 * array of pad names, otherwise it returns NULL. The return value can be
	 * freed with g_strfreev().
	 *
	 * @return Return value: (transfer full) (array zero-terminated=1)
	 */
	String[] gegl_node_list_input_pads (GeglNode node);

	/**
	 * gegl_node_list_output_pads:
	 * @param node the node we are querying
	 *
	 * If the node has any output pads this function returns a null terminated
	 * array of pad names, otherwise it returns NULL. The return value can be
	 * freed with g_strfreev().
	 *
	 * @return Return value: (transfer full) (array zero-terminated=1)
	 */
	String[] gegl_node_list_output_pads (GeglNode node);

	/***
	 * Binding conveniences:
	 *
	 * The following functions are mostly included to make it easier to create
	 * language bindings for the nodes. The varargs versions will in most cases
	 * lead to both more efficient and readable code from C.
	 */

	/**
	 * gegl_node_create_child:
	 * @param parent a #GeglNode
	 * @param operation the type of node to create.
	 *
	 * Creates a new processing node that performs the specified operation.
	 * All properties of the operation will have their default values. This
	 * is included as an addiiton to #gegl_node_new_child in the public API to have
	 * a non varargs entry point for bindings as well as sometimes simpler more
	 * readable code.
	 *
	 * @return Return value: (transfer none):a newly created node. The node will be destroyed by the parent.
	 * Calling g_object_unref on a node will cause the node to be dropped by the
	 * parent. (You may also add additional references using
	 * g_object_ref/g_object_unref, but in general relying on the parents reference
	 * counting is easiest.)
	 */

	GeglNode  gegl_node_create_child (GeglNode parent,
			String operation);


	/**
	 * gegl_node_get_property: (skip)
	 * @param node the node to get a property from
	 * @param property_name the name of the property to get
	 * @param value (out): pointer to a GValue where the value of the property should be stored
	 *
	 * This is mainly included for language bindings. Using #gegl_node_get is
	 * more convenient when programming in C.
	 *
	 */
	void gegl_node_get_property (GeglNode node,
			String property_name,
			GValue value);

	/**
	 * gegl_node_set_property:
	 * @param node a #GeglNode
	 * @param property_name the name of the property to set
	 * @param value (in): a GValue containing the value to be set in the property.
	 *
	 * This is mainly included for language bindings. Using #gegl_node_set is
	 * more convenient when programming in C.
	 */
	void gegl_node_set_property (GeglNode node,
			String property_name,
			GValue value);

	/***
	 * XML:
	 * The XML format used by GEGL is not stable and should not be relied on
	 * for anything but testing purposes yet.
	 */

	/**
	 * gegl_node_new_from_xml:
	 * @param xmldata a \0 terminated string containing XML data to be parsed.
	 * @param path_root a file system path that relative paths in the XML will be
	 * resolved in relation to.
	 *
	 * The #GeglNode returned contains the graph described by the tree of stacks
	 * in the XML document. The tree is connected to the "output" pad of the
	 * returned node and thus can be used directly for processing.
	 *
	 * @return Return value: (transfer full): a GeglNode containing the parsed XML as a subgraph.
	 */
	GeglNode  gegl_node_new_from_xml (String xmldata,
			String path_root);

	/**
	 * gegl_node_new_from_file:
	 * @param path the path to a file on the local file system to be parsed.
	 *
	 * The #GeglNode returned contains the graph described by the tree of stacks
	 * in the XML document. The tree is connected to the "output" pad of the
	 * returned node and thus can be used directly for processing.
	 *
	 * @return Return value: (transfer full): a GeglNode containing the parsed XML as a subgraph.
	 */
	GeglNode  gegl_node_new_from_file (String path);

	/**
	 * gegl_node_to_xml:
	 * @param node a #GeglNode
	 * @param path_root filesystem path to construct relative paths from.
	 *
	 * @return Returns a freshly allocated \0 terminated string containing a XML
	 * serialization of the composition produced by a node (and thus also
	 * the nodes contributing data to the specified node). To export a
	 * gegl graph, connect the internal output node to an output proxy (see
	 * #gegl_node_get_output_proxy.) and use the proxy node as the basis
	 * for the serialization.
	 */
	String gegl_node_to_xml (GeglNode node,String path_root);

	/**
	 * @param node
	 * @return
	 */
	boolean gegl_node_get_passthrough ( GeglNode node);

	/**
	 * @param node
	 * @param passthrough
	 */
	void gegl_node_set_passthrough (GeglNode node, boolean passthrough);


	/***
	 * GeglColor:
	 *
	 * GeglColor is an object containing a color at the moment only RGB colors
	 * are supported, in the future a GeglColor might also indicate other
	 * enumerated or natively in other color representations colors.
	 *
	 * GeglColor accepts a subset of format string as defined by the CSS color specification:
	 *  http://dev.w3.org/csswg/css-color/
	 *
	 * - RGB hexadecimal notation: #rrggbb[aa] / #rgb[a]
	 * - Named colors, limited to the 16 specified in HTML4
	 * 
	 * To specify linear-light floating-point RGB, use: rgb[a](0.40, 0.44, 0.92 [, a])
	 * The normal bounds are [0.0 1.0], unlike CSS which is [0 255]. Out-of-bounds values are allowed.
	 */

	/**
	 * gegl_color_new:
	 * @param string a string describing the color to be created.
	 *
	 * Creates a new #GeglColor.
	 *
	 * @return Returns the newly created #GeglColor.
	 */
	GeglColor gegl_color_new(String string);

	/**
	 * gegl_color_duplicate:
	 * @param color the color to duplicate.
	 *
	 * Creates a copy of @color.
	 *
	 * @return Return value: (transfer full): A new copy of @color.
	 */
	GeglColor  gegl_color_duplicate(GeglColor color);

	/**
	 * gegl_color_get_rgba:
	 * @param color a #GeglColor
	 * @param red (out): red return location.
	 * @param green (out): green return location.
	 * @param blue (out): blue return location.
	 * @param alpha (out): alpha return location.
	 *
	 * Retrieves the current set color as linear light non premultipled RGBA data,
	 * any of the return pointers can be omitted.
	 */
	void gegl_color_get_rgba(GeglColor color,
			DoubleByReference red,
			DoubleByReference green,
			DoubleByReference blue,
			DoubleByReference alpha);

	/**
	 * gegl_color_set_rgba:
	 * @param color a #GeglColor
	 * @param red red value
	 * @param green green value
	 * @param blue blue value
	 * @param alpha alpha value
	 *
	 * Retrieves the current set color as linear light non premultipled RGBA data
	 */
	void gegl_color_set_rgba(GeglColor color,
			double      red,
			double      green,
			double      blue,
			double      alpha);
	/**
	 * gegl_color_set_pixel: (skip)
	 * @param color a #GeglColor
	 * @param format a babl pixel format
	 * @param pixel pointer to a pixel
	 *
	 * Set a GeglColor from a pointer to a pixel and it's babl format.
	 */
	void gegl_color_set_pixel(GeglColor color, BablFormat format, Pointer pixel);
	/**
	 * gegl_color_get_pixel: (skip)
	 * @param color a #GeglColor
	 * @param format a babl pixel format
	 * @param pixel pointer to a pixel
	 *
	 * Store the color in a pixel in the given format.
	 */
	void gegl_color_get_pixel(GeglColor color, BablFormat format, Pointer pixel);

	/**
	 * @return *
	 */

	//#define GEGL_TYPE_PARAM_COLOR           (gegl_param_color_get_type ())
	//#define GEGL_IS_PARAM_SPEC_COLOR(pspec) (G_TYPE_CHECK_INSTANCE_TYPE ((pspec), GEGL_TYPE_PARAM_COLOR))

	GType gegl_param_color_get_type();

	/**
	 * gegl_param_spec_color:
	 * @param name canonical name of the property specified
	 * @param nick nick name for the property specified
	 * @param blurb description of the property specified
	 * @param default_color the default value for the property specified
	 * @param flags flags for the property specified
	 *
	 * Creates a new #GParamSpec instance specifying a #GeglColor property.
	 *
	 * @return Returns: (transfer full): a newly created parameter specification
	 */
	GParamSpec gegl_param_spec_color(String  name,
			String nick,
			String blurb,
			GeglColor default_color,
			int   flags);

	/**
	 * gegl_param_spec_color_from_string:
	 * @param name canonical name of the property specified
	 * @param nick nick name for the property specified
	 * @param blurb description of the property specified
	 * @param default_color_string the default value for the property specified
	 * @param flags flags for the property specified
	 *
	 * Creates a new #GParamSpec instance specifying a #GeglColor property.
	 *
	 * @return Returns: (transfer full): a newly created parameter specification
	 */
	GParamSpec gegl_param_spec_color_from_string (String name,
			String nick,
			String blurb,
			String default_color_string,
			int flags);
	/**
	 * gegl_param_spec_color_get_default:
	 * @param self a #GeglColor #GParamSpec
	 *
	 * Get the default color value of the param spec
	 *
	 * @return Returns: (transfer none): the default #GeglColor
	 */
	GeglColor gegl_param_spec_color_get_default (GParamSpec self);


	/***
	 * GeglBuffer:
	 *
	 * GeglBuffer is the API used by GEGL for storing and retrieving raster data.
	 * GeglBuffer heavily relies on babl for translation and description of
	 * different pixel formats.
	 *
	 * Internally GeglBuffer currently uses a tiled mipmap pyramid structure that
	 * can be swapped to disk. In the future GeglBuffer might also support a linear
	 * backend, a GPU memory backend and a network backend for buffers.
	 */

	/**
	 * gegl_buffer_new: (skip)
	 * @param extent the geometry of the buffer (origin, width and height) a
	 * GeglRectangle.
	 * @param format the Babl pixel format to be used, create one with babl_format("RGBA
	 * u8") and similar.
	 *
	 * Create a new GeglBuffer of a given format with a given extent. It is
	 * possible to pass in NULL for both extent and format, a NULL extent creates
	 * an empty buffer and a NULL format makes the buffer default to "RGBA float".
	 * 
	 * @return a new GeglBuffer
	 */
	GeglBuffer gegl_buffer_new(GeglRectangle extent, TypedPointer<BablFormat> format);

	/**
	 * gegl_buffer_new_for_backend:
	 * @param extent the geometry of the buffer (origin, width and height) a
	 * GeglRectangle.
	 * @param backend an instance of a GeglTileBackend subclass.
	 *
	 * Create a new GeglBuffer from a backend, if NULL is passed in the extent of
	 * the buffer will be inherited from the extent of the backend.
	 *
	 * @return a GeglBuffer, that holds a reference to the provided backend.
	 */
	GeglBuffer gegl_buffer_new_for_backend(GeglRectangle extent, GeglTileBackend backend);

	/**
	 * gegl_buffer_add_handler:
	 * @param buffer a #GeglBuffer
	 * @param handler a #GeglTileHandler
	 *
	 * Add a new tile handler in the existing chain of tile handler of a GeglBuffer.
	 */
	void gegl_buffer_add_handler(GeglBuffer buffer, Pointer handler);

	/**
	 * gegl_buffer_remove_handler:
	 * @param buffer a #GeglBuffer
	 * @param handler a #GeglTileHandler
	 *
	 * Remove the provided tile handler in the existing chain of tile handler of a GeglBuffer.
	 */
	void gegl_buffer_remove_handler(GeglBuffer buffer, Pointer handler);

	/**
	 * gegl_buffer_open:
	 * @param path the path to a gegl buffer on disk.
	 *
	 * Open an existing on-disk GeglBuffer, this buffer is opened in a monitored
	 * state so multiple instances of gegl can share the same buffer. Sets on
	 * one buffer are reflected in the other.
	 *
	 * @return Returns: (transfer full): a GeglBuffer object.
	 */
	GeglBuffer gegl_buffer_open(String path);

	/**
	 * gegl_buffer_save:
	 * @param buffer (transfer none): a #GeglBuffer.
	 * @param path the path where the gegl buffer will be saved, any writable GIO uri is valid.
	 * @param roi the region of interest to write, this is the tiles that will be collected and
	 * written to disk.
	 *
	 * Write a GeglBuffer to a file.
	 */
	void gegl_buffer_save(GeglBuffer buffer, String path, GeglRectangle roi);

	/**
	 * gegl_buffer_load:
	 * @param path the path to a gegl buffer on disk.
	 *
	 * Loads an existing GeglBuffer from disk, if it has previously been saved with
	 * gegl_buffer_save it should be possible to open through any GIO transport, buffers
	 * that have been used as swap needs random access to be opened.
	 *
	 * @return Returns: (transfer full): a #GeglBuffer object.
	 */
	GeglBuffer gegl_buffer_load(String path);

	/**
	 * gegl_buffer_flush:
	 * @param buffer a #GeglBuffer
	 *
	 * Flushes all unsaved data to disk, this is not neccesary for shared
	 * geglbuffers opened with gegl_buffer_open since they auto-sync on writes.
	 */
	void            gegl_buffer_flush             (GeglBuffer          buffer);


	/**
	 * gegl_buffer_create_sub_buffer:
	 * @param buffer (transfer none): parent buffer.
	 * @param extent (transfer none): coordinates of new buffer.
	 *
	 * Create a new sub GeglBuffer, that is a view on a larger buffer.
	 *
	 * @return Return value: (transfer full): the new sub buffer
	 */
	GeglBuffer gegl_buffer_create_sub_buffer (GeglBuffer buffer, GeglRectangle extent);

	/**
	 * gegl_buffer_get_extent:
	 * @param buffer the buffer to operate on.
	 *
	 * @return Returns a pointer to a GeglRectangle structure defining the geometry of a
	 * specific GeglBuffer, this is also the default width/height of buffers passed
	 * in to gegl_buffer_set and gegl_buffer_get (with a scale of 1.0 at least).
	 */
	GeglRectangle gegl_buffer_get_extent (GeglBuffer buffer);


	/**
	 * gegl_buffer_set_extent:
	 * @param buffer the buffer to operate on.
	 * @param extent new extent.
	 *
	 * Changes the size and position that is considered active in a buffer, this
	 * operation is valid on any buffer, reads on subbuffers outside the master
	 * buffer's extent are at the moment undefined.
	 *
	 * @return Returns TRUE if the change of extent was succesful.
	 */
	boolean gegl_buffer_set_extent(GeglBuffer buffer, GeglRectangle extent);

	/**
	 * gegl_buffer_set_abyss:
	 * @param buffer the buffer to operate on.
	 * @param abyss new abyss.
	 *
	 * Changes the size and position of the abyss rectangle of a buffer.
	 *
	 * @return Returns TRUE if the change of abyss was succesful.
	 */
	boolean gegl_buffer_set_abyss(GeglBuffer buffer, GeglRectangle abyss);


	/**
	 * gegl_buffer_get_pixel_count:
	 * @buffer: a GeglBuffer
	 *
	 * Returns the number of pixels of the extent of the buffer.
	 */
	//#define gegl_buffer_get_pixel_count(buffer) (gegl_buffer_get_width(buffer) * gegl_buffer_get_height(buffer))

	/**
	 * gegl_buffer_get: (skip)
	 * @param buffer the buffer to retrieve data from.
	 * @param rect the coordinates we want to retrieve data from, and width/height of
	 * destination buffer, if NULL equal to the extent of the buffer. The
	 * coordinates and dimensions are after scale has been applied.
	 * @param scale sampling scale, 1.0 = pixel for pixel 2.0 = magnify, 0.5 scale down.
	 * @param format the BablFormat to store in the linear buffer @dest.
	 * @param dest the memory destination for a linear buffer for the pixels, the size needed
	 * depends on the requested BablFormat.
	 * @param rowstride rowstride in bytes, or GEGL_AUTO_ROWSTRIDE to compute the
	 * rowstride based on the width and bytes per pixel for the specified format.
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Fetch a rectangular linear buffer of pixel data from the GeglBuffer, the
	 * data is converted to the desired BablFormat, if the BablFormat stored and
	 * fetched is the same this amounts to a series of memcpy's aligned to demux
	 * the tile structure into a linear buffer.
	 */
	void            gegl_buffer_get               (GeglBuffer buffer,
			GeglRectangle rect,
			double              scale,
			BablFormat format,
			byte[]             dest,
			int                 rowstride,
			int      repeat_mode);

	/**
	 * gegl_buffer_set: (skip)
	 * @param buffer the buffer to modify.
	 * @param rect the coordinates we want to change the data of and the width/height of
	 * the linear buffer being set, scale specifies the scaling factor applied to
	 * the data when setting.
	 * @param scale_level the scale level being set, 0 = 1:1 = default = base mipmap level,
	 * 1 = 1:2, 2=1:4, 3=1:8 ..
	 * @param format the babl_format the linear buffer src.
	 * @param src linear buffer of image data to be stored in buffer.
	 * @param rowstride rowstride in bytes, or GEGL_AUTO_ROWSTRIDE to compute the
	 * rowstride based on the width and bytes per pixel for the specified format.
	 *
	 * Store a linear raster buffer into the GeglBuffer.
	 */
	void            gegl_buffer_set               (GeglBuffer buffer,
			GeglRectangle rect,
			int                 scale_level,
			BablFormat          format,
			Pointer src,
			int                 rowstride);


	/**
	 * gegl_buffer_set_color:
	 * @param buffer a #GeglBuffer
	 * @param rect a rectangular region to fill with a color.
	 * @param color the GeglColor to fill with.
	 *
	 * Sets the region covered by rect to the specified color.
	 */
	void            gegl_buffer_set_color         (GeglBuffer          buffer,
			GeglRectangle rect,
			GeglColor           color);


	/**
	 * gegl_buffer_set_pattern:
	 * @param buffer a #GeglBuffer
	 * @param rect the region of @buffer to fill
	 * @param pattern a #GeglBuffer to be repeated as a pattern
	 * @param x_offset where the pattern starts horizontally
	 * @param y_offset where the pattern starts vertical
	 *
	 * Fill a region with a repeating pattern. Offsets parameters are
	 * relative to the origin (0, 0) and not to the rectangle. So be carefull
	 * about the origin of @pattern and @buffer extents.
	 */
	void            gegl_buffer_set_pattern       (GeglBuffer          buffer,
			GeglRectangle rect,
			GeglBuffer          pattern,
			int                 x_offset,
			int                 y_offset);

	/**
	 * gegl_buffer_get_format: (skip)
	 * @param buffer a #GeglBuffer
	 *
	 * Get the babl format of the buffer, this might not be the format the buffer
	 * was originally created with, you need to use gegl_buffer_set_format (buf,
	 * NULL); to retireve the original format (potentially having save away the
	 * original format of the buffer to re-set it.)
	 *
	 * @return the babl format used for storing pixels in the buffer.
	 *
	 */
	BablFormat gegl_buffer_get_format(GeglBuffer buffer);


	/**
	 * gegl_buffer_set_format: (skip)
	 * @param buffer a #GeglBuffer
	 * @param format the new babl format, must have same bpp as original format.
	 *
	 * Set the babl format of the buffer, setting the babl format of the buffer
	 * requires the new format to have exactly the same bytes per pixel as the
	 * original format. If NULL is passed in the format of the buffer is reset to
	 * the original format.
	 *
	 * @return the new babl format or NULL if it the passed in buffer was
	 * incompatible (then the original format is still used).
	 */
	BablFormat gegl_buffer_set_format        (GeglBuffer buffer,
			BablFormat format);

	/**
	 * gegl_buffer_clear:
	 * @param buffer a #GeglBuffer
	 * @param roi a rectangular region
	 *
	 * Clears the provided rectangular region by setting all the associated memory
	 * to 0
	 */
	void            gegl_buffer_clear             (GeglBuffer          buffer,
			GeglRectangle roi);


	/**
	 * gegl_buffer_copy:
	 * @param src (transfer none): source buffer.
	 * @param src_rect source rectangle (or NULL to copy entire source buffer)
	 * @param repeat_mode the abyss policy to be using if src_rect is outside src's extent.
	 * @param dst (transfer none): destination buffer.
	 * @param dst_rect position of upper left destination pixel, or NULL for top
	 * left coordinates of the buffer extents.
	 *
	 * copies a region from source buffer to destination buffer.
	 *
	 * If the babl_formats of the buffers are the same, and the tile boundaries
	 * align, this will create copy-on-write tiles in the destination buffer.
	 *
	 * This function never does any scaling. When src_rect and dst_rect do not have
	 * the same width and height, the size of src_rect is used.
	 */
	void            gegl_buffer_copy              (GeglBuffer src,
			GeglRectangle src_rect,
			GeglAbyssPolicy      repeat_mode,
			GeglBuffer dst,
			GeglRectangle dst_rect);



	/**
	 * gegl_buffer_dup:
	 * @param buffer (transfer none): the GeglBuffer to duplicate.
	 *
	 * Duplicate a buffer (internally uses gegl_buffer_copy). Aligned tiles
	 * will create copy-on-write clones in the new buffer.
	 *
	 * @return Return value: (transfer full): the new buffer
	 */
	GeglBuffer gegl_buffer_dup(GeglBuffer buffer);


	/**
	 * gegl_buffer_sample_at_level: (skip)
	 * @param buffer the GeglBuffer to sample from
	 * @param x x coordinate to sample in buffer coordinates
	 * @param y y coordinate to sample in buffer coordinates
	 * @param scale a matrix that indicates scaling factors, see
	 * gegl_sampler_compute_scale the same.
	 * @param dest buffer capable of storing one pixel in @format.
	 * @param format the format to store the sampled color in.
	 * @param level mipmap level to sample from (@x and @y are level 0 coordinates)
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Query interpolate pixel values at a given coordinate using a specified form
	 * of interpolation. The samplers used cache for a small neighbourhood of the
	 * buffer for more efficient access.
	 */

	void              gegl_buffer_sample_at_level (GeglBuffer       buffer,
			double           x,
			double           y,
			GeglMatrix2      scale,
			Pointer          dest,
			BablFormat       format,
			int              level,
			GeglSamplerType   sampler_type,
			GeglAbyssPolicy   repeat_mode);

	/**
	 * gegl_buffer_sample: (skip)
	 * @param buffer the GeglBuffer to sample from
	 * @param x x coordinate to sample in buffer coordinates
	 * @param y y coordinate to sample in buffer coordinates
	 * @param scale a matrix that indicates scaling factors, see
	 * gegl_sampler_compute_scale the same.
	 * @param dest buffer capable of storing one pixel in format.
	 * @param format the format to store the sampled color in.
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Query interpolate pixel values at a given coordinate using a specified form
	 * of interpolation. The samplers used cache for a small neighbourhood of the
	 * buffer for more efficient access.
	 */
	void              gegl_buffer_sample          (GeglBuffer       buffer,
			double           x,
			double           y,
			GeglMatrix2      scale,
			Pointer          dest,
			BablFormat       format,
			GeglSamplerType   sampler_type,
			GeglAbyssPolicy   repeat_mode);



	/**
	 * gegl_buffer_sample_cleanup:
	 * @param buffer the GeglBuffer to sample from
	 *
	 * Clean up resources used by sampling framework of buffer (will be freed
	 * automatically later when the buffer is destroyed, for long lived buffers
	 * cleaning up the sampling infrastructure when it has been used for its
	 * purpose will sometimes be more efficient).
	 */
	void gegl_buffer_sample_cleanup(GeglBuffer buffer);

	/*
typedef void (*GeglSamplerGetFun)  (GeglSampler     *self,
                                    gdouble          x,
                                    gdouble          y,
                                    GeglMatrix2     *scale,
                                    void            *output,
                                    GeglAbyssPolicy  repeat_mode);
	 */
	/**
	 * gegl_sampler_get_fun: (skip)
	 */
	/*
GeglSamplerGetFun gegl_sampler_get_fun (GeglSampler *sampler);
	 */

	/**
	 * gegl_buffer_sampler_new: (skip)
	 * @param buffer buffer to create a new sampler for
	 * @param format format we want data back in
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 *
	 * @return Create a new sampler, when you are done with the sampler, g_object_unref
	 * it.
	 *
	 * Samplers only hold weak references to buffers, so if its buffer is freed
	 * the sampler will become invalid.
	 */
	GeglSampler gegl_buffer_sampler_new(GeglBuffer buffer, BablFormat format, GeglSamplerType   sampler_type);

	/**
	 * gegl_buffer_sampler_new_at_level: (skip)
	 * @param buffer buffer to create a new sampler for
	 * @param format format we want data back in
	 * @param sampler_type the sampler type to use,
	 * to be ported from working code. Valid values: GEGL_SAMPLER_NEAREST,
	 * GEGL_SAMPLER_LINEAR, GEGL_SAMPLER_CUBIC, GEGL_SAMPLER_NOHALO and
	 * GEGL_SAMPLER_LOHALO
	 * @param level the mipmap level to create a sampler for
	 *
	 * @return Create a new sampler, when you are done with the sampler, g_object_unref
	 * it.
	 *
	 * Samplers only hold weak references to buffers, so if its buffer is freed
	 * the sampler will become invalid.
	 */
	GeglSampler gegl_buffer_sampler_new_at_level (GeglBuffer buffer,
			BablFormat format,
			GeglSamplerType   sampler_type,
			int              level);


	/**
	 * gegl_sampler_get:
	 * @param sampler a GeglSampler gotten from gegl_buffer_sampler_new
	 * @param x x coordinate to sample
	 * @param y y coordinate to sample
	 * @param scale matrix representing extent of sampling area in source buffer.
	 * @param output memory location for output data.
	 * @param repeat_mode how requests outside the buffer extent are handled.
	 * Valid values: GEGL_ABYSS_NONE (abyss pixels are zeroed), GEGL_ABYSS_WHITE
	 * (abyss pixels are white), GEGL_ABYSS_BLACK (abyss pixels are black),
	 * GEGL_ABYSS_CLAMP (coordinates are clamped to the abyss rectangle),
	 * GEGL_ABYSS_LOOP (buffer contents are tiled if outside of the abyss rectangle).
	 *
	 * Perform a sampling with the provided @sampler.
	 */
	void              gegl_sampler_get            (GeglSampler sampler,
			double         x,
			double         y,
			GeglMatrix2 scale,
			Pointer           output,
			GeglAbyssPolicy repeat_mode);

	/* code template utility, updates the jacobian matrix using
	 * a user defined mapping function for displacement, example
	 * with an identity transform (note that for the identity
	 * transform this is massive computational overhead that can
	 * be skipped by passing NULL to the sampler.
	 *
	 * #define gegl_unmap(x,y,dx,dy) { dx=x; dy=y; }
	 *
	 * gegl_sampler_compute_scale (scale, x, y);
	 * gegl_unmap(x,y,sample_x,sample_y);
	 * gegl_buffer_sample (buffer, sample_x, sample_y, scale, dest, format,
	 *                     GEGL_SAMPLER_LOHALO);
	 *
	 * #undef gegl_unmap      // IMPORTANT undefine map macro
	 */
	/*
#define gegl_sampler_compute_scale(matrix, x, y) \
{                                       \
  float ax, ay, bx, by;                 \
  gegl_unmap(x + 0.5, y, ax, ay);       \
  gegl_unmap(x - 0.5, y, bx, by);       \
  matrix.coeff[0][0] = ax - bx;         \
  matrix.coeff[1][0] = ay - by;         \
  gegl_unmap(x, y + 0.5, ax, ay);       \
  gegl_unmap(x, y - 0.5, bx, by);       \
  matrix.coeff[0][1] = ax - bx;         \
  matrix.coeff[1][1] = ay - by;         \
}
	 */

	/**
	 * gegl_sampler_get_context_rect:
	 * @param sampler a GeglSampler gotten from gegl_buffer_sampler_new
	 *
	 * @return Returns:The context rectangle of the given @sampler.
	 */
	GeglRectangle  gegl_sampler_get_context_rect (GeglSampler sampler);

	/**
	 * gegl_buffer_linear_new: (skip)
	 * @param extent dimensions of buffer.
	 * @param format desired pixel format.
	 *
	 * Creates a GeglBuffer backed by a linear memory buffer, of the given
	 * @extent in the specified @format. babl_format ("R'G'B'A u8") for instance
	 * to make a normal 8bit buffer.
	 *
	 * @return Returns: a GeglBuffer that can be used as any other GeglBuffer.
	 */
	GeglBuffer gegl_buffer_linear_new          (GeglRectangle extent,
			BablFormat format);

	/**
	 * gegl_buffer_linear_new_from_data: (skip)
	 * @param data a pointer to a linear buffer in memory.
	 * @param format the format of the data in memory
	 * @param extent the dimensions (and upper left coordinates) of linear buffer.
	 * @param rowstride the number of bytes between rowstarts in memory (or 0 to
	 *             autodetect)
	 * @param destroy_fn function to call to free data or NULL if memory should not be
	 *              freed.
	 * @param destroy_fn_data extra argument to be passed to void destroy(ptr, data) type
	 *              function.
	 *
	 * @return Creates a GeglBuffer backed by a linear memory buffer that already exists,
	 * of the given @extent in the specified @format. babl_format ("R'G'B'A u8")
	 * for instance to make a normal 8bit buffer.
	 *
	 * Returns: a GeglBuffer that can be used as any other GeglBuffer.
	 */
	GeglBuffer gegl_buffer_linear_new_from_data (Pointer       data,
			BablFormat          format,
			GeglRectangle extent,
			int                 rowstride,
			GDestroyNotify       destroy_fn,
			Pointer             destroy_fn_data);

	/**
	 * gegl_buffer_linear_open: (skip)
	 * @param buffer a #GeglBuffer.
	 * @param extent region to open, pass NULL for entire buffer.
	 * @param rowstride return location for rowstride.
	 * @param format desired format or NULL to use buffers format.
	 *
	 * Raw direct random access to the full data of a buffer in linear memory.
	 *
	 * @return Returns: a pointer to a linear memory region describing the buffer, if the
	 * request is compatible with the underlying data storage direct access
	 * to the underlying data is provided. Otherwise, it returns a copy of the data.
	 */
	Pointer        gegl_buffer_linear_open       (GeglBuffer          buffer,
			GeglRectangle extent,
			int                rowstride,
			BablFormat          format);

	/**
	 * gegl_buffer_linear_close:
	 * @param buffer a #GeglBuffer.
	 * @param linear a previously returned buffer.
	 *
	 * This function makes sure GeglBuffer and underlying code is aware of changes
	 * being made to the linear buffer. If the request was not a compatible one
	 * it is written back to the buffer. Multiple concurrent users can be handed
	 * the same buffer (both raw access and converted).
	 */
	void            gegl_buffer_linear_close      (GeglBuffer    buffer,
			Pointer       linear);


	/**
	 * gegl_buffer_get_abyss:
	 * @param buffer a #GeglBuffer.
	 *
	 * @return Return the abyss extent of a buffer, this expands out to the parents extent in
	 * subbuffers.
	 */
	GeglRectangle gegl_buffer_get_abyss   (GeglBuffer           buffer);



	/**
	 * gegl_buffer_signal_connect:
	 * @param buffer a GeglBuffer
	 * @param detailed_signal only "changed" expected for now
	 * @param c_handler (scope async) : c function callback
	 * @param data user data:
	 *
	 * This function should be used instead of g_signal_connect when connecting to
	 * the GeglBuffer::changed signal handler, GeglBuffer contains additional
	 * machinery to avoid the overhead of changes when no signal handler have been
	 * connected, if regular g_signal_connect is used; then no signals will be
	 * emitted.
	 *
	 * @return Returns: an handle like g_signal_connect.
	 */
	long gegl_buffer_signal_connect (GeglBuffer buffer,
			String detailed_signal,
			GCallback   c_handler,
			Pointer    data);
}
