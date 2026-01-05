package com.java.conditionalstatements;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        // Find the largest of 3 numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number(A): ");
        int a = sc.nextInt();

        System.out.print("Enter second number(B): ");
        int b = sc.nextInt();

        System.out.print("Enter third number(C): ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is the largest number.");
        } else if (b > a && b > c) {
            System.out.println("B is the largest number.");
        } else {
            System.out.println("C is the largest number.");
        }

        sc.close();
    }
}
