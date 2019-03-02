package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : construct an algorithm to input a string of characters and check whether it is a palindrome
 * @author : Tasif Mohammed
 * @version : 1.0
 * @since : 27-02-2019
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		CustomDequeue dq = new CustomDequeue();
		System.out.print("Enter a string to check poalindrome ");
		
		//Taking input string 
		
		String palindrome = Utility.inputSingleString();
		for (int i = 0 ; i <= palindrome.length()-1 ; i++) {
			String ch = String.valueOf(palindrome.charAt(i));
			dq.insertFront(ch);
		}
		boolean bol = false ;
		for (int i = 0 ; i <= palindrome.length()-1 ; i++) {
			if(String.valueOf(palindrome.charAt(i)).equals(dq.peakFront())) {
				dq.removeFront();
				bol = true ;
			}else {
				bol = false ;
				break;
			}
		}
		
		//Checking if the String is palindrome or not 
		
		if(bol){
			System.out.println("String is palindrome ");
		}
		else {
			System.out.println("String is not palindrome ");
		}
	}
}
