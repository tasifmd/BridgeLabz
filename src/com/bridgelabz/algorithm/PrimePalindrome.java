package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
/**
 *  Purpose: Take a range of Numbers and find the Prime numbers and Palindrome in that range
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
public class PrimePalindrome {

	public static void main(String[] args) {

		System.out.println("Enter the satrting number ");
		int x = Utility.inputInteger();
		System.out.println("Enter the ending number ");
		int y = Utility.inputInteger();
		prime(x,y);
		Utility.closeScanner();;

	}
	
	/**
	 * function to check whether number is prime or not
	 * @param x : passing starting number
	 * @param y : passing ending number
	 **/
	
	public static void prime(int x,int y) {
		for(int i=x;i<=y;i++) {
			int count=0;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count == 0){
				palindrome(i);
			}
		}
		
	}
	
	/**
	 * function to check whether number is palindrome or not
	 * @param i : passing prime number as argument
	 **/
	
	public static void palindrome(int i) {
		int temp = i,rev=0,rem=0;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(i==rev) {
			System.out.println(i);
		}
	}
}
