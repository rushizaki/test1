package com.test1.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test1resource")
public class Test1Resource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayTest1() {
		return "Say Test1!";
	}
}
