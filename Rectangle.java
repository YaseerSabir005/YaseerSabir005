
import java.awt.geom.Point2D;

public class Rectangle {
	private int x1, y1, x2, y2;

	public Rectangle(int x1, int y1, int x2, int y2) {
		if (x1 >= x2 || y1 >= y2)
			throw new IllegalArgumentException("x1 >= x2 or y1 >= y2");
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getPerimeter() {
		double dist = Point2D.distance((double) x1, (double) y1, (double) x2, (double) y1);
		double dist2 = Point2D.distance((double) x1, (double) y1, (double) x1, (double) y2);

		double perimeter = 2 * (dist + dist2);
		return (int) perimeter;
	}

	public int getArea() {
		double dist = Point2D.distance((double) x1, (double) y1, (double) x2, (double) y1);
		double dist2 = Point2D.distance((double) x1, (double) y1, (double) x1, (double) y2);

		return (int) (dist * dist2);
	}
}
