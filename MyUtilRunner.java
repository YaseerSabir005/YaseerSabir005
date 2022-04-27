package Sabir_U9Programs;
/**
 * 
 * @author ysabir
 * Desription: Main method to test the code.
 */
public class MyUtilRunner {

		public static void main(String[] args) {
			String[] arr1 = { "walrus", "zoo", "elephant", "bear", "panda" };
			int index = MyUtil.linearSearch(arr1, "bear");
			System.out.println("Linear search: bear was found at index " + index);
			index = MyUtil.linearSearch(arr1, "ox");
			System.out.println("Linear search: ox was found at index " + index);
			String[] arr2 = { "A", "B", "F", "H", "Q", "T" };
			index = MyUtil.binarySearch(arr2, "B");
			System.out.println("Binary search: B was found at index " + index);
			index = MyUtil.binarySearch(arr2, "S");
			System.out.println("Binary search: S was found at index " + index);
			Integer[] nums = { -5, 0, 33, 34, 46, 51, 84, 199 };
			index = MyUtil.binarySearch(nums, 84);
			System.out.println("Binary search: 84 was found at index " + index);
			
			/*
			 * String [] arr3 = { "G", "R", "A", "E", "Z", "T" }; System.out.println(
			 * "\n*** Testing selectionSort of Comparables" ); MyUtil.selectionSort( arr3 );
			 * for (String s : arr3) System.out.print(s + " "); String [] arr4 = {"K", "Y",
			 * "W", "N", "E", "X"};
			 * System.out.println("\n*** Testing insertionSort of Comparables");
			 * MyUtil.insertionSort(arr4); for (String s : arr4) System.out.print(s + " ");
			 */
		
	}

}
