package printer_simulation;

/**
 * Class that represents a printer
 * @author David Tulis
 */

import java.util.Random;

public class Printer implements Runnable {
	private NodeQueue<String> queue;
	
	/**
	 * Default constructor
	 */
	public Printer() {
		queue = new NodeQueue<String>();
	}
	
	/**
	 * Removes the item at the beginning of the queue
	 * @return the value removed
	 */
	public String printJob() {
		return queue.dequeue();
	}
	
	/**
	 * Adds a string to the queue
	 * @param job the job we want to add
	 */
	public void addJob(String job) {
		queue.enqueue(job);
	}
	
	/**
	 * Prints the contents of the queue
	 * @return the queue
	 */
	public String displayQueue() {
		return queue.toString();
	}
	
	/**
	 * To find out if the queue is empty
	 * @return true if the queue is empty, false if there are items in the queue
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	/**
	 * To find the first item in the queue
	 * @return the string that is first
	 */
	public String getFirst() {
		return queue.front();
	}

	/**
	 * starts the thread
	 */
	public void run() {
		while(true) {
			System.out.println(queue.toString());
			Random rand = new Random();
			int waitTime=rand.nextInt(1000)+1000;
			
			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
	
			}
			
			if (!(queue.isEmpty())) {
				System.out.print("Printed " + printJob());
			}
			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
	
			}
		}
	}
}
