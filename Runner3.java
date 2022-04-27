package Sabir_U8Programs;
/**
 * 
 * Name: Yaseer Sabir
 * Title: Runner3
 *
 */
public class Runner3 {

	public static void main(String args[]) {

		String[] a1 = { "hat", "what", "why", "apple" };
		Comparable c = max(a1);
		System.out.println(c); // why
		Integer[] a2 = { 56, 22, 109, 5, 8, 13 };
		c = max(a2);
		System.out.println(c); // 109

	}

	public static Comparable max(Comparable[] c) {
		Comparable n = c[0];// this is supposed to be of Comparable data type
		for (int i = 1; i < c.length; i++) {

			if (c[i].compareTo(n) >= 1)// using the compareTo method here
				n = c[i];
		}
		return n;

	}

}