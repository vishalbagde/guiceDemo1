package com.guice2;

public class BadPlayer implements Player {
	
	@Override
	public void bat() {
		System.out.println("BadPlayer I can hit any ball");
		
	}
	@Override
	public void bowl() {
		System.out.println("BadPlayer I can also ball");
		
	}

}
