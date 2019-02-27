package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
/**
 *  Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   19-02-2019
 *
 **/
public class CouponNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the Distinct Coupon Number ");
		int x=Utility.inputInteger();
		int count = collect(x);
        System.out.println("Total random number needed to have all distinct numbers "+count);
        Utility.closeScanner();
	}

	/**
	 * Purpose : To Collect the coupon Number
	 * @param n : passing a value n as argumrnt
	 * @return count : Returning the number of count 
	 **/
	
	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];  
	    int count = 0;                         
	    int distinct  = 0;                      
	    while (distinct < n) {
	    	int value = getCoupon(n); 
	    	//System.out.println(value);
	        count++;                             
	        if (!isCollected[value]) {           
	        	distinct++;
	        	System.out.println(distinct);
	            isCollected[value] = true;
	        }
	      }
	        return count;
	    }
	
		/**
		 * Purpose : Getting randomly generated coupon number
		 * @param n : Passing the value as argument
		 * @return randomly generated number  
		 **/ 
	
	    public static int getCoupon(int n) {
	        return (int) (Math.random() * n);
	        
	    }

}