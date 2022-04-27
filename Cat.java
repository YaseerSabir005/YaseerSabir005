package Assignments;

public class Cat extends Pet {

	int d = 0;

	public Cat(String name, int days) {

		super(name);
		d = days;
	}

	@Override
	public int getAdoptionFee() {
		int num = 100;

		if (d < 7)
			num = 175;
		else if (d >= 7 && d <= 14)
			num = 160;

		return num;
	}
}
