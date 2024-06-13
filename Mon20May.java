package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Mon20May {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();


        System.out.println("Your name is "+ name + " and your age is "+ age);

    }
}


