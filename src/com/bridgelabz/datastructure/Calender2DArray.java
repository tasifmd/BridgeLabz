package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week
 * @author Tasif Mohammed
 * @version 1.0
 * @since 28-02-2019
 */
public class Calender2DArray {

	public static void main(String[] args) {
		System.out.println("Enter the month ");
		int month = Utility.inputInteger();
		System.out.println("Enter the year ");
		int year = Utility.inputInteger();
		
		//Generating Calender 
		
		String calender[][]=DSUtil.getMonthCalender(month,year);
		
		//Printing the Calender 
		
		Utility.print2DArray(calender);
		System.out.println("\t-----------------------------------------------------");
		
		//Closiing the Scanner
		
		Utility.closeScanner();
	}

}
