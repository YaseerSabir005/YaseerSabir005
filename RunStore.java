package Sabir_U8Programs;

public class RunStore {
	public static void main(String[] args) {
		Grocer g = new Grocer(5);
		g.add(new Book("Hey", 2, 25));
		g.add(new Fruit("Lime", 0.5));
		g.add(new Book("There", 2.5, 100));
		System.out.println(g);
		System.out.println(g.totalPages() + " total pages\n");
		g.increasePrices(0.1);
		System.out.println(g);
		g.remove(new Book("Hey", 399, 1));
		System.out.println(g);
		g.add(new Fruit("Lime", 0.5));
		g.add(new Fruit("Lime", 0.5));
		System.out.println(g);
		g.remove(new Fruit("Lime", 0.5));
		System.out.println(g);
	}
}