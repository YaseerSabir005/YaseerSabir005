package Sabir_U9Programs;

import java.util.ArrayList;// the ArrayList class is imported
import java.util.Scanner;// the Scanner class is imported 

public class WordRunner {

	public static void main(String[] args) {
		String[] arr = WordList.getWords("words.txt");// here we are storing the array of words from words.txt into an array.

		Word[] objs = new Word[arr.length];// creating an array of words 

		for (int i = 0; i < arr.length; i++) {

			objs[i] = new Word(arr[i]);// here we are creating a Word object for every word in the arr array

		}

		Scanner searchWord = new Scanner(System.in);// Scanner is open

		Word target;
		String sentinel = "aaaa";// sentinel value to exit
		ArrayList<Word> arl = new ArrayList<Word>();// Arraylist of arl is instantiated

		while (sentinel != "exit") {//loop to take values until enter is pressed

			System.out.println("Enter A String Of Characters Or Enter To Exit The Word Checker!");
			target = new Word(searchWord.nextLine());// Word object is created for every word entered by the user

			if (target.toString().length() == 0) {// here is the length is 0 or no value is entereed by the user then sentenil value is called
				System.out.println("\t Thanks For Playing Today!");// ending message
				System.out.println("************************************************");
				sentinel = "exit";
			}

			else {
				arl = getMatches(objs, target);// else matches are checked for the target value and assigned to arl arraylist

				for (int i = 0; i < arl.size(); i++) {
					if (arl.get(i).equals(null))
						System.out.println("No matches");// if there are no matches No matches is printed
					else
						System.out.println(arl.get(i));// else the values are printed 
				}

			}

		}
		searchWord.close();// scanner is closed to avoid warning by eclipse ide

	}

	public static ArrayList<Word> getMatches(Word[] ray, Word target) {

		ArrayList<Word> arl = new ArrayList<Word>();// arl arraylist is created

		for (int i = 0; i < ray.length; i++) {

			if (ray[i].equals_sorted(target))// if the sorted values equal each other 
				arl.add(ray[i]);// then that word is added to arl arraylist

		}

		return arl;// the arraylist is returned.
	}

}
