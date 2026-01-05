package com.java.loops;
import java.util.Scanner;
public class PrintTable {
	// Print multiplication table of a number
	public void table(int num) {
		int mul = 1;
		for(int i = 1; i<= 10; i++) {
			mul = num * i;
			System.out.println(mul);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number(N): ");
		int num = sc.nextInt();
		
		PrintTable pt = new PrintTable();
		pt.table(num);
		sc.close();

	}

}
