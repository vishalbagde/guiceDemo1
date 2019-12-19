package com.guice1;

import com.google.inject.Inject;

public class Car  implements Vehicle{
	
	
	private Tyre tyre;
	
	@Inject
	public Car(Tyre tyre) {
		super();
		this.tyre = tyre;
	}

	public Tyre getTyre() {
		return tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	

	@Override
	public void drive() {
		System.out.println("car are drive with Tyre :"+tyre.brand);
	}
}
