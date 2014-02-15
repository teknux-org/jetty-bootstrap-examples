package org.teknux.jb.examples.vaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(value = "/*", asyncSupported = true)
@VaadinServletConfiguration(productionMode = false, ui = MyVaadinUI.class, widgetset = "org.teknux.jb.examples.vaadin.AppWidgetSet")
public class MyServlet extends VaadinServlet {
	private static final long serialVersionUID = -5824561528236642982L;

}
