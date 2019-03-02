package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Read the Text from a file, split it into words and arrange it as Linked List.Take a user input to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove the word from the List. In the end save the list into a file
 * @author Tasif Mohammed
 * @version 1.0
 * @since 25-02-2019
 */
public class UnOrderedList {
	public static void main(String[] args) throws Exception{
		
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/UnOrdered.txt";
		
		//Reading the file and storing it in an array
		
		String string = Utility.readFile(path);
        System.out.println("Enter the word to search :");
        String searchWord = Utility.inputSingleString();
        
        //Calling unOrderedList of DSUtil class 
        
        DSUtil.unOrderedList(searchWord, string);
        
        //Closing Scanner
        
        Utility.closeScanner();
	}
}
