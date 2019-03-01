package com.bridgelabz.datastructure;
import com.bridgelabz.utility.*;
public class HashingFunction {
	
	public static void main(String[] args) throws Exception{
		LinkedList numberlist[] = new LinkedList[11];
		for(int i = 0 ; i <= 10 ; i++) {
			numberlist[i] = new LinkedList();
		}
		String path = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/Hashing.txt";
		String writepath = "/home/admin1/eclipse-workspace/tasif/bridgelabz/MyProject/src/com/bridgelabz/datastructure/writefile.txt";
		String fullString = Utility.readFile(path);
		String[] numberArray =  fullString.split(" ");
		int remainder,integernumber;
		for(int i = 0 ; i < numberArray.length ; i++) {
			integernumber = Integer.parseInt(numberArray[i]);
			remainder = integernumber % 11 ;
			numberlist[remainder].insertAtLast(numberArray[i]);
		}
		for(int i = 0 ; i < 11 ; i++) {
			if(numberlist[i].isEmpty()) {
				continue ;
			}
			System.out.print("numberlist[" + i + "]--->");
			numberlist[i].show();
			System.out.println();
		}
		System.out.println("Enter a number to search ");
		String element = Utility.inputSingleString();
		int convertedInt = Integer.parseInt(element);
		remainder = convertedInt % 11 ;
		if(numberlist[remainder].search(element)) {
			numberlist[remainder].delete(element);
		}
		else {
			numberlist[remainder].insertAtLast(element);
		}
		
		for(int i=0;i<11;i++) {
			if(numberlist[i].isEmpty()) {
				continue ;
			}
			System.out.print("numberlist[" + i + "]--->");
			numberlist[i].show();
			System.out.println();
		}
		
		for (int i = 0 ; i<11 ; i++) {
			if(numberlist[i].isEmpty()) {
				continue ;
			}
			Utility.writeFileWithOutOverWriting(writepath, numberlist[i]);
		}
	}

}
