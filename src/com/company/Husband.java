package com.company;

public class Husband {
    private int age;
    public String name;
    public String gender = "Male";
    public boolean married;

    public Husband(String name, int age, boolean married) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.married = married;
    }
}
