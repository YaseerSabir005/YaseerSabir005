/**
 * Name: Yaseer Sabir
 * Title: Runner
 * 
 */

package Sabir_U8Programs;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
		String[] words = { "once", "upon", "a", "time", null };
		List<String> myList = fillList(words);

		for (int n = 0; n < myList.size(); n++)
			System.out.print(myList.get(n) + ", ");

		System.out.println();
		List<String> list2 = new ArrayList<String>();
		list2.add("Apples");
		list2.add("are");
		list2.add(null);
		list2.add("red");
		String[] phrases = fillArray(list2);

		for (int n = 0; n < phrases.length; n++)
			System.out.print(phrases[n] + ", ");

		System.out.println();
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(null);
		list3.add(null);
		list3.add("ok");
		list3.add(null);
		list3.add(null);
		System.out.println("Size of list3: " + list3.size());
		removeNulls(list3);
		System.out.println("Size of list3: " + list3.size());
	}

	public static List<String> fillList(String[] s) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {// this loop is to traverse and add s[i] to the array list. 

			list.add(s[i]);

		}
		return list;// list is returned
	}

	public static String[] fillArray(List<String> list) {

		String[] arr = new String[list.size()];// configuring with the size of the list
		for (int i = 0; i < list.size(); i++) {// this loop is to add s values in the list and add these values to arr
			if (list.get(i) != null)
				arr[i] = list.get(i) + "s";
			else
				arr[i] = "s";
		}
		return arr;// returning a
	}

	public static void removeNulls(List<String> s) {

		for (int i = s.size() - 1; i >= 0; i--) {// this is to remove all null values. We need to make sure we don't skip values here hence traversing from last index.
			if (s.get(i) == null)
				s.remove(i);
		}
	}
}