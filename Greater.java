package com.tiwarisaish.advancedjava;

public class Greater {
    public static void main(String[] args) {
      int   num1 = 10;
      int  num2 = 7;
      int num3 = 4;

      if(num1>num2){
          if(num1>num3){
              System.out.println("Num 1 is greatest");
          }
      }

        if(num2>num1){
            if(num2>num3){
                System.out.println("Num 2 is greatest");
            }
        }

        if(num3>num2){
            if(num3>num1){
                System.out.println("Num 3 is greatest");
            }
        }


    }
}
