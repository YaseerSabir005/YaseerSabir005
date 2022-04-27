
/**
 * @author ysabir
 *Title: Rings Runner
 */
public class RunRings {

	public static void main(String[] args) {
		Ring[] rings = new Ring[10];
		for (int n = 0; n < 10; n++) {
			rings[n] = get();
			System.out.println(rings[n]);
		}
		int totalValue = getTotalValue(rings);
		System.out.println("\nTotal value: " + totalValue);
		int count = countLuckyMagicRings(rings);
		System.out.println("There are " + count + " lucky magic rings");
	}

	public static Ring get() {
		boolean a = Math.random() < 0.5;// half of the time it is true and half of the time it is false
		if (a == true)
			return new Ring((int) (Math.random() * 20) + 5); //if it is true returns a ring object
		else
			return new MagicRing((int) (Math.random() * 20) + 5);//if false returns a magicring object
	}

	public static int getTotalValue(Ring[] r) {
		int sum = 0;
		for (Ring a : r) {
			sum += a.getValue();//adds each rings value
		}
		return sum;//returns the sums
	}

	public static int countLuckyMagicRings(Ring[] r) {
		int count = 0;
		for (Ring a : r) {
			if (a instanceof MagicRing && ((MagicRing) a).isLucky() == true)// first checks if the ring object is an instanceof magicring to ensure no errors and then counts the number of lucky rings by casting
				count++;//serves as a counter
		}
		return count;//returns the count
	}

}
