package com.junu.arrayexample;

import java.util.Scanner;

//Take the integer inputs from user and store them in array.
// Again ask the user to  give the number. Now tell the user whether the number is present in array or not.
public class Sample2 {
    public static void main(String[] args) {
        int arr,b,count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        arr=scanner.nextInt();
        int[] a = new int[arr];
        for(int i =0;i<arr;i++){
            System.out.println("Enter the number:"+(i+1));
            a[i]= scanner.nextInt();
        }
        System.out.println(" Enter the search element:");
        b=scanner.nextInt();
        for(int i =0;i<arr;i++){
            if(a[i]==b){
                count++;
            }
        }
        if(count>0){
            System.out.println("Item found");
        }
        else{
            System.out.println("Item not found");
        }

    }
}
