package  ${package};

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.JerseyServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.sun.jersey.spi.container.servlet.ServletContainer;

import java.util.HashMap;
import java.util.Map;

import org.jazzframework.JazzFrameworkModule;

public class GuiceServletConfig extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(
			new AppModule(),
			new JerseyServletModule() {
				protected void configureServlets() {
					// Route all requests through GuiceContainer
					Map<String, String> params = new HashMap<String, String>();
					params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "${package}.controllers");
					params.put(ServletContainer.PROPERTY_WEB_PAGE_CONTENT_REGEX, "/(css|js|images)/.*");
					filter("/*").through(GuiceContainer.class, params);
				}
			});
	}
}

