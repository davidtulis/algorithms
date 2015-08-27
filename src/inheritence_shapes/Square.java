package inheritence_shapes;


/**
 * Class for squares
 * @author David Tulis
 *
 */

public class Square extends Quadrilateral {

	/**
	 * Default constructor
	 */
	public Square()
	{

	}

	/**
	 * Overloaded constructor
	 * @param aSideLength the length of the side of the square
	 */
	public Square(int aSideLength) {
		super(aSideLength,aSideLength);
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
