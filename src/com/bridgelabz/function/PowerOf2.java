/**
 *  Purpose: Takes an input N and prints a table of the powers of 2 that are less than or equal to 2^N.
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/
package com.bridgelabz.function;
import com.bridgelabz.utility.*;

public class PowerOf2 {
	
	/**
	  * The main function is written to find power of 2
	  **/
	
	public static void main(String[] args) {
		int pw=1;
		System.out.println("Enter the value ");
		
		//Taking number as input 
		
		int n=Utility.inputInteger();
		for(int i=0;i<=n;i++) {
			
			//Multiplying power with 2
			
			pw=pw*2;
			System.out.println("2^"+i+"\t"+pw);
		}
		
		//Closing Scanner
		
		Utility.closeScanner();

	}

}
