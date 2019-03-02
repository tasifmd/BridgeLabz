package com.bridgelabz.datastructure;

import com.bridgelabz.algorithm.Util;
import com.bridgelabz.functional.LeapYear;
import com.bridgelabz.utility.Utility;

public class CalenderStack {
	/*
	* The main function is to take the input from the user 
	* and printing the calendar by using queue and stacks 
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
		int dayofWeek = Util.dayOfWeek(month, 1, year);
		StackLinkedList<QueueLinkedList<Integer>> stack=new StackLinkedList<>();
		QueueLinkedList<Integer> refqueue=new QueueLinkedList<>();
		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + dayofWeek) % 7 == 0 || i==days[month]) ) {
				stack.push(refqueue);
				refqueue=new QueueLinkedList<Integer>();
				continue;
			}
		}	
		for (int i = 0; i < dayofWeek; i++)
		System.out.print("\t");
		int size = stack.getSize();
		StackLinkedList<QueueLinkedList<Integer>> stackNew = new StackLinkedList<>();
		
		for(int i=0; i < size; i++){
			stackNew.push(stack.pop());
		}

		for (int i = 0; i < size; i++) {
			QueueLinkedList<Integer> week = stackNew.pop();
			for (int j = 0; j < week.getSize(); j++) {
				System.out.print(week.remove() + "\t");
			}
			System.out.println();
		}}
}
