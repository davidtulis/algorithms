package printer_simulation;

import java.util.Random;

public class RandTest {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i=0; i<100; i++)
		{
			System.out.print(rand.nextInt(9) + " ");
		}
	}

}
