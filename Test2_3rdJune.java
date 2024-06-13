package com.tiwarisaish.advancedjava;



import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;



public class Test2_3rdJune {



    public static void main(String[]args)

    {

        //style-2

        //Person persons[] =new Person[67];

        List persons =new ArrayList<Person>();//Dynamic ARRAY

        System.out.println("Enter how many ? ");

        int MAX=Integer.parseInt(new Scanner(System.in).nextLine());

        for (int i=0;i<MAX;i++)

        {

            Person tmpPerson=new Person_Manager().readPerson();

            persons.add(tmpPerson);



        }

        for (int i=0;i<persons.size();i++)

        {

            System.out.println(persons.get(i));

        }

    }

}