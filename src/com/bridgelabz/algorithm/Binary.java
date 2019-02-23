package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Main class that access the functions of utility class 
 * @author Tasif Mohammed
 * @version 1.0
 * @since 23-02-2019
 **/
public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter the integer number");
		int i = Utility.inputInteger();
		String s1 = Util.toBinary(i);
		System.out.println("Binary number is "+ s1);
		int a = Util.swapNibbles(s1);
		System.out.println("After swaping nibbles and finding new number "+ a);
		boolean b = Util.isPowerOfTwo(a);
		System.out.println("Is the resultant number is the number is a power of 2 "+ b);
	}

}
