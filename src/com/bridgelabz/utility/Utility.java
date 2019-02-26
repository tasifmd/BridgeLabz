package com.bridgelabz.utility;
import java.io.*;
import java.util.*;
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
	
	public static String readFile(String filename) throws IOException{
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedreader = new BufferedReader(fileReader);
		String line;
		StringBuilder sb = new StringBuilder();
		while ((line = bufferedreader.readLine()) != null){
			sb.append(line);
		}
		System.out.println(sb);
		fileReader.close();
		bufferedreader.close();
		return sb.toString();
	}
	
	public static void writeFile(String filename,List<String> items) throws IOException{
		FileWriter filewriter = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(filewriter);
		for(String s : items) {
			filewriter.write(s+" ");
		}
		bw.close();
		filewriter.close();
	}
	
	public static List<Object> arrayToList(Object[] array) {
		List<Object> list = new LinkedList<Object>();
		for(Object s : array) {
			list.add(s);
		}
		return list;
	}
	
}
