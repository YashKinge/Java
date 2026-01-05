package com.java.loops;

import java.util.Scanner;

public class PrintSum {

	//Find sum of first N natural number
	
	public void sum(int num) {
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum = sum + i;	
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(N): ");
		int num = sc.nextInt();
		
		PrintSum ps = new PrintSum();
		ps.sum(num);
		sc.close();
		
		

	}

}
