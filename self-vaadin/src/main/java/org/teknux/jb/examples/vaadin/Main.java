package org.teknux.jb.examples.vaadin;

import org.teknux.jettybootstrap.JettyBootstrap;
import org.teknux.jettybootstrap.JettyBootstrapException;


public class Main {

	public static void main(String[] args) {
		try {
			JettyBootstrap.startSelf();
			
		} catch (JettyBootstrapException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

}
