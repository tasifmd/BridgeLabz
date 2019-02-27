package com.bridgelabz.datastructure;

import com.bridgelabz.utility.*;

/**
 * Purpose : Take an Arithmetic Expression such as where parentheses are used to order the performance of operations. Ensure parentheses must appear in a balanced fashion.
 * @author Tasif Mohammed
 * @version 1.0
 * @since   27-02-2019
 */
public class BalancedParanthesis {
	
		public static void main(String[] args) {
			System.out.println("Enter the expression ");
			String expression = Utility.inputSingleString();
			
			boolean status = DSUtil.check(expression);
			if(status) {
				System.out.println("The expression is balanced");
			}
			else {
				System.out.println("The expression is not balanced");
			}
			Utility.closeScanner();
		}

}
