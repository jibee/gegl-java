

import com.jibee.gegl.BablFormat;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.filters.gegl.BufferSink;
import com.jibee.gegl.filters.gegl.RawLoad;
import com.jibee.gegl.priv.GeglRectangle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main{
	public static void main(String[] args)
	{
		Main p = new Main();
		p.test();
	}
	public void test() {

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
		GeglRectangle extent = loader.getBoundingBox();
		BablFormat b = BablFormat.of("RGBA u8");
		GeglBuffer buffer = com.jibee.gegl.Gegl.newBuffer(extent, b);
		Object x = buffer.get("x");
		saver.setBuffer(buffer);
		loader.Output().connectTo(saver.Input());
		//saver.process();
		byte[] data = loader.blit();
		float[] dataf = loader.blit_float();
		log.info("Datalenght = {}", data.length);
	}

}
