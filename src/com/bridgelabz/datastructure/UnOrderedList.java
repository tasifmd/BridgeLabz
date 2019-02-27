package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) throws Exception{
		
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/UnOrdered.txt";
		
		//Reading the file and storing it in an array
		
		String string = Utility.readFile(path);
        System.out.println("Enter the word to search :");
        String searchWord = Utility.inputSingleString();
        
        //Calling unOrderedList of DSUtil class 
        
        DSUtil.unOrderedList(searchWord, string);
	}
}
