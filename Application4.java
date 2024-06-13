package com.tiwarisaish.advancedjava;

import java.util.Scanner;

class Employeee{
    int eid;
    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.println("Enter your ID: ");
        eid = sc.nextInt();
        System.out.println("Your id is "+eid);
    }

}

public class Application4 {


    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        e1.getDetails();

    }

}
