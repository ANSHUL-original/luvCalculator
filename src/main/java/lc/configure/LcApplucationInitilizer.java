package lc.configure;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LcApplucationInitilizer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LcConfig.class);
		
		DispatcherServlet dispatcher=new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myDispatcherServlet= servletContext.addServlet("muCustomDispatherServlet", dispatcher);
		myDispatcherServlet.setLoadOnStartup(1);
		myDispatcherServlet.addMapping("/");
	}

}
