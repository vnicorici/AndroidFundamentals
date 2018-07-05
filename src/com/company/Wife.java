package com.company;

public class Wife {
    private int age;
    public String name;
    public String gender = "Female";
    public boolean married;

    public Wife(String name, int age,  boolean married) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.married = married;
    }
}
