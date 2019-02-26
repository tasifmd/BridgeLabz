package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception{
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/Ordered.txt";
		String string = Utility.readFile(path);
        System.out.println("Enter the number to search :");
        String number = Utility.inputSingleString();
        DSUtil.orderedList(number, string);
	}

}
