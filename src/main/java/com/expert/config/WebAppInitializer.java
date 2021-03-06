package com.expert.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class, SpringConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic dispacher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        dispacher.setLoadOnStartup(1);

        dispacher.addMapping("/");
    }
}
