package org.teknux.jettybootstrap.examples.war;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;

public class Main {
	public static void main(String[] args) throws JettyBootstrapException {
		new JettyBootstrap().addWarApp("static.war", "/static").addWarApp("servlet.war","/servlet").startServer();
	}
}
