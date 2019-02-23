/**
 *  Purpose: One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String str1=Utility.inputString();
		System.out.println("Enter the secound string");
		String str2=Utility.inputString();
		boolean b = anagram(str1,str2);
		if(b) {
			System.out.println("String is Anagram");
		}
		else {
			System.out.println("String is not Anagram");
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}
	
	/**
	  *Function to check whether strings are anagram
	  *@param s1 : First String
	  *@param s2 : Second String
	  *@return true if strings are anagram else false
	  **/
	
	private static boolean anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String st1 = new String (c1);
		String st2 = new String (c2);
		if(st1.equals(st2)) {
			return true ;
		}else{
			return false ;
		}
	}

}
