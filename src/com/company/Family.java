package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Family {
    public Wife wife;
    public Husband husband;
    public String name;
    public ArrayList<Child> childrens  = new ArrayList<>();

    public Family(Wife wife, Husband husband) {

        this.husband = husband;
        this.husband.married = true;

        this.wife = wife;
        this.wife.married=true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChild(String name) {
        this.childrens.add(new Child(name));
    }
}
