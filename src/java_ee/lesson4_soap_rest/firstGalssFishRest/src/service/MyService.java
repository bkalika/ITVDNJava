package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/MyRestService/{a}/{b}")
public class MyService {
	// path example: http://localhost:8080/firstGlassFishRest/rest/MyRestService/1/2
	
	@GET
	public String doGet(@PathParam("a") Integer a, @PathParam("b") Integer b) {
		Integer c = a + b;
		return c.toString();
	}

}
