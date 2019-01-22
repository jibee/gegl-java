

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jibee.gegl.Babl;
import com.jibee.gegl.BablFormat;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.OutputPad;
import com.jibee.gegl.filters.gegl.BufferSink;
import com.jibee.gegl.filters.gegl.JpgLoad;
import com.jibee.gegl.filters.gegl.Load;
import com.jibee.gegl.filters.gegl.RawLoad;
import com.jibee.gegl.priv.GeglRectangle;

public class Main{
	static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args)
	{
		Main p = new Main();
		p.test();
	}
	public void test() {
		// System.setProperty("jna.library.path","/home/jibee/Coding/gegl/3rdParty/lib:/usr/lib/x86_64-linux-gnu");

		GeglNode rootNode = com.jibee.gegl.Gegl.newNode();
		RawLoad loader = null;
		String filename = "/home/jibee/Images/IMG_4170.CR2";
		loader = new RawLoad(rootNode);
		loader.setPath(filename);
		/*
	       if(filename.toLowerCase().endsWith(".jpg"))
	       loader = new JpgLoad(rootNode).setPath(filename).Output();
	       else if(filename.toLowerCase().endsWith(".cr2")||filename.toLowerCase().endsWith(".nef"))
	       {
	       RawLoad rr = new RawLoad(rootNode).setPath(filename);
	       loader = rr.Output();
	       }
	       else
	       {
	       logger.error("No input filter for {}", filename);
	       return;
	       }
		 */
		BufferSink saver = new BufferSink(rootNode);
		GeglRectangle extent = new GeglRectangle(1000,1000);
		Babl b = BablFormat.of("RGBA u8");
		GeglBuffer buffer = com.jibee.gegl.Gegl.newBuffer(extent, b);
		Object x = buffer.get("x");
		saver.setBuffer(buffer);
		loader.Output().connectTo(saver.Input());
		//saver.process();
		byte[] data = loader.blit();
		System.out.println(data.length);
	}

}
