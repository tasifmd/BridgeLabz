package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.algorithm.Anagram;
import com.bridgelabz.algorithm.Util;

/**
 * Purpose : Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order
 * @author Tasif Mohammed
 * @version 1.0
 * @since 02-03-2019
 */
public class PrimeAnagramStack {

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<>(); 
		List <Integer> anagram = new ArrayList<>(); 
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
		
		CustomStack<Integer> anagramStack = new CustomStack<Integer>();
		int a,b;
		System.out.println("Elements pushed to stack are ");
		for(int i=0;i<anagram.size();i++)
		{
			anagramnum = anagram.get(i);
			a=(char) anagramnum;
			anagramStack.push(a);
			System.out.print(anagramnum+"  ");
			
		}
		System.out.println("\nElements pushed to stack are ");
		
		while(!anagramStack.isEmpty())
		{
			a = anagramStack.pop();
			b = (int)a;
			System.out.print(b+"  ");
		}

	}

}
