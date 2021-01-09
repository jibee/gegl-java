package deratiseur;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jibee.gegl.BablFormat;
import com.jibee.gegl.GeglBuffer;
import com.jibee.gegl.GeglNode;
import com.jibee.gegl.filters.gegl.BufferSink;
import com.jibee.gegl.filters.gegl.RawLoad;
import com.jibee.gegl.priv.GeglRectangle;

public class Processor {
static Logger logger = LoggerFactory.getLogger(Processor.class);
	@Test
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
		GeglRectangle extent = new GeglRectangle(1000,1000);
		BablFormat b = BablFormat.of("RGBA u8");
		GeglBuffer buffer = com.jibee.gegl.Gegl.newBuffer(extent, b);
		saver.setBuffer(buffer);
		loader.Output().connectTo(saver.Input());
		//saver.process();
		byte[] data = loader.blit();
		System.out.println(data.length);
	}

}
