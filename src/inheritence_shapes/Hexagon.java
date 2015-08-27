package inheritence_shapes;

public class Hexagon implements Polygon {

	private double side;
	
	/**
	 * Default constructor
	 */
	public Hexagon() {
		
	}
	
	/**
	 * Overloaded constructor
	 * @param side the length of one of the sides
	 */
	public Hexagon(double side) {
		this.side=side;
	}
	
	
	/**
	 * calculates area of a regular hexagon
	 * @return area
	 */
	public double area() {
		return ((3*Math.sqrt(3)*side*side)/2);
	}

	/**
	 * calculates perimeter of hexagon
	 * @return perimeter
	 */
	public double perimeter() {
		return (6*side);
	}

}
