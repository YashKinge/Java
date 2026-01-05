package com.java.loops;

import java.util.Scanner;

public class PrintNumbers {

    // Method to print numbers from 1 to N
    public void printNum(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        // Print numbers from 1 to N
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (N): ");
        int num = sc.nextInt();

        PrintNumbers p = new PrintNumbers();
        p.printNum(num);

        sc.close();
    }
}
