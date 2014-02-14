package org.teknux.jettybootstrap.examples.warfc;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
		new JettyBootstrap().addWarAppFromClasspath("/static.war", "/static").addWarAppFromClasspath("/servlet.war","/servlet").startServer();
	}
}
