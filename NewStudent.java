package com.tiwarisaish.advancedjava;



public class NewStudent extends Person {



	/*int sid;

	String name;

	String address;

	String email;

	String phone;*/

    String course;

    String level;

    String section;

    int sub1;

    int sub2;

    int total;

    double avg;

    String result;



    public NewStudent() {

        super();

        this.course ="";

        this.level = "";

        this.section = "";

        this.sub1 = 0;

        this.sub2 = 0;

        this.total = 0;

        this.avg =0.0;

        this.result = "";

    }



    //int pid, String name, String address, String phone, String email

    public NewStudent(int pid, String name, String address, String phone, String email,String course, String level, String section, int sub1, int sub2) {

        super(pid,name,address,email,phone);

        this.course = course;

        this.level = level;

        this.section = section;

        this.sub1 = sub1;

        this.sub2 = sub2;

        this.total = 0;

        this.avg = 0.0;

        this.result = "";

    }

    public int getSid()

    {

        return super.getPid();

    }

    public void setSid(int sid)

    {

        super.setPid(sid);

    }



    public String getCourse() {

        return course;

    }





    public void setCourse(String course) {

        this.course = course;

    }





    public String getLevel() {

        return level;

    }





    public void setLevel(String level) {

        this.level = level;

    }





    public String getSection() {

        return section;

    }





    public void setSection(String section) {

        this.section = section;

    }





    public int getSub1() {

        return sub1;

    }





    public void setSub1(int sub1) {

        this.sub1 = sub1;

    }





    public int getSub2() {

        return sub2;

    }





    public void setSub2(int sub2) {

        this.sub2 = sub2;

    }





    public int getTotal() {

        return total;

    }





    public void setTotal(int total) {

        this.total = total;

    }





    public double getAvg() {

        return avg;

    }





    public void setAvg(double avg) {

        this.avg = avg;

    }





    public String getResult() {

        return result;

    }





    public void setResult(String result) {

        this.result = result;

    }





    @Override

    public String toString() {

        return super.toString()+", course=" + course + ", level=" + level + ", section=" + section + ", sub1=" + sub1 + ", sub2="

                + sub2 + ", total=" + total + ", avg=" + avg + ", result=" + result + "]";

    }





}