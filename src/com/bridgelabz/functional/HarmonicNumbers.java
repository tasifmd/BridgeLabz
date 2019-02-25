package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
*  Purpose: Print the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
*
*  @author  Tasif Mohammed
*  @version 1.0
*  @since   18-02-2019
*
**/

public class HarmonicNumbers {
	
	/**
	  * The main function is written to print the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	  **/
	
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		int n=Utility.inputInteger();
		double res=0.0;
		int i=0;
		for(i=1;i<=n;i++){
			res=res+(double)1/i;
			System.out.print("1/"+i+"  +  ");
		}
		System.out.println();
		System.out.println("Nth Harmonic value is " + res);
		Utility.closeScanner();
	}

}
