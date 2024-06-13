package com.tiwarisaish.advancedjava;

import java.util.Scanner;

class Student1{
    Scanner sc = new Scanner(System.in);
    int id;
    String Name;
    String Sports;
    String Course;
    int x;

    public void getDetails(){
        System.out.println("Enter your ID");
        id = sc.nextInt();
        System.out.println("Enter your name");
        Name = sc.next();
        System.out.println("Your id is "+id + " Your name is "+ Name);
    }

    public void getAdmission(){
        System.out.println("Enter the course you choose");
        Course = sc.next();
        System.out.println("Your choosen course is "+ Course);
    }

    public void getSports(){
        System.out.println("Enter the sports you like to represent college for");
        Sports = sc.next();
        System.out.println("You choose "+ Sports);
    }



    }


public class Classwork21MAY {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.getDetails();
        student1.getAdmission();
        student1.getSports();

            int x[]= new int[5];
            x[0]= 5;
            x[4]= 6;
            x[2]=12;
            x[1]=3;
            x[3]=7;
            System.out.println(x[0]+ x[3]);

            int i = 0;

            while (i<5){
                System.out.println(x[i]);
                i++;
            }

        }

    }




