package com.java.conditionalstatements;

import java.util.Scanner;

public class CheckIf {

	public static void main(String[] args) {
		// Check if a number is positive, negative or zero
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Number is Positive!");
		}else if(num < 0){
			System.out.println("Number is Negative!");
		}else {
			System.out.println("Number is zero");
		}
		
		sc.close();

	}

}
