package com.vishal.java;

import com.google.inject.Inject;

public class MyApplication {
	
	private MessageService messageService;
	
	@Inject
	public void setService(MessageService service)
	{
		messageService =service;
	}
	
	public boolean sendMessage(String msg,String rec)
	{
		return messageService.sendMessage(msg, rec);
	}

}
