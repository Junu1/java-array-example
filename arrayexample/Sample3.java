package com.junu.arrayexample;

import java.util.Scanner;

//Take 20 integer inputs from user and print the following:
//        number of positive numbers
//        number of negative numbers
//        number of odd numbers
//        number of even numbers
//        number of 0s
public class Sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number:");
            a[i] = scanner.nextInt();

            if (a[i] > 0) {
                System.out.println("Positive number");
            } else if (a[i] < 0){
                System.out.println("Negative number");
            }
            else{
                System.out.println("Zeros");
            }
            if (a[i] % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        }
    }
}
