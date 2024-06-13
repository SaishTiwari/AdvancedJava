package com.tiwarisaish.advancedjava;

public class Qn4 {
    public static void main(String[] args) {
        
        int num =5;
        int i = 1;
        while(i<=10){
            System.out.println(num +"*"+ i + "="+ num*i);
            i++;

        }

        do{
            System.out.println(num +"*"+ i + "="+ num*i);
            i++;
        }
        while (i<=10);
    }


}
