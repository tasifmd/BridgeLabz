package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
 *  Purpose: takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   20-02-2019
 *
 **/
public class WindChill {

	public static void main(String[] args) {
	
		System.out.println("Enter The Value of Temperature ");
		int t = Utility.inputInteger();
		System.out.println("Enter The Value of Wind Speed ");
		double v = Utility.inputInteger();
		if(t>50||v>120||v<3) {
			System.out.println("Formulla is not valid ");
		}else {
			double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			System.out.println("w = " + w);
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}
