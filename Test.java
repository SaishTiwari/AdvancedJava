package com.tiwarisaish.advancedjava;

public class Test {
    public static void main(String[] args) {
        try {
            for(;;){
                System.out.println("Hello");
                Thread.sleep(1000);
            }

        }

        catch (Exception ex ){
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
