package Sabir_U8Programs;
/**
 * Name: Yaseer Sabir
 * Title: Grocer
 * 
 */
public class Grocer {
	private Product[] inventory; // contains all the products the grocer has

	public Grocer(int size) {
		inventory = new Product[size];// instantiating the inventory array to the size given by the parameter
	}

	public void add(Product p) {

		int i = 0;
		int stop = 0;
		while (stop != -1) {// loop to check if the index is null

			if (inventory[i] == null) {
				inventory[i] = p;
				stop = -1;// sentinel value to end the loop
			}
			i++;// else i++

		}

	}

	public void remove(Product p) {

		int i = 0;
		int stop = 0;

		while (stop != -1) {// loop to check if index is null and equals p

			if (inventory[i].equals(p)) {
				inventory[i] = null;
				stop = -1;//sentinel value to end the loop
			}
			i++;// else i++

		}
	}

	public void increasePrices(double p) {

		for (int i = 0; i < inventory.length; i++) {// loop to traverse

			if (inventory[i] != null)// if the index is not null
				inventory[i].setPrice(p * inventory[i].getPrice() + inventory[i].getPrice());// set the price increasing by p percent

		}

	}

	public int totalPages() {
		int sum = 0;

		for (int i = 0; i < inventory.length; i++) {// loop to traverse 
			if (inventory[i] instanceof Book == true) {// we have to first check if it is of Book type
				sum += ((Book) inventory[i]).getPages();// adds the Pages, we have to cast.
			}
		}
		return sum;
	}

	@Override
	public String toString() {
		int check = -1;
		String products = "";
		products += "Inventory:" + "\n";
		for (int i = 0; i < inventory.length; i++) {

			if (inventory[i] != null) {
				if (check == -1)
					products += inventory[i].toString() + "\n";
				else
					products += inventory[i].toString() + "\n";
			}
			check++;

		}
		return products;
	}
}