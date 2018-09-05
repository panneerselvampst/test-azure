package com.banking;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/ping")
public class Ping{
	
	@GET
	//@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		return Response.status(200).entity("Pong").build();
	}
	
	//test 
}
