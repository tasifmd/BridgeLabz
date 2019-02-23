/**
 *  Purpose: Main Class that access all static methods Util Class
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/

package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class SearchMain {
	public static void main(String[] args) {
		System.out.println("Enter the size of Array ");
		int x = Utility.inputInteger();
		int arr[]=new int[x];
		System.out.println("Enter the elements of Array ");
		for(int i=0;i<x;i++) {
			arr[i] = Utility.inputInteger();
		}
		SearchMain.stopWatch(arr);
		System.out.println("Array after sorting is ");
		for(int a : arr) {
			System.out.print(a+"\t");
		}
	}
	
	/**
	 * function to calculate time
	 * @param arr : passing array as argument
	 **/
	
	static void stopWatch(int[] arr) {
		System.out.println("enter element to search");
		int n = Utility.inputInteger();
		long t1 = System.currentTimeMillis();
		int index = UtilitySearch.binary(arr, n);
		long t2 = System.currentTimeMillis();
		System.out.println(n + " found at index " + index + " in total time " + (t2 - t1) + " milliSeconds");
	}
}
