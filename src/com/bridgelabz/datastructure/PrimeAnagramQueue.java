package com.bridgelabz.datastructure;
import com.bridgelabz.algorithm.*;
import java.util.*;

/**
 * Purpose : Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List and Print the Anagrams from the Queue
 * @author Tasif Mohammed
 * @version 1.0
 * @since 02-03-2019
 */
public class PrimeAnagramQueue {

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<>(); 
		List <Integer> anagram = new ArrayList<>(); 
		CustomQueue queue = new CustomQueue(200);
		int num1,anagramnum;
		int num2,cnt=0;
		boolean anagramResult=false;	
		
		for(num1=1;num1<=1000;num1++){			
			cnt = Util.prime(num1);	
			if(cnt==0){
				prime.add(num1);
			}
		}
		
		System.out.println("List of Prime Numbers:");
		System.out.println(prime);
		
		for(int i=1;i<prime.size();i++){
			num1 = prime.get(i);
			for(int j=i+1;j<prime.size();j++){
				num2 = prime.get(j);
				String str1 = Integer.toString(num1);
				String str2 = Integer.toString(num2);
				anagramResult = Anagram.isAnagram(str1,str2);
				if(anagramResult){	
					anagram.add(num1);
					break;
				}		
			}
		}
		
		
		System.out.println("Anagram numbers are ");
		for(int i=0;i<anagram.size();i++){
			anagramnum = anagram.get(i);
			int a=anagramnum;
			queue.insert(a);;
			System.out.print(anagramnum+" ");
		}
		
		
	}

}
