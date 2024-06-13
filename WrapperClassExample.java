package com.tiwarisaish.advancedjava;

public class WrapperClassExample {
    public static void main(String[] args) {

        int age1 = 17;
        System.out.println("Age is " + age1);
        Integer age2 = Integer.valueOf(age1);
        System.out.println("Age is " + age2);

        float height1 = 5.9f;
        System.out.println("Height is " + height1);
        Float height2 = Float.valueOf(height1);
        System.out.println("Height is " + height2);

        boolean isStudent1 = true;
        System.out.println("Is student: " + isStudent1);
        Boolean isStudent2 = Boolean.valueOf(isStudent1);
        System.out.println("Is student: " + isStudent2);

        double salary1 = 50000.75;
        System.out.println("Salary is " + salary1);
        Double salary2 = Double.valueOf(salary1);
        System.out.println("Salary is " + salary2);

        String name1 = "John";
        System.out.println("Name is " + name1);
        String name2 = name1;
        System.out.println("Name is " + name2);
    }
}
