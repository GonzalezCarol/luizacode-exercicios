package com.exerciciosluizacode.exercicios.exe2704.exec1;


import java.time.LocalDate;

public class Person {
    private String name;
    private String isBorn;
    private Double height;

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
}
