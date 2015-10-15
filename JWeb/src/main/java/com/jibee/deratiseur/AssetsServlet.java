package com.jibee.deratiseur;

import javax.servlet.annotation.WebServlet;

import org.eclipse.jetty.servlet.DefaultServlet;
@WebServlet(name="assets",urlPatterns={"/assets/*"}) 
public class AssetsServlet extends DefaultServlet {
	private static final long serialVersionUID = 534461556898194154L;

	public AssetsServlet() {
		super();
	}
	
	@Override
	public String getInitParameter(String name) {
		if(name.equals("resourceBase"))
			return "WebRoot";
		return super.getInitParameter(name);
	}

}
