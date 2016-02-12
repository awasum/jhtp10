package com.awasum.exercises.chap2;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integers separated by a space: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		input.close();

		printSolution("Sum", x + y);

		printSolution("Product", x * y);

		printSolution("Difference", Math.abs(x - y));

		if (x != 0 && y != 0)
			printSolution("Quotient", y % x);
		else
			printSolution("Quotient error: Cannot divide by zero", 0);
	}

	private static void printSolution(String message, int value) {
		System.out.printf("%s = %d\n", message, value);
	}
}
