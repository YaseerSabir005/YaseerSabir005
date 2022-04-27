package Sabir_U9Programs;

/**
 * Name: Yaseer Sabir Title: MyUtil.java(Program 1) Description: Here I have first
 * created two methods for linear search and binary search respectively. The
 * linear search program utilizes .equal to compare objects and the binary
 * search uses compareTo to compare objects. Date: 3/12/2022
 * 
 * Furthermore I have also implemented selection sort and insertion sort using the helper methods insertAbove and switchValues 
 *  
 */
public class MyUtil {

	public static int linearSearch(Object[] a, Object target) {

		int found = -1;// initializing found variable to -1  so that we know that if found is not changed the value was not found.

		for (int i = 0; i < a.length; i++) {// loop to traverse

			if (a[i].equals(target)) {// if the index equals target
				found = i;
		
			}
		}
		return found;
		
	}

	public static int binarySearch(Comparable[] a, Comparable target) {

		int left = 0;// initial value of the left.
		int right = a.length - 1;// initial value of the right.

		while (left <= right) { // loops until left index is less than right index.
			int middle = (right + left) / 2;// middle value changes as right and left change
			if (a[middle].compareTo(target) == 0)// uses compareTo. when the values are same the index is returned
				return middle;

			else if (a[middle].compareTo(target) < 0)// if the a[middle] value is lesser than the range goes up
				left = middle + 1;

			else
				right = middle - 1;// else the range closes down
		}
		return -1;//if not found then -1 is returned

	}

	public static void selectionSort(Comparable[] a) {
		
		for (int i = 0; i < a.length - 1; i++) {// loop to traverse 

			int min_idx = i;
			for (int j = i + 1; j < a.length; j++)// this is will one index ahead of i to 
				if (a[j].compareTo(a[min_idx]) < 0)
					min_idx = j;// if a[j] is lesser than the minimum index than the minimum index is j.

			switchValues(a, min_idx, i);// the values are switched by passing to switchvalues method.
		}
	}

	public static void insertionSort(Comparable[] a) {
		for (int n = 1; n < a.length; n++) {// traversing through the array
			insertAbove(a, n);// passing n as index to insertabove
		}
	}

	public static void insertAbove(Comparable[] a, int n) {
		while (n > 0) {// looping till the value is in its right position.
			if (a[n - 1].compareTo(a[n]) < 0)
				return;// will act as a break
			else {
				switchValues(a, n - 1, n);// otherwise it will switch the values
				n--; // the value of n will be subtracted
			}
		}
	}

	private static void switchValues(Comparable[] a, int n1, int n2) {
		String temp = (String) a[n1];// casting a to String acts as temporary value 
		a[n1] = a[n2]; //switched the value to a[n2].
		a[n2] = temp;// switched the value to the temp.
	}
}
