package com.java.array;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 4: Find max
        int max = arr[0];   // assume first element is max

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 5: Print result
        System.out.println("Maximum element is: " + max);
        
        sc.close();
    }
}

