package com.tiwarisaish.advancedjava;

public class StringTest {

    public static void main(String[] args) {
        String str1 = "My name is Saish Tiwari";

        char ch = str1.charAt(6);
        System.out.println("charAt(6): " + ch);

        int compareToResult = str1.compareTo("My name is Saish");
        System.out.println("compareTo: " + compareToResult);

        int compareToIgnoreCaseResult = str1.compareToIgnoreCase("my name is saish");
        System.out.println("compareToIgnoreCase: " + compareToIgnoreCaseResult);

        String concatenatedString = str1.concat(" and I am learning Java.");
        System.out.println("concat: " + concatenatedString);

        boolean containsResult = str1.contains("Saish");
        System.out.println("contains: " + containsResult);

        boolean equalsResult = str1.equals("My name is Saish");
        System.out.println("equals: " + equalsResult);

        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase("my name is saish");
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCaseResult);

        byte[] bytes = str1.getBytes();
        System.out.print("getBytes: ");
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        int indexOfChar = str1.indexOf('n');
        System.out.println("indexOf('n'): " + indexOfChar);

        int lastIndexOfString = str1.lastIndexOf("is");
        System.out.println("lastIndexOf('is'): " + lastIndexOfString);

        String str2 = "   ";
        boolean isBlankResult = str2.isBlank();
        System.out.println("isBlank: " + isBlankResult);

        String str3 = "";
        boolean isEmptyResult = true;
        System.out.println("isEmpty: " + isEmptyResult);

        int lengthOfString = str1.length();
        System.out.println("length: " + lengthOfString);

        String replacedString = str1.replace('a', 'o');
        System.out.println("replace('a', 'o'): " + replacedString);

        String lowerCaseString = str1.toLowerCase();
        System.out.println("toLowerCase: " + lowerCaseString);

        String upperCaseString = str1.toUpperCase();
        System.out.println("toUpperCase: " + upperCaseString);

        String str4 = "   My name is Saish   ";
        String trimmedString = str4.trim();
        System.out.println("trim: " + trimmedString);

        int number = 123;
        String valueOfString = String.valueOf(number);
        System.out.println("valueOf: " + valueOfString);
    }
}


