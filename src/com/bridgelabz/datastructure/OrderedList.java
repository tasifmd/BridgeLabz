package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Read a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position
 * @author Tasif Mohammed
 * @version 1.0
 * @since   26-02-2019
 */
public class OrderedList {
	public static void main(String[] args) throws Exception{
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/Ordered.txt";

		//Reading the file and storing it in an array
		
		String string = Utility.readFile(path);
        System.out.println("Enter the number to search :");
        String number = Utility.inputSingleString();

        //Calling unOrderedList of DSUtil class 
        
        DSUtil.orderedList(number, string);
        
        //Closing Scaner
        
        Utility.closeScanner();
	}
}
