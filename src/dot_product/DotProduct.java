package dot_product;

/**
 * This class generates two arrays that represent matrices with the size of n by 1 or 1 by n
 * The arrays will be filled in with random values, and then the dot product is computed and displayed
 * 
 * @author David Tulis
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DotProduct {

	public static void main(String[] args)
	{
		System.out.print("Input size of matrices: ");
		//get the size of the matrix and store in n
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //size of the matrices
		in.close();
		
		//declare arrays
		int[] a = new int[n];
		int[] b = new int[n];
		
		//fill arrays with random integers
		Random rand = new Random();
		for (int i=0; i<n; i++)
		{
			a[i]=rand.nextInt(10);
			b[i]=rand.nextInt(10);
		}
		int[] c = new int[n];
		
		//calculate the dot product
		for (int i=0; i<n; i++)
		{
			c[i]=a[i]*b[i];
			
		}
		
		//print the two arrays and the dot product
		System.out.print(Arrays.toString(a) + " DOTTED WITH " + Arrays.toString(b) + " = " + Arrays.toString(c));
	}
}
