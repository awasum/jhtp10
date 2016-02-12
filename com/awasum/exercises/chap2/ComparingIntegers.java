package com.awasum.exercises.chap2;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 Integers separated by a space: ");
		int x = input.nextInt();
		int y = input.nextInt();

		if (x != y)
			System.out.printf("%d is larger than %d\n", Math.max(x, y), Math.min(x, y));
		else
			System.out.printf("%d and %d are equal\n", x, y);
	}
}
