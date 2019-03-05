package com.bridgelabz.datastructure;

import java.io.*;
import java.util.*;

import com.bridgelabz.algorithm.*;
import com.bridgelabz.functional.*;
import com.bridgelabz.utility.*;

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
		LinkedList li = new LinkedList();
		
		//Adding data into List

		System.out.println("Words of string are");
		for(String s : stringArr) {
			System.out.print(s+",");
			li.insertAtLast(s);
		}
		
		//Searching the word if available remove it from list
		System.out.println("List Value ");
		
		if(li.search(searchWord)) {
			System.out.println("\nThe word is available in the linked list , remove it ");
			li.delete(searchWord);
			li.show();
		}
		
		//Searching the word if not available add it to list
		
		else {
			System.out.println("\nThe word is not available in the linked list , add it ");
			li.insertAtLast(searchWord);
			li.show();
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
		LinkedList list = new LinkedList();
		System.out.println("Numbers in file are ");
		
		//Adding data into List
		
		for(String s : stringArr) {
			System.out.print(s + "\t");
			list.insertAtLast(s);
			list.sortList();
		}
		
		//Searching the word if available remove it from list
		
		//Searching the word if available remove it from list
		System.out.print("\nList is " );
		list.show();
		System.out.println();
		if(list.search(searchNumber)) {
			System.out.println("\nThe number is available in the linked list , remove it ");
			list.delete(searchNumber);
			list.show();
		}
				
		//Searching the word if not available add it to list
				
		else {
			System.out.println("\nThe number is not available in the linked list , add it ");
			list.insertAtLast(searchNumber);
			String[] array = listToArray(list);
			list = arrayToList(array);
			list.show();
		}
		//list.sortList();
		//Writting data into the file 
		
		Utility.writeFile(path,list);
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
			 * push open parenthesis â€œ(â€œ and pop closed parenthesis â€œ)â€�. At the End of the
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
	
	/**
	 * Purpose : prints the Calendar of the month.
	 * @param month : Passing month as an argument 
	 * @param year : Passing year as an argument 
	 * @return the calender as 2D Array
	 */
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
		System.out.println("\t-----------------------------------------------------");
		System.out.println("\t\t\t "+MonthString[month-1]+"\t "+year);
		System.out.println("\t-----------------------------------------------------");
		
		for(int a=0; a<days.length; a++){
			 System.out.print(" "+days[a]);	
		}
		System.out.println();	
		System.out.println("\t-----------------------------------------------------");
		
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
	
	/**
	 * Purpose : Function to get prime number as a list
	 * @param m : Passing lower limit m as an argument
	 * @param n : Passing higher limit n as an argument
	 * @return the prime number as a list
	 */
	public static List<Integer> primeNumbers(int m,int n) {
		List<Integer> lst=new ArrayList<Integer>();
		int temp;

		//swapping of bounds if the given lower bound is greater than upper bound
		if(m>n) {
			temp=m;
			m=n;
			n=temp;}
		int flag=1;
		//try all the possible values from lower bound to upper bound
		//if the number has the factor then it must be checked within lower bound
		for(int i=m;i<=n;i++){
			for(int j=2;j<i;j++){
				//If the number is divisible by any of the number then 
				//initializing flag to zero and break
				//else flag is initialized to one
				if(i%j==0){
					flag=0;
					break;}
				else
					flag=1;}
			//If the number is prime which is indicated by the flag,
			//then adds the number into an ArrayList.
			if(flag==1)
				lst.add(i);}
		return lst;
	}
	
	/**
	 * Purpose : Function to get anagram number as a Set
	 * @param primeList : Passing list object as an argument
	 * @return the anagram number as a Set
	 */
	
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagramSet=new HashSet<>();
		for(int i=0;i<primeList.size();i++) {
			for(int j=i+1;j<primeList.size();j++){
				if(isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i)+"    "+primeList.get(j) ); }}}
		return primeAnagramSet;
	}
	
	/**
	 * Purpose : Function to check a String is anagram or not 
	 * @param word : Passing the word to check whether it is anagram or not  
	 * @param anagram : Passing the another String with whom anagram to be checked
	 * @return boolean value after checking is done 
	 */
	public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            //int wordLength = FunctionalUtility.readInteger();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
            
        }
        return isAnagram;
    }
	
	/**
	 * Purpose : Function to check Prime And Anagram
	 * @param primeList : Passing List object as an argument
	 * @return prime and anagram number as queue
	 */
	public static CustomQueue primeAnagramQue(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (isAnagram(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return (CustomQueue) primeAnagram;
	}
	
	public static String[] listToArray(LinkedList list) {
		String[] arr = new String[list.size()];
		for (int i = 0 ; i<list.size() ; i++ )
			arr[i] = list.getElement(i);
		Arrays.parallelSort(arr);
		return arr;
	}
	
	public static LinkedList arrayToList(String[] array) {
		LinkedList list = new LinkedList();
		for(String str : array) {
			list.insertAtLast(str);
		}
		return list;
	}
}
