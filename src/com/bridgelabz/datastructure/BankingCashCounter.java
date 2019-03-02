package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : Create Banking Cash Counter where people come in to deposit Cash and withdraw Cash
 * @author : Tasif Mohammed
 * @version : 1.0
 * @since : 27-02-2019
 */

public class BankingCashCounter {

	public static void main(String[] args) {
		CustomQueue cq = new CustomQueue(20);
		int count=0;
		int cash_count=10000;
		do {
			System.out.println("Enter the choice");
			
			//Taking input of user choice to do specific task 
			
			System.out.println("1:Add  2:Check Cash  3:Exit");
			int choice = Utility.inputInteger();
			
			switch(choice){
				case 1:
					cq.insert(count++);
					
					System.out.println("Adding "+count+" person to the queue");
					System.out.println("Do you want to: 1-Deposit 2-Withdraw");
					int ch=Utility.inputInteger();
					switch(ch){
						case 1: 
							System.out.println("Enter the amount to deposit");
							int dep_amt=Utility.inputInteger();
							cash_count+=dep_amt;
							System.out.println(dep_amt+" is added");
							break;
						case 2:
							System.out.println("Enter the amount to withdraw");
							int withdraw=Utility.inputInteger();
							if(withdraw>cash_count){
								System.out.println("Cash of that amount is not available");
							}
							else{
								cash_count-=withdraw;
								System.out.println(withdraw+" is withdrawn");
							}
							break;
						default:
							System.out.println("Invalid choice");
							System.exit(0);
					}
					cq.remove();
					System.out.println("The person is removed");
					break;
				case 2: System.out.println("The amount of cash available is: "+cash_count);
					break;
				case 3: System.exit(0);
					
			}
		}while(cash_count!=0);
		System.out.println("Out of cash");
		Utility.closeScanner();
	}

}
