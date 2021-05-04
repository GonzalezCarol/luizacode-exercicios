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

    public Integer serviceScheduleReturnAge() throws ParseException {
        String name = getName();
        String isBorn = getIsBorn();
        double height = getHeight();

        ServicePerson servicePerson = new ServicePerson(name, isBorn, height);
        return servicePerson.calculateAge();
    }

    public List saveContact(String name, Integer age, Double height) {
        Person person = new Person();
        List<Object> contactsTobeSaved = new ArrayList(10);
        person.setName = name;
        person.setAge = setName(name);
        person.SetHeight = setName(name);

        contactsTobeSaved.add(person);
        return contactsTobeSaved;
    }
}
