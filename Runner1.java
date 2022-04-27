package Sabir_U8Programs;
/**
 * 
 * Name: Yaseer Sabir
 * Title: Runner1
 */
public class Runner1 {

	public static void main(String[] args) {
		Integer[] a1 = { 8, 4 };
		up(a1);
		for (int n : a1)
			System.out.println(n);
		String[] a2 = { "rock", "paper" };
		up(a2);
		for (String s : a2)
			System.out.println(s);
		String[] a3 = { "ant", "boat" };
		up(a3);
		for (String s : a3)
			System.out.println(s);
	}

	public static void up(Comparable[] c) {
		Comparable num;// this is of Comparable data type
		if (c[1].compareTo(c[0]) >= 1) {
			num = c[0];
			c[0] = num;
			c[1] = c[1];
			System.out.println();
		} else {
			num = c[0];// we have to set the value to c[0] so we retain the original value and not the changed value
			c[0] = c[1];
			c[1] = num;
			System.out.println();
		}
	}

}
