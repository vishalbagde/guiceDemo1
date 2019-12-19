package com.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

class DB1
{
	private String dbUrl;
	@Inject
	public DB1(@Named("jdbc")String dbUrl)
	{
		this.dbUrl=dbUrl;
	}
	public void getCon() {
		System.out.println(dbUrl);
	}
}

class DbModule1 extends AbstractModule{
	
	@Override
	protected void configure() {
		
		
	
		bind(String.class).annotatedWith(Names.named("jdbc")).toInstance("jdbc:postgresql://localhost:5432/test");
	}
}
public class ConstructorBinding {	
	public static void main(String[] args) {
		Injector injector =Guice.createInjector(new DbModule());
		DB1 b1=injector.getInstance(DB1.class);
		b1.getCon();	
	}
}
	