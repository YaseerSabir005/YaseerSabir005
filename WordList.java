package Sabir_U9Programs;

import java.io.*;
import java.util.Scanner;

public class WordList {

	public static String[] getWords(String filename) {

		String[] list = null;
		try {
	 		 
		 	Scanner read = new Scanner(new File(filename));
			int count = 0;
			while (read.hasNext()) {
				String temp = read.nextLine();
				count++;
			}
			list = new String[count];
			read = new Scanner(new File(filename));
			count = 0;
			while (read.hasNext()) {
				list[count] = read.nextLine();
				count++;
			}
		} catch (IOException e1) {
			System.out.println("problem reading file");
		}
		return list;
	}
}
