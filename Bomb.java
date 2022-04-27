
public class Bomb extends Piece {
	private boolean deadly;

	public Bomb() {

		deadly = Math.random() < 0.5 ? true : false;
	}

	public boolean isDeadly() {
		return deadly;
	}

	@Override
	public String toString() {
		if (deadly == true)
			return "B!!";
		else
			return "B";

	}

	
}