/**
 * 
 */
package com.ss.jb.four;

import java.util.ArrayList;

/**
 * @author Kevin 
 *  One Thread (the producer) produces items (simple ints). Another
 *         thread (the consumer) consumes items. Both Threads have access to a
 *         bounded buffer which is basically an array
 */
public class ConsumerProducer {

	private ArrayList<Integer> buffer = new ArrayList<>();

	public void produce() throws InterruptedException {

		while (true) {

			synchronized (buffer) {

				if (buffer.size() < 10) {
					buffer.add(1); // just adding 1 thing as example
				}

				System.out.println("Producer added to the buffer");

			}

			Thread.sleep(200);
		}
	}

	public void consume() throws InterruptedException {

		while (true) {

			synchronized (buffer) {

				if (buffer.size() > 0) {

					buffer.remove(0); // only removing first index as example

				}

				System.out.println("Consumer removed from the buffer");
			}

			Thread.sleep(200);
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ConsumerProducer cp = new ConsumerProducer();

		// producer
		Runnable p = new Runnable() {

			@Override
			public void run() {

				try {
					cp.produce();

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		};

		// consumer
		Runnable c = new Runnable() {

			@Override
			public void run() {

				try {
					cp.consume();

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		};
		
		new Thread(p).start();
		new Thread(c).start();

	}
}
