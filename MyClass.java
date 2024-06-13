package com.tiwarisaish.advancedjava;


public class MyClass {
    public void f1() {
        System.out.println("Hello from f1");
    }
    public void f2(int x, int y) {
        System.out.println("RESULT "+(x+y));
    }
    public int f3() {
        int z = 7+8;
        return(z);
    }
    public int f4(int x, int y) {
        return(x+y);

    }

    public void f5(int x){
        x++;
        System.out.println(x);
    }

    public void f6(int nums[]){
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]+" ");
        }
        System.out.println();

    }

}