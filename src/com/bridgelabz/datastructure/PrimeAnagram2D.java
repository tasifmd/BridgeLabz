package com.bridgelabz.datastructure;
import java.util.*;
/**
 * Purpose : Extend the Prime Number Program and store only the numbers in that range that are Anagrams. For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 * @author Tasif Mohammed
 * @version 1.0
 * @since 1-03-2019
 */
public class PrimeAnagram2D {

	public static void main(String[] args) {
		List<List<Integer>> totalprime = new ArrayList<List<Integer>>();
        List<Integer> primenumbers= new ArrayList<Integer>();
        Set<Integer> PrimeAnagram=new HashSet<Integer>();
        List<Integer> list= new ArrayList<Integer>();
        System.out.print("Prime numbers between 0 to 1000 are");
        primenumbers= DSUtil.primeNumbers(0,1000);
     	System.out.println(primenumbers);
        PrimeAnagram=DSUtil.primeAnagram(primenumbers);
        System.out.print("The size of Prime number which are Anagram  is "+PrimeAnagram.size()+ " And the numbers are" );
        System.out.println(PrimeAnagram);
        list.addAll(PrimeAnagram);
        for(int j=0;j<list.size();j++) 
        {
           if (primenumbers.contains(list.get(j))) {
        	   primenumbers.remove(list.get(j));}
        }
        System.out.print("Total prime number which are not anagram is "+primenumbers.size() +" and the numbers are");
        System.out.print(primenumbers);
        totalprime.add(primenumbers);

	}

}
