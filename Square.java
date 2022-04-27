
/**
 * @author ysabir
 * Title: Calling parent class constructor
 */
public class Square extends Rectangle {

	public Square(int x1, int y1, int len) {

		super(x1, y1, x1 + len, y1 + len); /**
											 * Here we are passing the coordinates to the Rectangle class. the x2 and y2
											 * coords are passed by adding the len
											 **/

	}

}
