package Sabir_U8Programs;

import java.util.*;

public class RunSpeedTests {
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new LinkedList<Integer>();
		long time = addToFront(x);
		System.out.println("Adding to Front of an ArrayList: " + time + " ms");
		time = addToFront(y);
		System.out.println("Adding to Front of a LinkedList: " + time + " ms");
		time = accessElement(x, x.size() / 2);
		System.out.println("Accessing an element of an ArrayList: " + time + " ms");
		time = accessElement(y, y.size() / 2);
		System.out.println("Accessing an element of a LinkedList: " + time + " ms");
	}

	private static long addToFront(List<Integer> list) {
		long start_time = System.currentTimeMillis();
		for (int n = 0; n < 200000; n++) {
			int num = (int) (100 * Math.random());
			list.add(0, num);
		}
		long stop_time = System.currentTimeMillis();
		return stop_time - start_time;
	}

	private static long accessElement(List<Integer> list, int index) {
		long start_time = System.currentTimeMillis();
		for (int n = 0; n < 100000; n++) {
			int num = list.get(index);
		}
		long stop_time = System.currentTimeMillis();
		return stop_time - start_time;
	}
}