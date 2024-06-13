package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Classwork_3rdJune {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int totalSum = inputNumbers(a);
        System.out.println("The sum is " + totalSum);
    }

    static int inputNumbers(int n) {
        if (n > 0) {
            System.out.println("Enter the numbers");
            Integer b = sc.nextInt();
            return b + inputNumbers(n - 1);
        }
        return 0;
    }
}
