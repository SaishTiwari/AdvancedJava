package com.tiwarisaish.advancedjava;

import java.util.Scanner;

public class Grades {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int a = sc.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 80 && a <= 90) {
            System.out.println("B");
        } else if (a >= 70 && a <= 80) {
            System.out.println("C");
        } else if (a >= 50 && a <= 60) {
            System.out.println("D");
        } else if (a >= 40 && a <= 50) {
            System.out.println("E");
        } else if (a < 40) {
            System.out.println("F");
        } else {
            System.out.println("Out of range");
        }


    }

    public static class Temprature {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Temprature");
            int a = sc.nextInt();

            if (a >= 30) {
                System.out.println("Hot");
            } else if (a >= 21 && a <= 30) {
                System.out.println("Warm");
            } else if (a >= 11 && a <= 20) {
                System.out.println("Mild");
            } else if (a >= 1 && a <= 10) {
                System.out.println("Cool");
            } else {
                System.out.println("Freezing");
            }


        }
    }

    public static class GreatestNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter third number");
            int c = sc.nextInt();

            if (a > b) {
                if (a > c) {
                    System.out.println(a + " a is greatest");
                }
            } else if (b > a) {
                if (b > c) {
                    System.out.println(b + " is greatest");
                }

            } else {
                System.out.println(c + " C is greatest");
            }


        }
    }

    public static class Weekday {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Number for weekday");
            int a = sc.nextInt();

            switch (a) {
                case 1: {

                    System.out.println("Sunday");
                    break;
                }
                case 2: {
                    System.out.println("Monday");
                    break;
                }
                case 3: {
                    System.out.println("Tuesday");
                    break;
                }

                case 4: {
                    System.out.println("Wednesday");
                    break;
                }

                case 5: {
                    System.out.println("Thursday");
                    break;
                }

                case 6: {
                    System.out.println("Fridday");
                    break;
                }

                case 7: {
                    System.out.println("Saturday");
                    break;
                }

                default: {
                    System.out.println("Out of range");
                }


            }
        }
    }
}


