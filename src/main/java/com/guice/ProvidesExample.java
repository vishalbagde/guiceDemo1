package com.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;



interface DBinf {
	public void checkDB();
}

	
class Database 
{
	
	private DBinf dbinterface;

	@Inject
	public Database(DBinf dbinterface) {

		this.dbinterface = dbinterface;
	}
	public void getCon() {
		dbinterface.checkDB();
	}
}

class DatabaseImp implements DBinf{
	
	private String dbUrl;
	String user;
	Integer timeout;
	
	@Inject
	public DatabaseImp(String dbUrl, String user, Integer timeout) {
		super();
		this.dbUrl = dbUrl;
		this.user = user;
		this.timeout = timeout;
	}
	
	@Override
	public void checkDB() {
		  System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl);
	      System.out.println(user);
	      System.out.println(timeout);
	      
	}
}


class DatabaseProvider implements Provider<DBinf>
{
	@Override
	public DBinf get() {
		String dbUrl = "jdbc:mysql://localhost:5326/emp";
	    String user = "user";
	    int timeout = 100;
	    DBinf database=new DatabaseImp(dbUrl, user, timeout);
	    return database;
	}
}
class DatabaseModule extends AbstractModule{
	@Override	
	protected void configure() {
		bind(DBinf.class).toProvider(DatabaseProvider.class);
	}
	/*
	@Provides
	public DBinf provideDatabase() {
		  String dbUrl = "jdbc:postgresql://localhost:5432/test";
	      String user = "user";
	      int timeout = 100;
	      DBinf db=new DatabaseImp(dbUrl, user, timeout);
	      return db;
	}
	*/
}
public class ProvidesExample {
	public static void main(String[] args) {
		Injector injector=Guice.createInjector(new DatabaseModule());
		Database db=injector.getInstance(Database.class);
		db.getCon();
	}
}
