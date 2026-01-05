package com.java.conditionalstatements;

import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) {

        // Check voting eligibility
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
