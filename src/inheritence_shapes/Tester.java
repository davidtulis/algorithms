package inheritence_shapes;


/**
 * Tester class for our shapes
 * @author David Tulis
 *
 */

public class Tester {
	public static void main(String[] args) {
		System.out.printf("Format:\t\tArea\tSquare\n");
		Square sq1 = new Square(3);
		System.out.printf("Square: \t%.2f\t%.2f\n", sq1.area(), sq1.perimeter());
		Rectangle rect1 = new Rectangle(2, 3);
		System.out.printf("Rectangle:\t%.2f\t%.2f\n", rect1.area(), rect1.perimeter());
		Triangle t1 = new Triangle (3, 3, 3);
		System.out.printf("Triangle:\t%.2f\t%.2f\n", t1.area(), t1.perimeter());
		IsoscelesTriangle iso1 = new IsoscelesTriangle(2, 3);
		System.out.printf("Iso Triangle:\t%.2f\t%.2f\n", iso1.area(), iso1.perimeter());
	}
}
