package org.teknux.jb.examples.vaadin;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;


public class Main {

	public static void main(String[] args) {
		try {
			JettyBootstrap jBootstrap = new JettyBootstrap();
			jBootstrap.addExplodedWarAppFromClasspath("", "WEB-INF/web.xml");
			jBootstrap.startServer();
			
		} catch (JettyBootstrapException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
