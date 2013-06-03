package ${package}.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jazzframework.response.Result;

import com.google.inject.Inject;

@Path("/")
public class WelcomeController {

        @Inject Result result;

	@GET
	@Produces({"text/html"})
	public Result index() {
          return result;
	}
}
