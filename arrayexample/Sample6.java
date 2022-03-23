package com.junu.arrayexample;

import java.util.Arrays;
import java.util.Scanner;

//sum and product of array
public class Sample6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner scanner = new Scanner(System.in);
        int arr = scanner.nextInt();
        int[] a = new int[arr];
        int sum = 0;
        int product = 1;
        System.out.println("Enter the elements:");

        for (int i = 0; i < arr; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
            product = product * a[i];
        }
        System.out.println("Elements of array are:" + Arrays.toString(a));
        System.out.println("The sum of array is:" + sum);
        System.out.println("The product of array is:" + product);


    }


}
