package Sabir_U8Programs;

import java.util.*;

public class Runner2 {
	public static void main(String[] args) {
		Bat[] b1 = new Bat[2];
		b1[0] = new Bat(34);
		b1[1] = new Bat(16);
		

		
		Arrays.sort(b1);
		for (Bat b : b1)
			System.out.println(b);
	}
}
