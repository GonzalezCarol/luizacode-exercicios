package com.exerciciosluizacode.exercicios.exe2704.exec1;

//import java.time.LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class ServicePerson  extends Person{
    private Person person;

    public ServicePerson() {
    }

    public void calculateAge() throws ParseException {

        DateFormat dateIsbornFormated = new SimpleDateFormat("dd/M/yyyy");
        Date date = dateIsbornFormated.parse(person.getIsBorn());

        Calendar isBorn = Calendar.getInstance();
        isBorn.setTime(date);

        Calendar currentYear = Calendar.getInstance();
        currentYear.setTime(new Date());

        Integer yearIsBornResult = isBorn.get(Calendar.YEAR);
        Integer currentYearResult = currentYear.get(Calendar.YEAR);
        Integer monthIsBornResult = isBorn.get(Calendar.MONTH)+1;
        Integer dayIsBornResult = isBorn.get(Calendar.DAY_OF_MONTH);

        Integer Age = currentYearResult - yearIsBornResult;

        System.out.println("Idade - Anos:"+Age+" Meses:"+monthIsBornResult+" Dia:"+dayIsBornResult);

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
