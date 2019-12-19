package com.guice;

import java.util.logging.Logger;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

class MyLogger{
	
	Logger logger;
	
	@Inject
	public MyLogger(Logger logger) {
		this.logger=logger;
	}
	
	public void loggerMethod()
	{
		logger.info("In Mylogger class LoggerMethod()");
	}
}


class MyLoggerModule extends AbstractModule{
	
	@Override
	protected void configure() {
	}
}

public class InBuiltBindExample {
	
	
	public static void main(String[] args) {
		
		Injector injector=Guice.createInjector(new MyLoggerModule());
		MyLogger logger = injector.getInstance(MyLogger.class);
		logger.loggerMethod();
		
		
	}

}
