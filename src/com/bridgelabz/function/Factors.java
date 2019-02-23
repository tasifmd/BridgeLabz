/**
 *  Purpose: Computes the prime factorization of N using brute force.
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/package com.bridgelabz.function;
import com.bridgelabz.utility.*;

public class Factors {
	
	/**
	  * The main function is written to print the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
	  **/
	
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		
		//Taking an integer number as input
		
		int n=Utility.inputInteger();
		while (n%2==0){ 
			System.out.print(2 + " "); 
	        n /= 2; 
	    }
	    for (int i = 3; i*i <= n; i+= 2){ 
	    	while (n%i == 0){ 
	    		System.out.print(i + " "); 
	            n /= i; 
	        } 
	    }
	    if (n > 2) 
	    	System.out.print(n); 
	    
	    //Closing Scanner 
	    
		Utility.closeScanner();

	}

}
