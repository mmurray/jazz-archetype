package ${package}.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class WelcomeController {

	@GET
	@Produces({"text/html"})
	public Response front() {
		return Response.ok("yay!").build();
	}
}
