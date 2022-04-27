package Assignments;

public class Dog extends Pet {

	int d = 0;

	public Dog(String name) {

		super(name);

	}

	@Override
	public int getAdoptionFee() {

		return 200;

	}
}
