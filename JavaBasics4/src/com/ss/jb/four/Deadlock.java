/**
 * 
 */
package com.ss.jb.four;

/**
 * @author Kevin 
 * Deadlock between two threads example
 */
public class Deadlock {

	public static void main(String[] args) {

		String s1 = "one";
		String s2 = "two";

		Runnable t1 = new Runnable() {

			@Override
			public void run() {

				try {

					synchronized (s1) {
						Thread.sleep(100);

						synchronized (s2) {
							System.out.println("Thread 1 is running");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		};

		Runnable t2 = new Runnable() {

			@Override
			public void run() {

				try {
					
					synchronized (s2) {
						Thread.sleep(100);

						synchronized (s1) {
							System.out.println("Thread 2 is running");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();

	}

}
