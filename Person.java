package com.tiwarisaish.advancedjava;

public class Person {

    int pid;
    String name;
    String address;
    String email;
    String phone;

    public Person(int pid, String name, String address, String email, String phone) {
        this.pid = pid;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Person() {
        this.pid = 0;
        this.name = "";
        this.address = "";
        this.email = "";
        this.phone = "";
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
