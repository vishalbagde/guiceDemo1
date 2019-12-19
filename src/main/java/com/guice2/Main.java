package com.guice2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class Main {
	
	public static void main(String[] args) {
		
		Injector injector=Guice.createInjector(new PlayerModule());
		Player player = injector.getInstance(Player.class);
		
	}

}
