package com.serv;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/messages1")
public class Test
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage()
	{
		return "Hello Jersey";
	}

}