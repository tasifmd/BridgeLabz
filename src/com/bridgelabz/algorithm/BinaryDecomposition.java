package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinaryDecomposition {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int no = Utility.inputInteger();
		String binary = Util.toBinary(no);
		System.out.println("Binary representation of the number: " + binary);
		System.out.println("Addition: " + Util.paddedString(no));
	}

}
