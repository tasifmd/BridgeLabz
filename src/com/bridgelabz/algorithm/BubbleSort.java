
package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
/**
 * Purpose : Reads in integers prints them in sorted order using Bubble Sort
 * 
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   22-02-2019
 **/
public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array ");
		int x = Utility.inputInteger();
		int[] arr = new int[x];
		System.out.println("Enter the elements of array ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Utility.inputInteger();
		}
		System.out.println("Elements before sort ");
		print(arr);
		System.out.println("\nElements after sort ");
		bubbleSort(arr);
		print(arr);
		
		//Closing Scanner
		
		Utility.closeScanner();
	}
	
	/**
	 * function to print integer array
	 * @param a: passing integer array as argument 
	 **/
	
	public static void print(int[] a) {
		for(int i : a) {
			System.out.print(i+"\t");
		}
	}
	
	/**
	 * function to sort integer array using bubble sort
	 * @param arr: passing integer array as argument 
	 **/
	
	public static void bubbleSort(int arr[]) { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
        }
    }
}
