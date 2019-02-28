package com.bridgelabz.utility;
import java.io.*;
import java.util.*;

import com.bridgelabz.datastructure.CustomLinkedList;
/**
 *  Compilation:  javac -d bin Utility.java
 *  Purpose: Root class Scanner to reuse in other program .
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   18-02-2019
 *
 **/
public class Utility {
	
	//Creation of Scanner Object
	static Scanner sc = new Scanner(System.in);
	

	/**
	 * Static Function to check for inputing integer. 
	 *
	 * @return integer of Scanner Type
	 **/
	
	public static int inputInteger() {
		return(sc.nextInt());
	}
	
	/**
	 * Static Function to check for inputing double. 
	 *
	 * @return double of Scanner Type
	 **/
	
	public static double inputDouble() {
		return(sc.nextDouble());
	}
	
	/**
	 * Static Function to check for inputing float 
	 *
	 * @return float of Scanner Type
	 **/
	
	public static float inputFloat() {
		return(sc.nextFloat());
	}
	
	/**
	 * Static Function to check for inputing long. 
	 *
	 * @return long of Scanner Type
	 **/
	
	public static long inputLong() {
		return(sc.nextLong());
	}
	
	/**
	 * Static Function to check for inputing String. 
	 *
	 * @return String of Scanner Type
	 **/
	
	public static String inputString() {
		return(sc.nextLine());
	}
	
	/**
	 * Static Function to check for inputing Single String Word that doesn't contains any spaces. 
	 *
	 * @return double of Scanner Type
	 **/
	
	public static String inputSingleString() {
		return(sc.next());
	}
	
	/**
	 * Static Function to check for inputing boolean. 
	 *
	 * @return boolean of Scanner Type
	 **/
	
	public static boolean inputBoolean() {
		return(sc.nextBoolean());
	}
	
	/**
	 * Static Function to close the Scanner Object. 
	 *
	 **/
	public static void closeScanner() {
		sc.close();
	}
	
	/**
	 * Purpose : Function to read data from a file 
	 * @param filename : Passing file location as an argument
	 * @return : data of file as a string 
	 * @throws IOException
	 */
	public static String readFile(String filename) throws IOException{
		
		//Creating FileReader Object
		
		FileReader fileReader = new FileReader(filename);
		
		//Creating BufferedReader Object
		
		BufferedReader bufferedreader = new BufferedReader(fileReader);
		String line;
		
		//Creating StringBuilder Object
		
		StringBuilder sb = new StringBuilder();
		while ((line = bufferedreader.readLine()) != null){
			
			//Appending line by line 
			
			sb.append(line);
		}
		System.out.println(sb);
		
		//closing the FileReader object
		
		fileReader.close();
		
		//closing the BufferedReader object
		
		bufferedreader.close();
		
		//Returning the String 
		
		return sb.toString();
	}
	
	/**
	 * Purpose : Function to write data into the file 
	 * @param filename : Passing file name as an argument
	 * @param items : Passing List items as an argument
	 * @throws IOException : That is checked exception
	 */
	
	public static void writeFile(String filename,CustomLinkedList items) throws IOException{
		FileWriter filewriter = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(filewriter);
		for(int i =0 ; i<items.size();i++) {
			filewriter.write(items.getElement(i)+" ");
		}
		System.out.println("File Writted Successfully");
		bw.close();
		filewriter.close();
	}	
	public static int[] stringToIntArray(String[] arr) {
		int l = arr.length;
		int[] iarr = new int[l];
		for(int i = 0 ; i<l ; i++) {
			iarr[i] = Integer.parseInt(arr[i]);
		}
		return iarr;
	}
	
	public static void print2DArray(String arr[][])
	{
		int m=arr.length;
		int n=arr[0].length;
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
