package com.java.conditionalstatements;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		// Check if a number is even or odd
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The Number is Even");
		}else{
			System.out.println("The Number is Odd");
		}
		sc.close();
		

	}

}
