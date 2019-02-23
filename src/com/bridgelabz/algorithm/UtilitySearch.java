package com.bridgelabz.algorithm;
/**
 *  Purpose: Utility class that contains all static methods
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   21-02-2019
 *
 **/
public class UtilitySearch {
	
	/**
	 * function for bubble sort of integer
	 * @param arr : Passing array as argument
	 * @return the sorted array
	 **/
	
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	/**
	 * function for bubble sort of String
	 * @param arr : passing the array as argument
	 **/
	
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}
	
	/**
	 * function for binary search of integer
	 * @param arr : passing array as argument
	 * @param n : passing the searching iteam
	 * @return -1 when element is found
	 **/
	
	public static int binary(int[] arr, int n) {
		int high = arr.length - 1, low = 0, mid;
		arr = bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (n == arr[mid]) {
				return mid;
			} else if (arr[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	/**
	 * function for binary search of String
	 * @param arr : passing array as argument
	 * @param s : passing string as argument
	 * @return -1 after search complete
	 **/
	
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	/**
	 * function for insertion sort of integer
	 * @param arr : passing array as parameter
	 **/
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
	}
	
	/**
	 * function for insertion sort of String
	 * @param arr : passing array as argument
	 * @return the sorted array
	 **/
	
	public static String[] insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0) {
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

}
