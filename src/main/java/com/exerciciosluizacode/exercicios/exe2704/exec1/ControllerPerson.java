package com.exerciciosluizacode.exercicios.exe2704.exec1;
import com.exerciciosluizacode.exercicios.exe2704.exec1.Person;
import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;
import java.util.Scanner;

public class ControllerPerson {
    public void controllerPerson() throws ParseException {

        ServicePerson servicePerson = new ServicePerson();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String name = scanner.next();

        System.out.println("Informe a data do seu nascimento");
        String isBorn = scanner.next();

        System.out.println("Informe sua altura");
        Double height = scanner.nextDouble();

        ServicePerson person1 = new ServicePerson(name, isBorn, height);

        System.out.println(person1.calculateAge());

    }
}
