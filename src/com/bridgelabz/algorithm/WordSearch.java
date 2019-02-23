/**
 * Purpose : Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list
 * 
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   22-02-2019
 **/
package com.bridgelabz.algorithm;
import java.io.*;
import java.util.*;
import com.bridgelabz.utility.*;
public class WordSearch {

	public static void main(String[] args) {
		File f = new File("/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/word.txt");
		try {
			
			String arr[] = fetch(f);
			for (String string : arr) {
				System.out.print(string+" ");
			}
			System.out.println("\nEnter String to search");
			String s1 = Utility.inputString();
			int i = UtilitySearch.binary(arr, s1);
			if (i < 0)
				System.out.println("not found");
			else
				System.out.println("found");

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
	}
	
	/**
	 * function to fetch each word and convert it to String array
	 * @param : passing file object as argument
	 * @return the converted String array
	 **/
	
	static String[] fetch(File f) throws IOException{
		String word = "";
		ArrayList<String> s1 = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		int c;
		while ((c = fr.read()) != -1) {
			if (c == 32) {
				s1.add(word);
				word = "";
			} else {
				word = word + String.valueOf((char) c);
			}
		}
		fr.close();
		String[] s = new String[s1.size()];
		s1.toArray(s);
		return s;
	}
}
