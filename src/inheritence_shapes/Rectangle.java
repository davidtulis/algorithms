package inheritence_shapes;


/**
 * Class for rectangles
 * @author David Tulis
 *
 */

public class Rectangle extends Quadrilateral{
	
	/**
	 * Default constructor
	 */
	public Rectangle()
	{

	}

	/**
	 * Overloaded constructor
	 * @param aSide1 side length 1
	 * @param aSide2 side length 2
	 */
	public Rectangle(int aSide1, int aSide2) {
		super(aSide1, aSide2);
	}
	
	/**
	 * Gets the area of the superclass(quadrilateral)
	 */
	public double area()
	{
		return super.area();
	}
	
	/**
	 * Gets perimeter of superclass
	 */
	public double perimeter() {
		return super.perimeter();
	}

}
