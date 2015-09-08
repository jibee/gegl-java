package com.jibee.deratiseur.web;

import javax.servlet.annotation.WebServlet;

import eu.webtoolkit.jwt.WApplication;
import eu.webtoolkit.jwt.WEnvironment;
import eu.webtoolkit.jwt.WtServlet;

@WebServlet(name="main",urlPatterns={"/*"}) 
public class Servlet extends WtServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -865112988471357959L;

	@Override
	public WApplication createApplication(WEnvironment env) {
		return new MainApplication(env);
	}

}
