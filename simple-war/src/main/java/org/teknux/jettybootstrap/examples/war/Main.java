package org.teknux.jettybootstrap.examples.war;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
	    JettyBootstrap jettyBootstrap = new JettyBootstrap();
	    jettyBootstrap.addWarApp("static.war", "/static");
	    jettyBootstrap.addWarApp("servlet.war","/servlet");
	    jettyBootstrap.startServer();
	}
}
