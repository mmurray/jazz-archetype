package ${package};

import org.jazzframework.Environment;
import org.jazzframework.JazzFrameworkModule;
import org.jazzframework.Annotations.Global;
import org.jazzframework.response.Result;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class AppModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new JazzFrameworkModule());
	}

    @Provides
    @Global Result provideGlobalResult(Environment env) {
      Result result = new Result();
      // add global template values here...
      return result;
    }
}
