package inheritence_shapes;

/**
 * Class for all quadrilaterals
 * @author David Tulis
 *
 */

public class Quadrilateral implements Polygon {

	private double l1;
	private double l2;

	/**
	 * Default constructor
	 */
	public Quadrilateral() {

	}

	/**
	 * Overloaded constructor
	 * @param a the length of one side of the quadrilateral
	 * @param b the length of another side of the quadrilteral
	 */
	public Quadrilateral(int a, int b) {
		l1=a;
		l2=b;
	}

	/**
	 * Finds the area of the quadrilateral
	 * @return the area of the quadrilateral
	 */
	public double area()	{
		return l1*l2;
	}

	/**
	 * Finds the perimeter of the quadrilateral
	 * @return the area of the quadrilateral
	 */
	public double perimeter() {
		return 2*(l1+l2);
	}
}
