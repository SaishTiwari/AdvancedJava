package com.tiwarisaish.advancedjava;

public class Pattern {

    public static void main(String[] args) {


        Qn2();
        Qn3();
        Qn1();
    }

    public static void Qn1() {


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= 2 && j >= 2 && i <= 4 && j<= 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

    public static void Qn2() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void Qn3() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

}