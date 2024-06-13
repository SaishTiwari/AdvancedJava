package com.tiwarisaish.advancedjava;
import java.util.Scanner;
public class VOTE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Vote");
        }
        else{
            System.out.println("Not Ellgible");
        }
    }
}
