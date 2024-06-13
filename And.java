package com.tiwarisaish.advancedjava;

public class And {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 13;
        int num3 = 8;

        if((num1>=num2) && (num1>=num3)){
            System.out.println("Num 1 is greatest");

        }

        if((num2>=num3) && (num2>=num1)){
            System.out.println("Num 2 is greatest");

        }

        if((num3>=num2) && (num3>=num1)){
            System.out.println("Num 1 is greatest");

        }

    }
}
