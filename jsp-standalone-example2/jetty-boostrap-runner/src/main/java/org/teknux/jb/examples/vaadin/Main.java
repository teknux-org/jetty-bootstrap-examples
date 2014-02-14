package org.teknux.jb.examples.vaadin;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;


public class Main {

	/**
	 * @see JettyBootstrap.startSelf()
	 */
	public static void main(String[] args) {
		try {
			// create the jetty boostrap object
			JettyBootstrap jBootstrap = new JettyBootstrap();
			// we are embedding the war inside our jar under the "webapp" directory with Maven
			jBootstrap.addWarAppFromClasspath("/webapp.war");
			// start the server
			jBootstrap.startServer();

			// All those lines can be replaced with JettyBootstrap.startSelf()
			
		} catch (JettyBootstrapException e) {
			e.printStackTrace(); // bad exception handling !
			System.exit(1);
		}
	}

}
