package com.guice1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.name.Names;

/*
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType.LOCAL_VARIABLE)
@interface TwoWheel{}


@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
@Target(ElementType.LOCAL_VARIABLE)
@interface FourWheel{}
*/

public class VehicleModule extends AbstractModule {
	
	@Override
	protected void configure() {
		//bind(Vehicle.class).annotatedWith(Names.named("FourWheel")).to(Car.class);
		//bind(Vehicle.class).annotatedWith(Names.named("TwoWheel")).to(Bike.class);
		
		bind(Vehicle.class).to(Car.class);
		
		bind(Tyre.class).toInstance(new Tyre("MRF"));
	}
}
