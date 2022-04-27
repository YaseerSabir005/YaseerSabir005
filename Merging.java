package Sabir_U9Programs;

/**
 * 
 * @author ysabir Date: 3/26/2022 Title: Merge Function(When only middle is
 *         passed) Description: In this class I have implemente dthe merge
 *         function which merges the two sorted sections of the original array
 *         into one.
 */
public class Merging {

	public static void main(String[] args) {
		int[] list = { 35, 78, 122, 502, 999, 56, 333 };
		merge(list, 4); // 4 because that's the last index of the first section
		for (int n = 0; n < list.length; n++)
			System.out.print(list[n] + ", ");
		System.out.println("\n");
		int[] ray = { -4, 6, -11, 0, 3, 14, 45 };
		merge(ray, 1); // 1 because that's the last index of the first section
		for (int n = 0; n < ray.length; n++)
			System.out.print(ray[n] + ", ");
	}

	public static void merge(int[] a, int middle) {

		int low = 0;// this is the starting index of the first half
		int high = a.length - 1;// this is the last index of the second half

		int[] arr = new int[a.length];// creating a temporary array

		for (int i = 0; i < arr.length; i++) {
			arr[i] = a[i];// here we are adding all the values of a into the temporary array
		}

		int low2 = low, index = 0, high2 = middle + 1;// variables to form the loop

		while (low2 < high2 && high2 <= high) {// condition to go on till the index of the first half of the array is
												// less than the index of the second half which means until the loop has
												// traversed throughout the loop. And also until high2 is lesser than
												// the length of the array.

			if (a[high2] < arr[index])// if the index at middle+1 is smaller than the index in the temp array then the
										// index in the first half would the index in a of the second half of the array
				a[low2++] = a[high2++];
			else
				a[low2++] = arr[index++];// else the index in the first half of a would be the index in the next index
											// of the temp array
		}

		while (low2 < high2) {
			a[low2++] = arr[index++];// here we are copying the rest of the values
		}
	}

}
