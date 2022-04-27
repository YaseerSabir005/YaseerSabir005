package Sabir_U9Programs;

public class Word implements Comparable<Object> {// here we are implementing Comparable interface to use compareTo
	private String my_word;
	private String my_sorted;

	public Word(String w) {
		my_word = w;
		my_sorted = sort(w);// passing the word to sort method
	}

	private String sort(String s) {

		String[] arr = new String[s.length()];// creating an array of the length of the word

		for (int i = 0; i < s.length(); i++) {

			arr[i] = s.substring(i, i + 1);// adding each letter to the array

		}

		MyUtil.selectionSort(arr);// sorting them by selection sort
		String str = "";
		for (int i = 0; i < arr.length; i++) {

			str += arr[i];// adding them back to one array

		}
		return str;// returning sorted array

	}

	public int compareTo(Object obj) {

		Word ob = (Word) obj;// casting needed to go forward
		if (this.toString().compareTo(ob.toString()) < 0)// if this is lesser than obj -1 is returned
			return -1;
		else if (this.toString().compareTo(ob.toString()) > 0)// else if it is greater 1 is returned
			return 1;
		else
			return 0;// if they are equal 0 is returned 

	}

	public boolean equals_sorted(Word w) {
		return my_sorted.equals(w.my_sorted);
	}

	public String toString() {
		return my_word;
	}
}
