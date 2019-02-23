package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
/**
 * Purpose : Reads in strings from standard input and prints them in sorted order. Uses insertion sort.
 * 
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   22-02-2019
 **/
public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int n = Utility.inputInteger();
		String[] arr = new String[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			arr[i] = Utility.inputSingleString();
		}
		System.out.println("Array before sorting is ");
		print(arr);
		System.out.println("\nArray after sorting is ");
		sort(arr);
		print(arr);
	}
	
	/**
	 * function to print String array 
	 * @param : passing string array as argument 
	 **/
	
	public static void print(String[] a) {
		for(String s : a) {
			System.out.print(s+"\t");
		}
	}
	
	/**
	 * function to print String array 
	 * @param : passing string array as argument 
	 **/
	
	public static void sort(String arr[]) { 
		String temp;
        for(int i = 1; i < arr.length; i++){
             temp = arr[i];
             int j = 0;
             for(j = i; j > 0; j--) {
                  if(temp.compareTo(arr[j - 1]) < 0)
                       arr[j] = arr[j - 1];
                  else
                      break;
             }
             arr[j] = temp;
        }
	} 
}
