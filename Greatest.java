package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Great(5,6,2);

    }

    public static void Great(int num1, int num2, int num3){
        if(num1>num2){
            if(num1>num3){
                System.out.println("Num1 is greatest");
            }
        }

        else if(num2>num1){
            if(num2>num3){
                System.out.println("Num1 is greatest");
            }
        }
        else {
            System.out.println("Num 3 is greatest");
        }

    }
}
