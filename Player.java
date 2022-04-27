
public class Player extends Piece {
	private String name;

	public Player(String s) {
		name = s;
	}

	@Override
	public String toString() {
		return name;
	}
}
