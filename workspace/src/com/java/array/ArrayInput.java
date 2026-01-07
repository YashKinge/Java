package com.java.array;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        // Step 1: Take size of array
		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();

		        // Step 2: Create array
		        int[] arr = new int[n];

		        // Step 3: Take array elements
		        System.out.println("Enter " + n + " elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Step 4: Print array
		        System.out.println("Array elements are:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        sc.close();
		    }
		}

