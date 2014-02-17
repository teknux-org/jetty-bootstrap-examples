package org.teknux.jettybootstrap.examples.explodedwar;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
		new JettyBootstrap().addExplodedWarApp("static_war", null).startServer();
	}
}
