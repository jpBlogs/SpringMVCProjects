package com.sample.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	 @Override
	 public void onStartup(ServletContext servletContext) {
		System.out.println("Initializing Application for " + servletContext.getServerInfo());

        // Creating ApplicationContext
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        // Register the Spring Configuration class
        applicationContext.register(SpringAppConfig.class);
        applicationContext.setServletContext(servletContext);

        // Add the servlet mapping 
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("mvc-dispatcher", dispatcherServlet);

        servlet.addMapping("/*");
	}
}
