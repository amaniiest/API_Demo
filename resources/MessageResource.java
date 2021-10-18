package com.aman.messenger.resources;


import java.util.List;

import com.aman.messenger.model.Message;
import com.aman.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		System.out.println("Inside:::::Resources::::");
		System.out.println("Messases::::::::::::"+messageService.getallMessages());
		return messageService.getallMessages();
	}

}
