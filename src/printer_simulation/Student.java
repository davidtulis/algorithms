package printer_simulation;

/**
 * Class represents a student
 * @author David Tulis
 */

import java.util.Random;

public class Student implements Runnable {
	private String name;
	
	/**
	 * Our default constructor
	 */
	public Student() {
		
	}
	
	/**
	 * Overloaded constructor
	 * @param name the name of the student
	 */
	public Student(String name) {
		this.name="Student number " + name;
	}
	
	/**
	 * Returns the name of the student
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Lets the student send a job to the printer
	 * @param job the contents of the job
	 */
	public void sendJob(String job) {
		System.out.println(name + " just sent " + job);
		PrinterJobs.printer.addJob(job);
	}

	/**
	 * This method will send a random job to the student in random intervals
	 */
	public void run() {
		while (true) {
			Random rand = new Random();
			int waitTime=rand.nextInt(100)+3000;
			String[] jobStrings = new String[4];
			jobStrings[0]="Cheeseburger";
			jobStrings[1]="Homework";
			jobStrings[2]="Resume";
			jobStrings[3]="Tickets";
			int randJob=rand.nextInt(4);
			
			
			
			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
	
			}
			
			sendJob(jobStrings[randJob]);
	
			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {

			}
		}
	}
}
