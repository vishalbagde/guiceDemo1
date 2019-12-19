package com.guice1;

import com.google.inject.AbstractModule;

public class TyreModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(Tyre.class).toInstance(new Tyre("MRF"));
	}

}
