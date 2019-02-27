package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/

public class FlipCoin {
	/**
	  * The main function is written to Flip Coin and print percentage of Heads and Tails
	  **/
	public static void main(String[] args) {
		double heads=0.0,tails=0.0;
		System.out.println("Enter the number of flip ");
		
		//Taking number of inputs as integer
		
		int n=Utility.inputInteger();
		
		//Checking if the entered number is positive or not 
		
		if(n<0) {
			System.out.println("Please Enter a positive Value");
		}
		for(int i=0;i<n;i++) {
			
			 //Randomly Generating The value 
			
		      if (Math.random() < 0.5) {
		    	  System.out.println("Tails");
		    	  tails++;
		      }
		      else {
		    	  System.out.println("Heades");
		    	  heads++;
		      }
		}
		double head_per=(double)heads/n*100;
		System.out.println("Persentage of Heads is "+head_per);
		double tail_per=(double)tails/n*100;
		System.out.println("Persentage of Tails is "+tail_per);

		//Closing Scanner
		
		Utility.closeScanner();
	}

}
