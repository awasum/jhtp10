package com.awasum.exercises.chap2;

import java.util.Scanner;

public class ArithmeticSmallestLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three spaced separated integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        // sum
        printResult("Sum", x + y + z);

        // average
        printResult("Average", (x + y + z) / 3);

        // product
        printResult("Product", x * y * z);

        // largest
        printResult("Largest", Math.max(x, Math.max(y, z)));

        // smallest
        printResult("Smallest", Math.min(x, Math.min(y, z)));
    }

    // print result
    private static void printResult(String message, int x){
        System.out.printf("%s = %d\n", message, x);
    }
}
