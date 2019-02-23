package com.bridgelabz.function;
import java.util.Random;
import com.bridgelabz.utility.Utility;

/**
 * Purpose : Program to play a Cross Game or Tic-Tac-Toe Game
 * @author tasif Mohammed
 * @version 1.0
 * @since 20-02-2019
 **/
public class TicTacToe {

	public static void main(String[] args) {
		String status = ticTacToe();
		System.out.println("Status of Game is "+status);
	}
	
	/**
	 * Purpose : function to initialize board
	 * @return You Won if user owns
	 * @return Computer Won if you loose
	 * @return Game Draw  if the game draws
	 **/
	public static String ticTacToe() {
		boolean user = false;
		int arr[][] = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = -1;
			}
		}
		for(int k = 0;k<9;k++) {
			if(user) {
				userTurn(arr);
				user = false;
				printGameArray(arr);
				if (checkWin(arr, 0)) {
					return "You Won";
				}
			}
			else {
				System.out.println("Computer's Turn");
				computerTurn(arr);
				user = true;
				printGameArray(arr);
				if (checkWin(arr, 1)) {
					return "Computer Won";
				}
			}
		}
		return "Game Draw ";
	}
	
	/**
	 * Purpose : function to take users turn
	 * @param arr as argument to allocate one box board 
	 **/
	public static void userTurn(int[][] arr) {
		System.out.println("Your Turn....");
		System.out.println("Enter Position");
		System.out.print("Row=");
		int row = Utility.inputInteger() - 1;
		System.out.print("Column=");
		int cols = Utility.inputInteger() - 1;
		if (isValidTurn(arr, row, cols)) {
			arr[row][cols] = 0;
		} else {
			userTurn(arr);
		}
	}
	
	/**
	 * Purpose : Validating whether the arr[row][col] is already allocated or not 
	 * @param arr : Passing array as argument
	 * @param row : Passing row as argument
	 * @param cols : Passing col as argument
	 * @return
	 **/
	private static boolean isValidTurn(int[][] arr, int row, int cols) {
		if (arr[row][cols] == -1) {
			return true;
		}
		return false;
	}
	
	/**
	 * Purpose : function to print the board
	 * @param arr as an argument
	 */
	private static void printGameArray(int[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == 0) {
					System.out.print("| X |");
				} else if (arr[i][j] == 1) {
					System.out.print("| O |");
				} else {
					System.out.print("|   |");
				}
			}
			System.out.println();
			System.out.println("===============");
		}
	}
	/**
	 * Purpose : Randomly allocating cells of board
	 * @param arr : Passing array as a argument
	 **/
	private static void computerTurn(int[][] arr) {

		Random random = new Random();
		int row = random.nextInt(3);
		int cols = random.nextInt(3);
		if (isValidTurn(arr, row, cols)) {
			arr[row][cols] = 1;
		} else {
			computerTurn(arr);
		}
	}
	/**
	 * Purpose : function to check who owns the game
	 * @param arr : passing array as parameter 
	 * @param i : passing i 0 for user 1 for computer 
	 * @return true if user wins else false 
	 **/
	private static boolean checkWin(int[][] arr, int i) {
		for (int j = 0; j < 3; j++) {
			if (arr[j][0] == i && arr[j][1] == i && arr[j][2] == i) {
				return true;
			}
			if (arr[0][j] == i && arr[1][j] == i && arr[2][j] == i) {
				return true;
			}
		}
		if (arr[0][0] == i && arr[1][1] == i && arr[2][2] == i) {
			return true;
		}
		if (arr[0][2] == i && arr[1][1] == i && arr[2][0] == i) {
			return true;
		}
		return false;
	}
}
