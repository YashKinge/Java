package com.java.loops;
import java.util.Scanner;
public class PrintEven {
	
	public void evennum(int num) {
		
		for(int i = 1; i <= num; i++) {
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		// Print even numbers till N
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number(N): ");
		int num = sc.nextInt();
		
		PrintEven pe = new PrintEven();
		pe.evennum(num);
		sc.close();

	}

}
