package Assignments;

public abstract class Pet {
	private int idNumber;
	private String name;

	public Pet(String aName) {
		name = aName;
		idNumber = getNextIdNumber();
	}

	public abstract int getAdoptionFee();

	public String toString() {

		return "Name: " + name + "\nID: " + idNumber + "\nFee: $" + getAdoptionFee();
	}

	private static int getNextIdNumber() {
		return (int) (Math.random() * 10000) * 1000;
	}
}
