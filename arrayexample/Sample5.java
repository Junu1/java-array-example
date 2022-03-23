package com.junu.arrayexample;
//Reverse of an array
public class Sample5 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
            System.out.println("Reverse array:");
            for( int i=a.length-1;i>=0;i--){
                System.out.println(a[i]);

            }

        }
    }

