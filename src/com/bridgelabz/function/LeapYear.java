package com.bridgelabz.function;
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
		
		int x=Utility.inputInteger();
		
		//Storing year in a temporary variable
		
		int temp=x;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		//Validating whether year is of four digit or not 
		
		if(count<4) {
			System.out.println("Enter Year in four digit ");
		}
		else if(count>=4 && x%4==0) {
			System.out.println(x+" is leap year ");
		}
		else {
			System.out.println(x+" is not leap year ");
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}
