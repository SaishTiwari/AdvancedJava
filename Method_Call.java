package com.tiwarisaish.advancedjava;

import java.net.DatagramSocket;
import java.util.Scanner;

public class Method_Call {
    public static void main(String[] args) {
       // Q1();
        //Q2();
        //Q3();
       // Q4();
        //Q5();
       // Q8();
        // Q6();
        //Q9();
        //Q10();


    }

    public static void Q1(){
        int num =10;
        for (int i=1; i<=num; i++){
             System.out.println(i);
         }
    }


    public static void Q2(){
        int num=10;
        int sum =0;

        for (int i=1; i<=num; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }




    public static void Q3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want table of ");
        int num = sc.nextInt();

        for(int i =1 ; i<=10; i++){
            System.out.println(num +"*"+ i + "="+ num*i);
        }
        }

    public static void Q4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want factorial of ");
        int num = sc.nextInt();
        int fact =1;

        for(int i =1 ; i<=num; i++){
             fact = num*i;

        }
        System.out.println(fact);
    }


    public static void Q5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        System.out.println("Enter Second Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer =1;

        for(int i =1 ; i<=num2; i++){
            answer = num1 * answer;
        }
        System.out.println(answer);
    }

    public static void Q6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want reverse of ");
        int num = sc.nextInt();
        int rev =0;
        int rem=1;

        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num= num/10;


        }
        System.out.println(rev);
    }

    public static void Q8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check ");
        int num = sc.nextInt();
        boolean ans = false;


        for (int i=1; i<num; i++){
            if(num%i==0){
                 ans = true;
            }
        }
        if(ans ==true){
            System.out.println("Composite");
        }
        else {
            System.out.println("Prime");
        }

    }

    public static void Q9(){
        Scanner sc = new Scanner(System.in);
        int cont =0;

        do {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            System.out.println("The sum is " + num1 + num2);

            System.out.println("Do you want to continue; If you wish to terminate enter 0");
            cont = sc.nextInt();
        }
        while(cont != 0);

    }

    public static void Q10(){
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input == 1) {

            System.out.println("Enter your number : ");

                    int number = sc.nextInt();

                    if(number > 0) {

                        positive++;

                    } else if(number < 0) {

                        negative++;

                    } else {

                        zeros++;

                    }

                    char abc;

                    System.out.println("Press 1 to continue & 0 to stop");

                    input = sc.nextInt();

                }


                System.out.println("Positives : "+ positive);

                System.out.println("Negatives : "+ negative);

                System.out.println("Zeros : "+ zeros);

            }


    }





















