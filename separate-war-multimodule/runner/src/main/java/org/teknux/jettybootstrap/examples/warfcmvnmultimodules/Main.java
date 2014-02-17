package org.teknux.jettybootstrap.examples.warfcmvnmultimodules;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
		new JettyBootstrap().addWarAppFromClasspath("/jetty-bootstrap-example-warfcmvnmultimodules-webapp.war").startServer();
	}
}
