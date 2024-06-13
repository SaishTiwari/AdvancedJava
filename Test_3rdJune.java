package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Test_3rdJune {

    public static void main(String[] args) {
        Person_Manager personManager = new Person_Manager();

      // Person person1 =  personManager.readPerson();

       Person person[] = new Person[67];
        System.out.println("Enter how many ? ");
        Scanner sc = new Scanner(System.in);

        int Max = sc.nextInt();

        if(Max<=67){
            for(int i = 0; i<Max; i++){
                person[i]= personManager.readPerson();
            }



        }

        else {
            System.out.println("Out of range");
        }

    }
}



