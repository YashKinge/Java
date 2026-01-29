package com.java.math;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
        int temp = num;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }

        if(sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");

	}

}
