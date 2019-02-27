package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
 *  Purpose: Take User Name as Input Replace <<UserName>> with the proper name Print the String with User Name.
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/
public class StringWelcome {
	/**
	  * The main function is written to test User name and display message
	  **/
	public static void main(String[] args) {
		
		String s1 = "Hello Tasif, how are you?";
		System.out.println(s1);
		System.out.println("Enter the name ");
		
		// Taking User name as Input through Scanner Object
		
		String str=Utility.inputString();
		
		//Checking wheather user name contains atleast three character
		
		if(str.length()>=3) {
			//replacing the string with the username
	        String string = s1.replace("Tasif",str); 
	        System.out.println(string);
		}
		else {
			 System.out.println("please name of three character");
		}
		
		//Closing Scanner Object
		
		Utility.closeScanner();
	}

}
