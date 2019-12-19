package com.guice2;

public class GoodPlayer implements Player {
	
	@Override
	public void bat() {
		System.out.println("GoodPlayer I can hit any ball");		
	}
	@Override
	public void bowl() {
		System.out.println("GoodPlayer I can also ball");
	}

}
