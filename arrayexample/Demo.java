
package com.junu.arrayexample;

public class Demo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 6, 12, 16, 18};

        int[] arr2 = new int[6];
        int arrIndex = 0;

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
                arr2[arrIndex] = arr1[i];
                arrIndex++;
            }
        }

        int sum = 0;
        for (int j = 0; j < arr2.length; j++) {
            sum = sum + arr2[j];
        }
        System.out.println(sum);


    }
}
