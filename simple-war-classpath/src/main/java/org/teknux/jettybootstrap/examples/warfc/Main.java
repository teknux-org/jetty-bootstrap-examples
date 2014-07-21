package org.teknux.jettybootstrap.examples.warfc;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
	    JettyBootstrap jettyBootstrap = new JettyBootstrap();
	    jettyBootstrap.addWarAppFromClasspath("/static.war", "/static");
	    jettyBootstrap.addWarAppFromClasspath("/servlet.war","/servlet");
	    jettyBootstrap.startServer();
	}
}
