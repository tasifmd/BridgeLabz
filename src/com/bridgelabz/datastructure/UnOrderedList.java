package com.bridgelabz.datastructure;
import com.bridgelabz.utility.*;
import java.io.*;
import java.util.*;

public class UnOrderedList {
	 
	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		String[] strings; 
		try(FileReader fr = new FileReader("/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/UnOrdered.txt");
			BufferedReader br = new BufferedReader(fr)) {
			
			String line;
			while((line = br.readLine()) != null) {
				line = line.replaceAll("\\.", "");
				strings = line.split(" ");
				for(String s: strings) {
					li.add(s);
				}
			}			
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(li);
		
		System.out.println("Enter a word to search ");
		String str = Utility.inputSingleString();
		
	}
	public static boolean search(Comparable item) {

		return li.search(item);
	}
}
