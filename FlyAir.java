package com.tiwarisaish.advancedjava;

interface Flyer{
    public void takeOff();
    public void land();
    public void fly();
}
class Airplane implements Flyer{
    public void takeOff() {
        System.out.println("In an airplane, it needs focous for the pilot to takeoff");
    }
    public void land() {
        System.out.println("Airplane lands in the land. Lol");
    }
    public void fly() {
        System.out.println("Pilen can falyyyeee");
    }
}
class Bird implements Flyer{
    public void takeOff() {
        System.out.println("Chari udyo badal chuna lai take off garera");
    }
    public void land() {
        System.out.println("Birds can stay in land as well as can fly");
    }
    public void fly() {
        System.out.println("Birds has wings to fly");
    }
}
class Superman implements Flyer{
    public void takeOff() {
        System.out.println("Shaktiman takesoff in an extraordinary way");
    }
    public void land() {
        System.out.println("Shaktiman lives in land");
    }
    public void fly() {
        System.out.println("Shaktiman has power to fly");
    }
}
public class FlyAir {

    public static void main(String[] args) {
        Airplane ff = new Airplane();
        ff.takeOff();
        ff.land();
        ff.fly();

        Bird bb = new Bird();
        bb.takeOff();
        bb.land();
        bb.fly();

        Superman suppperrrrrrrr = new Superman();
        suppperrrrrrrr.takeOff();
        suppperrrrrrrr.land();
        suppperrrrrrrr.fly();
    }

}