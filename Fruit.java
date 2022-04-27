package Sabir_U8Programs;
/**
 * Name: Yaseer Sabir
 * Title: Fruit
 *
 */
public class Fruit implements Product {// implementing product interface

	private double cost;
	private String name;

	public Fruit(String name, double cost) {// instantiating variables

		this.cost = cost;
		this.name = name;

	}

	@Override
	public double getPrice() {// overriding from interface

		return cost;
	}

	@Override
	public void setPrice(double x) {// overriding from interface

		cost = x;

	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object other) {// overriding equals method

		if (this.cost == ((Fruit) other).getPrice() && this.name.equals(((Fruit) other).getName()))// check if prices are equals
			return true;

		return false;

	}

	public String toString() {

		return name + " $" + cost;// returns the name and the cost

	}

}
