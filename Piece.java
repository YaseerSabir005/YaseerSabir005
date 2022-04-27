
public abstract class Piece {
	private int row, col;

	public Piece() {
		row = -1;
		col = -1;
	}

	public void setLocation(int r, int c) {
		row = r;
		col = c;
	}

	public boolean nextTo(Piece p) {

		if (Math.abs(this.row - p.row) == 1 && Math.abs(this.col - p.col) == 1
				|| Math.abs(this.row - p.row) == 1 && Math.abs(this.col - p.col) == 0
				|| Math.abs(this.col - p.col) == 1 && Math.abs(this.row - p.row) == 0) {

			return true;

		}

		return false;
	}

}