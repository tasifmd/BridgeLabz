package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Utility;
/**
 *  Purpose: Main class that access temperaturConversion function of Util Class
 *
 *  @author  Tasif Mohammed
 *  @version 1.0
 *  @since   23-02-2019
 *
 **/
public class TemperatureConversionMain {

	public static void main(String[] args) {
		System.out.println("Enter the temperature and units ");
		double t = Utility.inputDouble();
		String u = Utility.inputSingleString();
		double tc = Util.temperaturConversion(t, u);
		System.out.println(tc);
	}

}
