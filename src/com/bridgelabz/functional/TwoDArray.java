package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
import java.io.*;
/**
 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   19-02-2019
 *
 **/
public class TwoDArray {
	/**
	  * The main function is written to read 2D Array and print it
	  **/
	public static void main(String[] args) {
		
		PrintWriter out = new PrintWriter(System.out);
		System.out.println("Enter the number of rows ");
		int row = Utility.inputInteger();
		System.out.println("Enter the number of columns ");
		int col = Utility.inputInteger();
		int arrIn[][] = new int[row][col];
		double arrDb[][] = new double[row][col];
		boolean arrBl[][] = new boolean[row][col];
		
		System.out.println("Enter the elements ");
		
		//Taking integer type array as input
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrIn[i][j]=Utility.inputInteger();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				out.print(arrIn[i][j]+"\t");
				out.flush();
			}
			out.println();
		}
		
		//Taking double type array as input 
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrDb[i][j]=Utility.inputDouble();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				out.print(arrDb[i][j]+"\t");
				out.flush();
			}
			out.println();
		}
		
		//Taking boolean type array as input
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arrBl[i][j]=Utility.inputBoolean();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				out.print(arrBl[i][j]+"\t");
				out.flush();
			}
			out.println();
		}
		
		//Closing Scanner
		
		Utility.closeScanner();
	}

}
