package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
/**
 * Purpose : Stopwatch Program for measuring the time that elapses between the start and end clicks
 * @author : Tasif Mohammed
 * @version : 1.0
 * @since   20-02-2019
 **/
public class StopWatch {

	public static void main(String[] args) {
		calculateTime();
	}
	
	static void calculateTime(){
		long time1 = 0, time2 = 0;	//variables to store times of clicks
			
		System.out.println("Press the \"Enter\" the key to start time");
			
		String input = Utility.inputString();	//stores user input
			
		if(input.isEmpty()) {	//	enter key pressed
			time1	= System.currentTimeMillis();
		}
		
		System.out.println("Press the \"Enter\" the key to end time");
		
		input = Utility.inputString();
		if(input.isEmpty()) {	//	enter key pressed
			time2	= System.currentTimeMillis();
		}
		Utility.closeScanner();
		System.out.println("The elapsed time between start and end is: " + ((int)(time2 - time1) / 1000) + " seconds.");
	}

}
