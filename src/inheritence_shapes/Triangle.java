package inheritence_shapes;


/**
 * Class for all triangles
 * @author David Tulis
 *
 */

public class Triangle implements Polygon {
	private double l1;
	private double l2;
	private double l3;

	/**
	 * Default constructor
	 */
	public Triangle() {

	}

	/**
	 * Overloaded constructor for a Triangle object
	 * @param a the length of side 1
	 * @param b the length of side 2
	 * @param c the length of side 3
	 */
	public Triangle(double a, double b, double c) {
		l1=a;
		l2=b;
		l3=c;
	}

	/**
	 * Finds the area of any triangle using Heron's formula
	 * @return the area of the triangle
	 */
	public double area()	{
		double s = (l1+l2+l3)/2;
		return Math.sqrt((s*(s-l1)*(s-l2)*(s-l3)));
	}

	/**
	 * This method finds the perimeter of a triangle by added the 3 sides
	 * @return the perimeter of the triangle
	 */
	public double perimeter() {
		return l1+l2+l3;
	}
}
