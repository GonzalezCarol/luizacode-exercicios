package com.exerciciosluizacode.exercicios.exec2;

import com.exerciciosluizacode.exercicios.exe2704.exec1.Person;
import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ServiceSchedule extends Person {

    List<Object> contactsListSchedule = new ArrayList<Object>(10);

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

    public void saveContact(String name, Integer age, Double height) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setHeight(height);

        contactsListSchedule.add(person);

    }

    public void removePersonByName(String name){
        for(Object scheduleContact: contactsListSchedule){
            if(scheduleContact.equals(name)) {
                contactsListSchedule.remove(scheduleContact);
            }
        }
        printSchedule();
    }

    public void printSchedule(){
        for(Object scheduleContact: contactsListSchedule){
            System.out.println("Contato:::"+scheduleContact);
        }
    }

    public void printContactByIndex(int index){
        System.out.println("Contato:::"+contactsListSchedule.get(index));
    }
}
