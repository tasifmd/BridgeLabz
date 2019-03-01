package com.bridgelabz.datastructure;
import java.util.ArrayList;

import com.bridgelabz.functional.FUtil;
import com.bridgelabz.utility.Utility;

public class Prime2DArray {

	public static void main(String[] args) {
		ArrayList primeList[]= new ArrayList[10];
		int cnt=0,i=0,temp=100;
		
		/*Creating multiple objects of prime number list list and storing into a n array of list*/
		for(int j=0;j<10;j++)
		{
			primeList[j] = new ArrayList();
		}
		/*Checking Prime Numbers and storing into a list*/
		while(i<10)
		{
			for(int num=2;num<=1000;num++)
			{
				cnt = FUtil.checkPrime(num);
				if(cnt==0)
					primeList[i].add(num);
				if(num==temp)
				{
					i++;
					temp=temp+100;
				}
					
			}	
		
		}
		for(ArrayList listItem : primeList)
			System.out.println(listItem);
		
	}
}
