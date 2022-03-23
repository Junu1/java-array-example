package com.junu.arrayexample;

import java.util.Scanner;

//Take the integer value from the user and store them in an array & print them on screen.
public class Sample1 {
    public static void main(String[] args) {
        int arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        arr = scanner.nextInt();
        int[] a = new int[arr];
        for (int i = 0; i < arr; i++) {
            System.out.println("Enter the number" + (i + 1));
            a[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("The numbers are:");
        for (int i = 0; i < arr; i++) {
            System.out.println(a[i]);

        }
    }
}

