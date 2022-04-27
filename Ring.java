
public class Ring {
	private int value;

	public Ring(int v) {
		value = v;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ring worth $" + value;
	}
}
