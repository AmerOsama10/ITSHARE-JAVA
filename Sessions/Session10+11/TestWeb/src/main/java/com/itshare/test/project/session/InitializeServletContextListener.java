package com.itshare.test.project.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class InitializeServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		
		ServletContext context = event.getServletContext();
		context.setAttribute("appName","IT share Applicaion" );
		
	}
	
}
