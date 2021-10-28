/**
 * 
 */
package com.ss.jb.five;

import java.sql.Connection;


/**
 * @author Kevin
 *
 */
public class Singleton {

	private static Connection conn = null;

	private static volatile Singleton instance = null;

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public static void setConn(Connection conn) {
		Singleton.conn = conn;
	}
	public static Connection getConn() {
		return conn;
	}

}
