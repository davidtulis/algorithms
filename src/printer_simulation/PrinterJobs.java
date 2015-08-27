package printer_simulation;

/**
 * Tester class
 * This is a multithreaded program to simulate students sending jobs to a printer
 * @author david tulis
 *
 */

public class PrinterJobs {

	public static Printer printer = new Printer();
	
	  public static void main(String[] args) throws InterruptedException {
		  
	  printer.run();
	
	  Student[] students = new Student[10]; 
	  for (int i=0; i<10; i++) {
			students[i] = new Student(Integer.toString(i));
			students[i].run();
	  }
  }
}

