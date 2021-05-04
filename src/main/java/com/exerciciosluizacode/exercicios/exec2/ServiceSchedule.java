package com.exerciciosluizacode.exercicios.exec2;

import com.exerciciosluizacode.exercicios.exe2704.exec1.Person;
import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ServiceSchedule extends Person {
//    ServicePerson servicePerson = new ServicePerson();

    public ServiceSchedule(String name, String isBorn, double height) {
        super(name, isBorn, height);
    }

    public ServiceSchedule() {
    }

    public Integer serviceSchedule() throws ParseException {
        String name = getName();
        String isBorn = getIsBorn();
        double height = getHeight();

        ServicePerson servicePerson = new ServicePerson(name, isBorn, height);
        return servicePerson.calculateAge();
    }

    public void saveContact(String name, Integer age, double height){
        List<Object> contactsTobeSaved = new ArrayList(10);
        contactsTobeSaved.add(name, age, height);
    }


}
