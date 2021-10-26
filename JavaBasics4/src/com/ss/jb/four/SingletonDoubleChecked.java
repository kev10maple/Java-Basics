/**
 * 
 */
package com.ss.jb.four;

/**
 * @author Kevin
 * Singleton Class with double checked locking
 */
public class SingletonDoubleChecked {

	private static volatile SingletonDoubleChecked instance = null;
	
	private SingletonDoubleChecked() {
		
		
	}
	
	public static SingletonDoubleChecked getInstance() {
		
		if(instance == null) {
			
			synchronized(SingletonDoubleChecked.class) {
				
				if(instance == null) {
					
					instance = new SingletonDoubleChecked();
					
				}
				
			}
		}
		
		return instance;
		
	}
	
}
