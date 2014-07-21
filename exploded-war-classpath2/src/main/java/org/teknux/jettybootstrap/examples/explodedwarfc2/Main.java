package org.teknux.jettybootstrap.examples.explodedwarfc2;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
	    JettyBootstrap jettyBootstrap = new JettyBootstrap();
	    jettyBootstrap.addExplodedWarAppFromClasspath("/webapp", null);
	    jettyBootstrap.startServer();
	}
}
