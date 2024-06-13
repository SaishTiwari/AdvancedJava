package com.tiwarisaish.advancedjava;
import java.util.Scanner;

public class ODDEVEN{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for odd even");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
