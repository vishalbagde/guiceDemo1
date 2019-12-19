package com.guice1;

import com.google.inject.Inject;

public class Tyre {
	
	String brand;
	public Tyre() {
		
	}
	
	@Inject
	public Tyre(String brand) {
		this.brand=brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
	
	

}
