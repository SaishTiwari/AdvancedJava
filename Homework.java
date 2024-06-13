package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Homework {

    public static int doGet(int x) {
        return x * x;
    }

    public static int getDetails(int y, int z) {

        return y * z;
    }

    public static int getDemo(int m, int n, int z) {

        return m * n * z;
    }

    public static void main(String[] args) {
        int x,y,z,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(x):");
        x=sc.nextInt();
        int result = doGet(x);
        System.out.println(result);


        System.out.print("Enter a number (y): ");
        y = sc.nextInt();
        System.out.print("Enter a number (z): ");
        z =sc.nextInt();
        int result1 = getDetails(y, z);
        System.out.println(result1);

        System.out.print("Enter a number (m): ");
        m = sc.nextInt();
        System.out.print("Enter a number (n): ");
        n = sc.nextInt();
        System.out.print("Enter a number (z): ");
        z =sc.nextInt();

        int result2 = getDemo(m,n,z);
        System.out.println(result2);
    }
}