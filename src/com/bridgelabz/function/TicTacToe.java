package com.bridgelabz.function;
import java.util.Random;
import com.bridgelabz.utility.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		String status = ticTacToe();
		System.out.println("Status of Game is "+status);
	}
	
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
	
	private static boolean isValidTurn(int[][] arr, int row, int cols) {
		if (arr[row][cols] == -1) {
			return true;
		}
		return false;
	}
	
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
	private static void computerTurn(int[][] gameArray) {

		Random random = new Random();
		int row = random.nextInt(3);
		int cols = random.nextInt(3);
		if (isValidTurn(gameArray, row, cols)) {
			gameArray[row][cols] = 1;
		} else {
			computerTurn(gameArray);
		}
	}
	private static boolean checkWin(int[][] gameArray, int i) {
		for (int j = 0; j < 3; j++) {
			if (gameArray[j][0] == i && gameArray[j][1] == i && gameArray[j][2] == i) {
				return true;
			}
			if (gameArray[0][j] == i && gameArray[1][j] == i && gameArray[2][j] == i) {
				return true;
			}
		}
		if (gameArray[0][0] == i && gameArray[1][1] == i && gameArray[2][2] == i) {
			return true;
		}
		if (gameArray[0][2] == i && gameArray[1][1] == i && gameArray[2][0] == i) {
			return true;
		}
		return false;
	}
}
