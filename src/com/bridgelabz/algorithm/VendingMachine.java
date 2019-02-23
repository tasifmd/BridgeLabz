/**
 * Purpose : to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * 
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   22-02-2019
 **/

package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;

public class VendingMachine {
	
	static int i,total; 
	static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
	
	public static void main(String[] args) {
		System.out.println("Enter the amount ");
		int x = Utility.inputInteger();
		notes(x);
		Utility.closeScanner();
	}
	
	/**
	 *Function to calculate number of notes generated
	 *@param value : passing amount  as a parameter
	 **/
	
	static void notes(int value) {
		if (value / notes[i] != 0) {
			total = total+ (value / notes[i]);
			System.out.println("Number of "+notes[i] + "RS notes is " + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) {
			System.out.println("Total number of notes is " + total);
			return;
		}

		notes(value);

	}
}
