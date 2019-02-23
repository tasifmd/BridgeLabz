/**
 *  Purpose: Take a range of Numbers and find the Prime numbers in that range
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;

public class Prime {

	public static void main(String[] args) {
		
		System.out.println("Enter the satrting number ");
		int x = Utility.inputInteger();
		System.out.println("Enter the endinging number ");
		int y = Utility.inputInteger();

		//Checking number is prime or not
		
		for(int i=x;i<=y;i++) {
			int count=0;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count == 0)
				System.out.println(i+"\t");
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}
}
