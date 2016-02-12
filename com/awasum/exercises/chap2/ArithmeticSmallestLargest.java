package com.awasum.exercises.chap2;

import java.util.Scanner;

public class ArithmeticSmallestLargest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 integers separated by spaces: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
       
        outputResult("Sum", x + y + z);

        outputResult("Average", (x + y + z) / 3);

        outputResult("Product", x * y * z);

        outputResult("Largest", Math.max(x, Math.max(y, z)));

        outputResult("Smallest", Math.min(x, Math.min(y, z)));
        
        input.close();
    }

    private static void outputResult(String message, int x){
        System.out.printf("%s = %d\n", message, x);
    }
}
