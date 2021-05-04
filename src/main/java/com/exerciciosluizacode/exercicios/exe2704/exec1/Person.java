package com.exerciciosluizacode.exercicios.exe2704.exec1;


import java.util.Locale;

public class Person {
    protected String name;
    protected String isBorn;
    protected Double height;
    protected Integer age;

    public Person(String name, String isBorn, Double height) {
        this.name = name;
        this.isBorn = isBorn;
        this.height = height;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsBorn() {
        return isBorn;
    }

    public void setIsBorn(String isBorn) {
        this.isBorn = isBorn;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
}
