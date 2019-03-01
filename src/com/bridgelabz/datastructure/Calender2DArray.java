package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Calender2DArray {

	public static void main(String[] args) {
		System.out.println("Enter the month ");
		int month = Utility.inputInteger();
		System.out.println("Enter the year ");
		int year = Utility.inputInteger();
		String calender[][]=DSUtil.getMonthCalender(month,year);
		Utility.print2DArray(calender);
		System.out.println("\t-----------------------------------------------------");
		Utility.closeScanner();
	}

}
