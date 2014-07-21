package org.teknux.jettybootstrap.examples.warfcmvnmultimodules;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
	    JettyBootstrap jettyBootstrap = new JettyBootstrap();
	    jettyBootstrap.addWarAppFromClasspath("/jetty-bootstrap-example-warfcmvnmultimodules-webapp.war");
	    jettyBootstrap.startServer();
	}
}
