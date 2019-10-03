package com.serv;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")

public class MessageResource {
	
	MessageService service=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public List<Message1> getAll()
	{
		return service.getAllMessages();
	}
	
	@Path("/{id}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Message1 getM(@PathParam("id")int id)
	{
		return service.getMessageById(id);
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message1 addM(Message1 m)
	{
		
		return service.addMessage(m) ;
	}
	
	
	@Path("/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message1 delM(@PathParam("id")int id)
	{
		
		return service.delMessage(id) ;
	}
	@PUT
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message1 UpdateM(Message1 m)
	{
		
		return service.updateMessage(m) ;
	}


}
