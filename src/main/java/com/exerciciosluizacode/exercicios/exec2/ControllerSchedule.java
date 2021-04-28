package com.exerciciosluizacode.exercicios.exec2;

import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;

import java.text.ParseException;

public class ControllerSchedule {

    public void controllerSchedule() throws ParseException {
        ServiceSchedule serviceSchedule = new ServiceSchedule("carol", "03/12/1995", 5.3);
        System.out.println(serviceSchedule.serviceSchedule());
    }
}
