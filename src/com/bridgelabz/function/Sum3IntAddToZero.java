package com.bridgelabz.function;
import com.bridgelabz.utility.*;
/**
 *  Purpose: A program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   19-02-2019
 *
 **/
public class Sum3IntAddToZero {
	
	/**
	  * The main function is written to read 2D Array and print it
	  **/
	
	public static void main(String[] args) {
		System.out.println("Enter the number of elements ");
		int x = Utility.inputInteger();
		int[] arr= new int[x];
		boolean found = true; 
		
		//Taking array as input
		
		for(int i=0;i<x;i++) {
				arr[i]=Utility.inputInteger();
		}
		int n=arr.length;
		for (int i=0; i<n-2; i++) { 
			for (int j=i+1; j<n-1; j++) { 
				for (int k=j+1; k<n; k++) { 
					if (arr[i]+arr[j]+arr[k] == 0) { 
						System.out.print(arr[i]); 
		                System.out.print("\t"); 
		                System.out.print(arr[j]); 
		                System.out.print("\t"); 
		                System.out.print(arr[k]); 
		                System.out.print("\n"); 
		                found = true; 
		             }
		        } 
		    } 
		} 
		
		//If no such element found then print not exist
		
		if (found == false) 
			System.out.println("not exist "); 
		
		//Closing Scanner Object
		
		Utility.closeScanner();
	}

}
