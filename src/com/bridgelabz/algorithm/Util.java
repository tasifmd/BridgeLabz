package com.bridgelabz.algorithm;
/**
 *  Purpose: One Util class that contains some static function
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
public class Util {
	/**
	  * Purpose: takes a date as input and prints the day of the week that date falls on
	  * @param d : passing date as argument
	  * @param m : passing month as argument
	  * @param y : passing year as argument
	  * @return date
	  **/
	public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
	
	/**
	  * Purpose: given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula
	  * @param tem : passing temperature as argument
	  * @param t : passing Celsius or Fahrenheit as String
	  * @return converted temperature
	  **/
	
	public static double temperaturConversion(double tem, String t) {
		double con;
		if (t.equals("c") || t.equals("C")) {
			con = (tem * 9 / 5) + 32;
		} else if (t.equals("f") || t.equals("F")) {
			con = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return con;
	}

	/**
	  * Purpose: reads in three command-line arguments P, Y, and R and calculates the monthly payments
	  * @param P : passing principal as argument
	  * @param Y : passing year as argument
	  * @param R : passing rate as argument
	  * @return payment
	  **/
	
	public static double monthlyPayment(double P, int Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = P * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}
	
	/**
	  * Purpose: compute the square root of a nonnegative number c given in the input using Newton's method
	  * @param c : passing number as argument
	  * @return square root of number 
	  **/
	
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
		
	}
	
	/**
	 * Purpose : function to convert integer to binary
	 * @param number : passing integer as an argument to be converted to binary
	 * @returns string representing binary of number
	 **/
	public static String toBinary(int number) {
		if(number == 1) {
			return String.valueOf(number);
		}
		int remainder = number % 2;
		return toBinary(number / 2) + String.valueOf(remainder);
	}
	
	/**
	 * Purpose : converts binary number to decimal.
	 * @param binary : passing binary as an argument to be converted to integer
	 * @return integer type value 
	 **/
	public static int binaryToInteger(int binary) {
		String binaryString = String.valueOf(binary);
		int number = 0;
		for (int index = 0; index < binaryString.length(); index++) {
			int tempDigit = binaryString.charAt(index) - '0';
			number = number * 2 + tempDigit; 
		}
		return number;
	}
	/**
	 * Purpose : Swap nibbles and find the new number
	 * @param binaryString
	 * @return
	 **/
	public static int swapNibbles(String binaryString) {
		int size = binaryString.length();
		for(int i = 0; i < 8 - size; i++) {
			binaryString = "0" + binaryString;
		}
		String nibble1 = binaryString.substring(0, 4);
		String nibble2 = binaryString.substring(4);
		return Integer.parseInt(nibble2 + nibble1);
	}
	
	/**
	 * Purpose : Find the resultant number is the number is a power of 2 or not 
	 * @param binary : passing binary as an argument to be checked for 
	 * @return true if it is power of 2 else false 
	 **/
	
	public static boolean isPowerOfTwo(int binary) {
		String binaryString = String.valueOf(binary);
		
		for (int index = 1; index < binaryString.length(); index++) {
			if(binaryString.charAt(index) != '0') {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Purpose : static functions to return all permutation of a String
	 * @param first : passing String as argument 
	 * @param last : passing String as argument 
	 **/
	public void permute(String first, String last) {
		int size = last.length();
		if (size == 0) {
			System.out.println(first);
		} else {
			for (int i = 0; i < size; i++) {
				String myFirst = first + last.charAt(i);
				String myLast = last.substring(0, i) + last.substring(i + 1 , size);
				permute(myFirst, myLast);
			}
		}
	}
}
