package com.bridgelabz.datastructure;

import com.bridgelabz.algorithm.Util;
import com.bridgelabz.functional.LeapYear;
import com.bridgelabz.utility.Utility;

/**Purpose : takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week
 * @author : Tasif Mohammed
 * @version : 1.0
 * @since : 28-2-2019
 */
public class CalenderStack {

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
