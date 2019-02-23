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
	static int dayOfWeek(int d, int m, int y) {
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
	
	static double temperaturConversion(double tem, String t) {
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
	
	static double monthlyPayment(double P, int Y, double R) {
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
	
	static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
		
	}
	
}
