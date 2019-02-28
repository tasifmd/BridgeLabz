package com.bridgelabz.datastructure;

import java.io.IOException;

import com.bridgelabz.algorithm.Util;
import com.bridgelabz.functional.LeapYear;
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
		CustomLinkedList li = new CustomLinkedList();
		
		//Adding data into List

		System.out.println("Words of string are");
		for(String s : stringArr) {
			System.out.print(s+",");
			li.add(li,s);
		}
		
		//Searching the word if available remove it from list
		
		if(li.isAvailable(li.head,searchWord)) {
			System.out.println("\nThe word is available in the linked list , remove it ");
			li.remove(li,searchWord);
			li.printList(li);
		}
		
		//Searching the word if not available add it to list
		
		else {
			System.out.println("\nThe word is not available in the linked list , add it ");
			li.add(li,searchWord);
			li.printList(li);
		}
		
		//Writting data into the file 
		
		Utility.writeFile(path, li);
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
		CustomLinkedList list = new CustomLinkedList();
		System.out.println("Numbers in file are ");
		
		//Adding data into List
		
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.add(list, s);
		}
		
		//Searching the word if available remove it from list
		
		if(list.isAvailable(list.head,searchNumber)) {
			System.out.println("\nThe number is available in the linked list , remove it ");
			list.remove(list,searchNumber);
			
			//Sorting the elements of list 
			
			//Collections.sort(list);
			list.printList(list);
		} else {
			System.out.println("\nThe number is not available in the linked list , add it ");
			list.add(list,searchNumber);
			
			//Sorting the elements of list 
			
			//Collections.sort(list);
			list.printList(list);
		}
		
		//Writting data into the file 
		
		Utility.writeFile(path, list);
	}
	
	/**
	 * Purpose : Function to check whether an expression is balanced or not 
	 * @param s : Passing expression as an argument 
	 * @return : true if expression is balanced else false 
	 */
	
	static boolean check(String s) {
		CustomStack<Character> st = new CustomStack<>();
		for (int i = 0; i < s.length(); i++) {
			/*
			 * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
			 * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
			 */
			char c = s.charAt(i);
			if (c == '(')
				st.push(s.charAt(i));
			else if (c == ')')
				st.pop();
		}
		return st.isEmpty();
	}
	
	static String[][] getMonthCalender(int month, int year){
		String []days = {"\t Sun","\t Mon","\tTue", "\t Wed","\tThu", "\t Fri", "\tSat"};
		int day = Util.dayOfWeek(1, month, year);
		int Month[] ={ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String MonthString[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		if(LeapYear.isLeap(year)){
			 Month[1]=29;
		}
		int weeks= (int)((Month[month-1]+day)/7)+1;
		String calender[][]= new String[weeks][days.length];
		int date=1;
		int i=0;
		 
		System.out.println("\t\t\t "+MonthString[month-1]+"\t "+year);
		System.out.println("\t--------------------------------------------------");
		
		for(int a=0; a<days.length; a++){
			 System.out.print(" "+days[a]);	
		}
		System.out.println();	
		System.out.println("\t--------------------------------------------------");
		
		while(i<day){
			 calender[0][i]="\t";
			 i++;	
		}
		
		i=day;
		
		for(int j=0; j<weeks; j++){
			for(; i<days.length; i++){
				if(date<=Month[month-1]) {
					 calender[j][i]="\t"+date;
					 date++;
				 }
				 else{
					 calender[j][i]="\t";
				 }
			 }
			 i=0;
		}
		return calender;
	 
	}
}
