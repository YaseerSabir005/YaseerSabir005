
public class Gold extends Piece {
	private int bars;

	public Gold() {
		bars = (int) (9 * Math.random()) + 1;
	}

	public int get() {
		return bars;
	}

	@Override
	public String toString() {
		return "" + bars;
	}
}