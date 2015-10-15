package com.jibee.deratiseur.processor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jibee.deratiseur.web.model.persistance.Factory;
import com.jibee.deratiseur.web.model.persistance.Render;
import com.jibee.deratiseur.web.model.persistance.Render.RenderStatus;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;

public class ImageProcessorServlet extends HttpServlet {
	
	private static final int CHUNK_SIZE = 4096;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getPathInfo();
		// Strip leading "/"
		if(path.startsWith("/"))
		{
			path = path.substring(1);
		}
		
		Render r = Factory.instance().getRenderByPublicHash(path);
		if(null==r)
		{
			serve404(resp);
			return;
		}
		RenderStatus status = r.atomicallyGetRenderStatus();
		if(RenderStatus.Pending==status)
		{
			ImageRenderer.instance().render(r);
			status = r.getStatus();
		}
		switch(status)
		{
		case Failed:
			serve404(resp);
			return;
		case InProgress:
			break;
		case Pending:
			break;
		case Succeeded:
			break;
		default:
			break;

		}
		if(null==r.getStorage())
		{
			serve404(resp);
			return;
		}
		switch(r.getStorage())
		{
		case FileSystem:
			serveFile(resp, r);
			break;
		case Mongo:
			serveMongoFile(resp, r);
			break;
		default:
			serve404(resp);
			break;
		}
		// TODO Auto-generated method stub
	}
	private void serveFile(HttpServletResponse resp, Render r) throws IOException
	{
		String path = r.getLocalAddress();
		try {
			FileInputStream in = new FileInputStream(path);
			resp.setContentType(r.getMimeType());
			resp.setStatus(HttpServletResponse.SC_FOUND);
			byte[] chunk = new byte[CHUNK_SIZE];
			int readBytes = 0;
			try
			{
			do{
				readBytes = in.read(chunk);
				resp.getOutputStream().write(chunk, 0, readBytes);
			}
			while(readBytes!=-1);
			}
			catch(Exception e)
			{
				
			}

		} catch (FileNotFoundException e) {
			serve404(resp);
			return;
		}
		
		// TODO Auto-generated method stub
		
	}
	public void serveMongoFile(HttpServletResponse resp, Render r) throws IOException {
		serve404(resp);
		/*
		MongoClient mongo = DocumentDB.instance().getDataStore().getMongo();
		GridFS fs = new GridFS(mongo.getDB("TR"));

		GridFSDBFile f = fs.findOne(path);
		if(null==f){
			serve404(resp);
			return;
		}
		resp.setContentType(f.getContentType());
		resp.setStatus(HttpServletResponse.SC_FOUND);
		byte[] chunk = new byte[CHUNK_SIZE];
		InputStream in = f.getInputStream();
		int readBytes = 0;
		try
		{
		do{
			readBytes = in.read(chunk);
			resp.getOutputStream().write(chunk, 0, readBytes);
		}
		while(readBytes!=-1);
		}
		catch(Exception e)
		{
			
		}
*/
	}
	private void serve404(HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getOutputStream().print("<html><head><title>Not found</title></head><body>Not found.</body></html>");
		resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
	}
}