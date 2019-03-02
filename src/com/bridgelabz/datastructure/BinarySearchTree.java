package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Program to generate Binary Search Tree
 * @author : Tasif mohammed
 * @since : 28-02-2019
 * @version : 1.0
 */
public class BinarySearchTree {

	public static void main(String[] args) {
		System.out.println("Enter the number of nodes ");
		int nodes = Utility.inputInteger();
		int[] intArr=new int[nodes];
	    for(int i=0;i<intArr.length;i++) {
	        	System.out.println("Enter the "+i+" th number:");
	        	intArr[i]=Utility.inputInteger();
	    }
	    double [] numbertimes=new double[intArr.length];
        for(int i=0;i<intArr.length;i++)
        {
        	//Method 1- using function of Utility class of com.bridgelabz.util package
        	numbertimes[i] =binaryCount(intArr[i]);
        }
         for(int i=0;i<numbertimes.length;i++)
         {
        	 System.out.println("Count of BST possibilities for "+  intArr[i] +" nodes is "+numbertimes[i]);
         }
	}
	
	/**
	 * Purpose : To find the binary count 
	 * @param n passing number ar argument 
	 * @return : count 
	 */
	public static double binaryCount(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
	}
	/**
	 * Purpose : To find out binomial co-efficient of number
	 * @param n double type number
	 * @param k double type number
	 * @return double type result
	 */
	public static double binomialCoeff(double n, double k) {
		int res = 1;
	    if (k > n - k) 
	        k = n - k;  
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

}
