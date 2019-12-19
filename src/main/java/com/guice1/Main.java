package com.guice1;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Named;


public class Main {
public static void main(String[] args) {
		
	
	Injector injector =Guice.createInjector(new VehicleModule());
	Vehicle v =injector.getInstance(Vehicle.class);
	v.drive();
	
	
		
	/*
	Injector injector1 =Guice.createInjector(new TyreModule());
	Tyre t = injector1.getInstance(Tyre.class);
	System.out.println(t);
	*/
	
	
	}

}
