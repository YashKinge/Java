package com.java.functions;

import java.util.Scanner;

public class Method {
	
	//A method is a block of reusable code that performs a task but is always defined within a class.
	
	//add two number using method
	
	public int add(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		
		Method m = new Method();
		System.out.println("Result: " + m.add(a, b));
		sc.close();
		
	}
	
}
