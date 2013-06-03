package ${package};

import org.jazzframework.JazzFrameworkModule;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new JazzFrameworkModule());
	}

}
