package com.bridgelabz.functional;
/**
 *  Purpose: takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   19-02-2019
 *
 **/
public class Distance {

	public static void main(String[] args) {
		
		int  x = Integer.parseInt(args[0]);
		int  y = Integer.parseInt(args[1]);
		//Calculating the distance from one coordinate to another coordinate
		double d = Math.sqrt(x*x + y*y);
		System.out.println("The Distance From Point (" + x + "," + y + ") to Origin (0,0) is " + d);
		
	}

}
