package com.bridgelabz.datastructure;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class DSUtil {
	public static void unorderedList(String searchWord,String fullString) throws IOException{
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/writefile.txt";
		String purestring = fullString.replaceAll("\\.", " ");
		String[] stringArr = purestring.split(" ");
		List<String> list = new LinkedList<String>();
		System.out.println("Words of string are");
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.add(s);
		}
		if(list.contains(searchWord)) {
			System.out.println("\nThe word is available in the linked list , remove it ");
			list.remove(searchWord);
			System.out.println(list);
		} else {
			System.out.println("\nThe word is not available in the linked list , add it ");
			list.add(searchWord);
			System.out.println(list);
		}
		Utility.writeFile(path, list);
 	}
	public static void orderedList(String searchNumber,String fullString) throws IOException{
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/writefile.txt";
		String[] stringArr = fullString.split(" ");
		List<String> list = new LinkedList<String>();
		System.out.println("Numbers in file are ");
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.add(s);
		}
		if(list.contains(searchNumber)) {
			System.out.println("\nThe number is available in the linked list , remove it ");
			list.remove(searchNumber);
			Collections.sort(list);
			System.out.println(list);
		} else {
			System.out.println("\nThe number is not available in the linked list , add it ");
			list.add(searchNumber);
			Collections.sort(list);
			System.out.println(list);
		}
		Utility.writeFile(path, list);
	}
}
