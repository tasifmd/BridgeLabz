package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
/**
 * Purpose:  takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions
 * 
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 **/
public class GuessAnswer {
	
	/**
	 * main function to take input and call find functiom
	 **/
	
	public static void main(String[] args) {	
		System.out.println("Enter the lower value ");
		int l = Utility.inputInteger();
		System.out.println("Enter the higher value ");
		int h = Utility.inputInteger();
		System.out.println("Guess value is " + find(l,h));
	}
	
	/**
	 * find function to fing the gussed number
	 * @param low : passing lower value as argument
	 * @param high : passing higher value as argument
	 * @return the low values
	 **/
	
	static int find(int low,int high) {

		int mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("Enter 'true' if no is between " + low + " - " + mid + "\tEnter 'false' if no is between "
					+ (mid + 1) + " - " + high);
			boolean b = Utility.inputBoolean();
			//mid = (low + high) / 2;
			if (b)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
}
