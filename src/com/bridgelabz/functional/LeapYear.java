package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
 *  Purpose: Check wheather year is leap year or not
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/
public class LeapYear {
	
	/**
	  * The main function is written to Check whether year is leap year or not
	  **/
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the year ");
		
		//Giving integer input as year
		
		int year=Utility.inputInteger();
		
		//Storing year in a temporary variable
		
		int temp=year;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		//Validating whether year is of four digit or not 
		
		if(count<4) {
			System.out.println("Enter Year in four digit ");
		}
		else {
			isLeap(year);
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}
	
	/**
	 * Purpose : Check whether a year is leap or not
	 * @param year : Passes year as an argument 
	 * @return true if year is leap else false 
	 */
	static boolean isLeap(int year) {
		if(year % 400 == 0) {
			return true;
		}
		if(year % 100 == 0) {
			return false;
		}
		if (year % 4 == 0) {
			return true ;
		}
		return false;
	}
}
