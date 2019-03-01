package com.bridgelabz.functional;

public class FUtil {
	public static int checkPrime(int num)
	{
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
				break;
			}	
		}
			return cnt;	
	}	
}
