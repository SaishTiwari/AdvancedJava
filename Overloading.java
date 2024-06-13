package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Overloading{
    public static void main(String[] args) {
        area(4);
        volume(5);
        
    }
    
    public static void area(int length){
        int area = length*length;
    }


    public static void volume(int length){
        int area = length*length*length;
    }
}


