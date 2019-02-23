/**
 *  Purpose: Print Number of Wins and Percentage of Win and Loss of Gambler 
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   19-02-2019
 *
 **/
package com.bridgelabz.function;
import com.bridgelabz.utility.*;

public class Gambler {
	
	/**
	  * The main function is written to Print Number of Wins and Percentage of Win and Loss of Gambler 
	  **/
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Stake ");
		
		//Take stake as Input Integer
		
		int x=Utility.inputInteger();
		System.out.println("Enter the Goals");
		
		//Take Goal as Input Integer
		
		int y=Utility.inputInteger();
		System.out.println("Enter the Number Of Times ");
		
		//Take Number Of Times as Input Integer
		
		int z=Utility.inputInteger();
		int bets = 0 , wins = 0; 
		for(int i=0;i<z;i++) {
			int cash=x;
			while (cash>0 && cash<y) {
				bets++;
				if (Math.random() < 0.5)
					cash++;  
                else
                	cash--;
			}
			// if Gambler wins
			
			if (cash == y) {
				wins++;  
				System.out.println("Won");
			}
						
			//if Gambler lost
						
			else {
				System.out.println("Lost");
			}   
		}
		System.out.println(wins + " wins of " + z);
	    System.out.println("Percent of games won = " + 100.0 * wins / z);
	    System.out.println("Avg bets = " + 1.0 * bets / z);
	    
	  //Closing Scanner
	    
	    Utility.closeScanner();
	    
	}

}
