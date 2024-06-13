package com.tiwarisaish.advancedjava;

public class NewClass {
    public static int area(int length, int breadth, int height) {

        return height * (length + breadth) * 2;
    }

    public static void main(String[] args) {

        int result = area(2, 5, 6);
        System.out.println(result);
    }

}


