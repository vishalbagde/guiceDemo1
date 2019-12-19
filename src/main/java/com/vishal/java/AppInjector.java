package com.vishal.java;

import com.google.inject.AbstractModule;
import com.google.j2objc.annotations.AutoreleasePool;

public class AppInjector extends AbstractModule {
	
		
	@Override
	protected void configure() {
		//bind service to implement class
		//bind (MessageService.class).to(EmailService.class);
		bind(MessageService.class).to(EmailService.class);
		
		
	}

}
