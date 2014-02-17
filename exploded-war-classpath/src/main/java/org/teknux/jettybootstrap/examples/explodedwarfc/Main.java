package org.teknux.jettybootstrap.examples.explodedwarfc;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
		new JettyBootstrap().addExplodedWarAppFromClasspath("/webapp", null)
				.startServer();
	}
}
