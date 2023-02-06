package com.di.xpninja.classes;

public class Homme {

    private String name;
    private int age;

    public Homme(String name, int age) {
        super();
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void displayInfo() {
        System.out.printf("Hey , Salut <%s> !!! votre âge est <%s ans>\n", this.name, this.age);
    }

}