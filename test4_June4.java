package com.tiwarisaish.advancedjava;

import java.util.Random;
import java.util.Scanner;

public class test4_June4 {

    public static void main(String[] args) {

        Random r = new Random();

        int[] a = new int[1000];
        for(int i = 0; i < 1000; i++){
            a[i] = r.nextInt(18, 25);
            System.out.print(a[i]+" ");
        }

        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a number you want to check:");
        int b = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < 1000; i++){
            if(a[i] == b){
                System.out.println("Found");

                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }


    }
}
