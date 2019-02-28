package com.bridgelabz.datastructure;
import java.util.*;
import com.bridgelabz.utility.*;
public class HashingFunction {
	
	public static void main(String[] args) throws Exception{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> ls = null;
		Map<Integer,LinkedList<Integer>> map = new HashMap<Integer,LinkedList<Integer>>() ;
		for(int i = 0 ; i <= 10 ; i++) {
			ls = new LinkedList<Integer>();
			map.put(i, ls);
		}
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/Hashing.txt";
		String string = Utility.readFile(path);
		String[] array = string.split(" ");
		Arrays.parallelSort(array);
		int[] intarr = Utility.stringToIntArray(array);
		for(int i : intarr) {
			list1.add(i);
		}
		System.out.print("Sorted list is ");
		System.out.println(list1);
		System.out.println("Dividing each number by 11");
		for(int i = 0 ; i<intarr.length ; i++) {
			int remender = intarr[i]%11;
			if(map.isEmpty()){
				ls.add(intarr[i]);
				map.put(remender, ls);
			}else {
				ls = map.get(remender);
				if(ls.size()==0) {
					ls.add(intarr[i]);
				} else {
					if(!ls.contains(intarr[i])) {
						ls.add(intarr[i]);
					}
				}
				map.put(remender, ls);
			}
		}
		for(int i = 0 ; i < map.size() ; i++) {
			LinkedList<Integer> ali = map.get(i);
			System.out.print(ali+ " ");
		}
		
		int i = 0;
		do {
			System.out.println("\nEnter choice");
			System.out.println("1:Search for the number  2:Write  3:Exit");
			int choice = Utility.inputInteger();
			switch(choice) {
			case 1:
				System.out.println("Enter number you want to search ");
				int number = Utility.inputInteger();
				boolean status = ls.contains(number);
				if(status) {
					System.out.println("Number is found");
					System.out.println("Fetching the index of the number");
					int index = ls.indexOf(number);
					System.out.println("Index is : " + index);
					ls.remove(index);
					System.out.println("After removing list is " + ls);
				}
			}
		}while(i<5);
	}

}
