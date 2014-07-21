package org.teknux.jettybootstrap.examples.explodedwar;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
	    JettyBootstrap jettyBootstrap = new JettyBootstrap();
	    jettyBootstrap.addExplodedWarApp("static_war", null);
	    jettyBootstrap.startServer();
	}
}
