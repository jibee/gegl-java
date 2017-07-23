GEGL Java mappings
==================

This is a java API to the GEGL image manipulation library. With this library (and interface) you can create image processing flows as a graph of operations through which the image(s) flow and produce the result image.

Usage example
=============

GeglNode root = Gegl.newNode();
RawLoad loader = new RawLoad().setPath(filename);
BufferSink saver = new BufferSink(rootNode);
GeglRectangle extent = new GeglRectangle(1000,1000);
Babl b = Babl.format("RGBA u8");
GeglBuffer buffer = newBuffer(extent, b);
saver.setBuffer(buffer);
loader.Output().connectTo(saver.Input());
//saver.process();
byte[] data = loader.blit();

TODO
====

Package binary libraries (gegl, babl)
Improve type mapping where gegl introspection says 'pointer'