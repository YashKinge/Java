package com.java.inandout;

import java.util.Scanner;

public class Averages {

    // Take 3 numbers and print their average
	
    public double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        Averages obj = new Averages();
        double result = obj.avg(a, b, c);

        System.out.println("Average is: " + result);

        sc.close();
    }
}
