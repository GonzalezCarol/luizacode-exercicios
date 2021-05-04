package com.exerciciosluizacode.exercicios.exec2;

import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerSchedule {
    private String name;
    private String isBorn;
    private double height;

    public void controllerSchedule() throws ParseException {
//        ServiceSchedule serviceScheduleInstance = new ServiceSchedule();

        public void saveContact(){
            Scanner scanner = new Scanner(System.in);
            ServiceSchedule serviceScheduleInstance = new ServiceSchedule();



            int i;
            for(i=0; i<10; i++) {
                System.out.println("Informe o nome do primeiro contato");
                name = scanner.next();

                System.out.println("Informe a data de nascimento do contato ex: dd/MM/yyyy");
                isBorn = scanner.next();

                System.out.println("Informe a altura do contato");
                height = scanner.nextDouble();

                ServiceSchedule serviceSchedule = new ServiceSchedule(name, isBorn, height);
                 serviceScheduleInstance.saveContact(serviceSchedule.serviceSchedule());
                System.out.println(contacts[i]);
            }

        }
    }
}
