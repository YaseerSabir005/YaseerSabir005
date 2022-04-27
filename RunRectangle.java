
public class RunRectangle {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(-1, 4, 2, 8);
		System.out.println(r1.getPerimeter()); // 14
		System.out.println(r1.getArea()); // 12
		Rectangle r2 = new Rectangle(2, 5, 2, 6);
		// java.lang.IllegalArgumentException: x1 >= x2 or y1 >= y2

	}
}
