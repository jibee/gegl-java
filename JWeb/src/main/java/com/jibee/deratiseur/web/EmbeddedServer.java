package com.jibee.deratiseur.web;

import eu.webtoolkit.jwt.ServletInit;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.SessionTrackingMode;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.session.HashSessionManager;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class EmbeddedServer {

	public static void main(String[] args) throws Exception {
	//	BridJ.addLibraryPath("/home/jibee/Coding/Deratiseur/3rdParty/lib/");
	//	GeglLibrary g = new GeglLibrary();
	//	g.gegl_init(null, null);

		System.setProperty("jna.library.path","/home/jibee/Coding/Deratiseur/3rdParty/lib:/usr/lib/x86_64-linux-gnu");
        Server server = new Server(8080);
        
        
        // The ServletHandler is a dead simple way to create a context handler
        // that is backed by an instance of a Servlet.
        // This handler then needs to be registered with the Server object.
        ServletContextHandler handler = new ServletContextHandler();
        handler.addEventListener(new ServletInit());
        
        
        SessionHandler sessionHandler = new SessionHandler();
        handler.setSessionHandler(sessionHandler);
        HashSessionManager manager = new HashSessionManager();
        Set<SessionTrackingMode> modes = new HashSet<SessionTrackingMode>();
        modes.add(SessionTrackingMode.URL);
        manager.setSessionTrackingModes(modes);
        sessionHandler.setSessionManager(manager);
 
        // Passing in the class for the Servlet allows jetty to instantiate an
        // instance of that Servlet and mount it on a given context path.
 
        // IMPORTANT:
        // This is a raw Servlet, not a Servlet that has been configured
        // through a web.xml @WebServlet annotation, or anything similar.
        handler.addServlet(Servlet.class, "/*");
        server.setHandler(handler);
        server.start();
        server.dumpStdErr();
        server.join();
	}

}
