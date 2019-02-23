package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
/**
 *  Purpose: Main class that access monthlyPayment function of Util Class
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   23-02-2019
 *
 **/
public class MonthlyPaymentMain {

	public static void main(String[] args) {
		
		System.out.println("Enter the principal , year and rate of interest ");
		double p = Utility.inputDouble();
		int y = Utility.inputInteger();
		double r = Utility.inputDouble();
		double payment = Util.monthlyPayment(p, y, r);
		System.out.println("Payment is " + payment);
		Utility.closeScanner();
	}

}
