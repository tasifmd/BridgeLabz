/**
 *  Purpose: Take User Name as Input Replace <<UserName>> with the proper name Print the String with User Name.
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/
package com.bridgelabz.function;
import com.bridgelabz.utility.*;

public class StringWelcome {
	/**
	  * The main function is written to test User name and display message
	  **/
	public static void main(String[] args) {
		System.out.println("Enter the name ");
		
		// Taking User name as Input through Scanner Object
		
		String str=Utility.inputString();
		String st1="Hello ";
		String st2=",How are you";
		
		//Checking wheather user name contains atleast three character
		 
		if(str.length()<3) {
			System.out.println("Enter the name of atleast three character");
			System.exit(0);
		}
		else {
			System.out.println(st1+str+st2);
		}
		
		//Closing Scanner Object
		
		Utility.closeScanner();
	}

}
