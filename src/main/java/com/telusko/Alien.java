package com.telusko;


public class Alien {


    private int age;

    private Computer com;

    public Alien(){
        System.out.println("Alien constructor");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com =  com;
    }

    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Computer getCom() {
        return com;
    }

    public int getAge() {
        return age;
    }

    public void code(){
        System.out.println("alien method");
        com.compile();
    }
}
