package com.tiwarisaish.advancedjava;
import java.util.Scanner;

public class PorN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negativre");

        }
        else {
            System.out.println("Zero");
        }


    }


}


