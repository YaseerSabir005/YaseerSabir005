package Sabir_U9Programs;

/**
 * 
 * @author ysabir Title: UsingMergeSort(Passing the start, middle and end index
 *         at the same time) Description: Here we are following an almost same
 *         solution to the merging class but here we assign the start and end
 *         indices to low and high respectively
 */
public class UsingMergeSort {

	public static void main(String[] args) {
		int[] list = { 88, 34, 25, 2, 17, 2 };
		System.out.print("Original: ");
		for (int n = 0; n < list.length; n++)
			System.out.print(list[n] + ", ");
		mergeSort(list, 0, list.length - 1);
		System.out.print("\nSorted: ");
		for (int n = 0; n < list.length; n++)
			System.out.print(list[n] + ", ");
	}

	// Precondition: 0 <= start <= end < a.length
	// Postcondition: a[] is sorted in ascending order
	public static void mergeSort(int[] a, int start, int end) {
		if (start == end)
			return;
		int middle = (start + end) / 2;
		mergeSort(a, start, middle);
		mergeSort(a, middle + 1, end);
		merge(a, start, middle, end);
	}

	public static void merge(int[] a, int start, int middle, int end) {
		int[] b = new int[middle + 1 - start];// here we are creating a temp array
		
		for (int i = 0; i < b.length; i++)
			b[i] = a[i + start];// initializing b[i]

		int low = start, b_index = 0, high = middle + 1;
		
		while (low < high && high <= end) {// loop to compare values
			
			if (a[high] < b[b_index])
				a[low++] = a[high++];
			else
				a[low++] = b[b_index++];
			
		}

		while (low < high)
			a[low++] = b[b_index++];//adding the rest of the values.
	}
}
