package com.samples.S01springcoredi.propertyfile;

public class MyDAO {

	private String dbServer;
	private String dbPort;
	private String dbUser;
	private String dbPassword;
	
	public MyDAO(String dbServer, String dbPort, String dbUser, String dbPassword) {
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPassword="
				+ dbPassword + "]";
	}
}
