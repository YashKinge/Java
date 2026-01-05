package com.java.inandout;

import java.util.Scanner; 

public class InputAndOutput {

	public static void main(String[] args) {
		
		//1. Take name and age, print a greeting message
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = sc.nextLine();

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		System.out.println("Hello Family! My name is " + name + " and I am " + age + " years old.");

		sc.close();

		
		
	}

}
