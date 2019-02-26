package com.bridgelabz.datastructure;
import java.io.*;
import java.util.*;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Utility class to perform different activities 
 * @author Tasif Mohammed
 * @version 1.0
 * @since 26-02-2019 
 */
public class DSUtil {
	
	/**
	 * Purpose : Read the Text from a file, split it into words and arrange it as Linked List.Take a user input to search a Word in the List. If the Word is not found then add itto the list, and if it found then remove the word from the List. In the end save the list into a file
	 * @param searchWord : Passing a word to be searched as an argument
	 * @param fullString : passing entire string as an argument
	 * @throws IOException : That is checked exception
	 */
	
	public static void unOrderedList(String searchWord,String fullString) throws IOException{
		
		//Storing location of file in path variable
		
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/writefile.txt";
		
		//Replacing '.' of string with space 
		
		String purestring = fullString.replaceAll("\\.", " ");
		
		//Splitting String depending on space 
		
		String[] stringArr = purestring.split(" ");
		List<String> list = new LinkedList<String>();
		
		//Adding data into List
		
		System.out.println("Words of string are");
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.add(s);
		}
		
		//Searching the word if available remove it from list
		
		if(list.contains(searchWord)) {
			System.out.println("\nThe word is available in the linked list , remove it ");
			list.remove(searchWord);
			System.out.println(list);
		}
		
		//Searching the word if not available add it to list
		
		else {
			System.out.println("\nThe word is not available in the linked list , add it ");
			list.add(searchWord);
			System.out.println(list);
		}
		
		//Writting data into the file 
		
		Utility.writeFile(path, list);
 	}
	
	/**
	 * Purpose : Read a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
	 * @param searchNumber : Passing a number to be searched 
	 * @param fullString : Passing entire String 
	 * @throws IOException : IOException that is checked exception
	 */
	
	public static void orderedList(String searchNumber,String fullString) throws IOException{
		
		//Storing location of file in path variable
		
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/writefile.txt";
		
		//Splitting String depending on space 
		
		String[] stringArr = fullString.split(" ");
		List<String> list = new LinkedList<String>();
		System.out.println("Numbers in file are ");
		
		//Adding data into List
		
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.add(s);
		}
		
		//Searching the word if available remove it from list
		
		if(list.contains(searchNumber)) {
			System.out.println("\nThe number is available in the linked list , remove it ");
			list.remove(searchNumber);
			
			//Sorting the elements of list 
			
			Collections.sort(list);
			System.out.println(list);
		} else {
			System.out.println("\nThe number is not available in the linked list , add it ");
			list.add(searchNumber);
			
			//Sorting the elements of list 
			
			Collections.sort(list);
			System.out.println(list);
		}
		
		//Writting data into the file 
		
		Utility.writeFile(path, list);
	}
}
