package com.vishal.java;

import com.google.inject.Singleton;

@Singleton
public class EmailService implements MessageService {

	@Override
	public boolean sendMessage(String msg, String receipient) {
		
		System.out.println("Email message send to "+receipient+" with message "+msg);
		return true;
	}
	
}
