package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Kakshya {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Input 5 numbers");

        for (int i = 0; i < 5; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("The numbers you provided are ");
        for(int i=0; i<5; i++){

            System.out.println(arr[i]);
        }


        int sum = 0;


        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}

