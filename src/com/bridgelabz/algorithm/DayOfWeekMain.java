package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;

/**
 *  Purpose: Main class that access dayOfWeek function of Util Class
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   23-02-2019
 *
 **/

public class DayOfWeekMain {

	public static void main(String[] args) {
		System.out.println("Enter the date, month and year ");
		int mm = Utility.inputInteger();
		int dd = Utility.inputInteger();
		int yyyy = Utility.inputInteger();
		int d=Util.dayOfWeek(dd, mm, yyyy);
		System.out.println(d);
		Utility.closeScanner();
	}

}
