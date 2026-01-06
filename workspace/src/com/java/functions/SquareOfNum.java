package com.java.functions;

import java.util.Scanner;

public class SquareOfNum {
	
	public int square(int num) {
		return (num*num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		SquareOfNum s = new SquareOfNum();
		
		System.out.println("Square Of the number is: " + s.square(num));
		
		sc.close();
		
		
		
	}

}
