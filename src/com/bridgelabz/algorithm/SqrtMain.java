/**
 *  Purpose: Main class that access sqrt function of Util Class
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class SqrtMain {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		double x = Utility.inputInteger();
		double s = Util.sqrt(x);
		System.out.println(s);

	}

}
