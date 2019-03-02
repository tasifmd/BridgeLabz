package com.bridgelabz.datastructure;

import com.bridgelabz.algorithm.Util;
import com.bridgelabz.functional.LeapYear;
import com.bridgelabz.utility.Utility;

/**
 * Purpose : Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are stored in a Queue implemented using Linked List. Further maintain also a Week Object in a Queue to finally display the Calendar
 * @author : Tasif Mohammed
 * @since : 28-02-2019
 * @version : 1.0
 */

public class CalenderQueue {
	
	/**
	 * The main function is to take the input from the user 
	 * and printing the calendar by using queue 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the month ");
		int month = Utility.inputInteger();
		System.out.println("Enter the year ");
		int year = Utility.inputInteger();
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && LeapYear.isLeap(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + "\t\t" + year);
		System.out.println("---------------------------------------------------");
		System.out.println("Sun     Mon     Tue     Wed     Thu     Fri    Sat ");
		System.out.println("---------------------------------------------------");
		int dayofWeek = Util.dayOfWeek(1, month, year);
		QueueLinkedList<QueueLinkedList<Integer>> queue=new QueueLinkedList<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> refqueue=new QueueLinkedList<Integer>();
		
		
		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
				queue.insert(refqueue);
				refqueue=new QueueLinkedList<Integer>();
				continue;
			}
		}	
		for (int i = 0; i < dayofWeek; i++)
		System.out.print("\t");
		for(int i=0;i<=queue.getSize();i++)
		{
			QueueLinkedList<Integer> week=queue.remove();
			for(int j=0;j<week.getSize();j++)
			{
				System.out.print(week.remove()+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------");
}

}
