package inheritence_shapes;


/**
 *Class for IsoscelesTriangles
 *@author David Tulis
 */

public class IsoscelesTriangle extends Triangle {

	/**
	 * Default constructor
	 */
	public IsoscelesTriangle() {

	}

/**
 * Constructor for an isosceles triangle
 * @param aBase the base of the triangle
 * @param aLeg the length of one of the sides of the triangle
 */
	public IsoscelesTriangle(double aBase, double aLeg)
	{
		super(aBase, aLeg, aLeg);
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
