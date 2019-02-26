package com.bridgelabz.datastructure;
import com.bridgelabz.utility.*;

public class UnOrderedList {
	 
	public static void main(String[] args) throws Exception{
	
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/UnOrdered.txt";
		String string = Utility.readFile(path);
        System.out.println("Enter the word to search :");
        String searchWord = Utility.inputSingleString();
        DSUtil.unorderedList(searchWord, string);
	}
}
