package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Prime2DArray {

	public static void main(String[] args) {
		int[][] arr=getPrime2D(1000);
		Utility.print2DArray(arr);
	}
	
	public static int[][] getPrime2D(int range)
    {
    	int  prime2D[][]= new int[range/100][range/40];
    	
    	int prime[]= getPrime(range);
    	int count=0, limit=100;
    	
    	for(int i=0; i<range/100; i++)
    	{
    		for(int j=0;j<range/10;j++)
    		{
    			if(prime[count]>limit || prime[count]==0) 
    			{
    				break;
    			}
    			prime2D[i][j]=prime[count];
    			count++;
    		}
    		limit= limit+100;
    	}
    	
    	return prime2D;
    }
	
	public static int[] getPrime(int range)
    {
    	int  prime[]= new int[range/2], i=1;
    	int count=0;
    	boolean isprime =false;
    	while(i < range)
    	{
    		
    		for(int j=2; j<i; j++)
    		{
    			if( i%j==0)
    			{
    				isprime=false;
    				break;
    			}
    			else
    			{
    				isprime=true;
    			}
    		}
    		if(isprime==true)
    		{
    			prime[count++]= i;
    		}
    		i++;
    	}
    	return prime;
    }

}
