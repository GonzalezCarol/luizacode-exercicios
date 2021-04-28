package com.exerciciosluizacode.exercicios.exec2;

import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;
import java.util.Scanner;

public class ControllerSchedule {
    private String name;
    private String isBorn;
    private double height;

    public void controllerSchedule() throws ParseException {
        Scanner scanner = new Scanner(System.in);

            for(int i=0; i<10; i++) {
                System.out.println("Informe o nome do primeiro contato");
                name = scanner.next();

                System.out.println("Informe a data de nascimento do contato ex: dd/MM/yyyy");
                isBorn = scanner.next();

                System.out.println("Informe a altura do contato");
                height = scanner.nextDouble();

                ServiceSchedule serviceSchedule = new ServiceSchedule(name, isBorn, height);
                System.out.println(serviceSchedule.serviceSchedule());
            }
    }
}
