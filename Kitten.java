package Assignments;

public class Kitten extends Cat {

	public Kitten(String name, int days) {

		super(name, days);

	}

	@Override
	public int getAdoptionFee() {

		return 100 + super.getAdoptionFee();

	}

	@Override
	public String toString() {
		return super.toString() + "\n(Kitten)";
	}
}
