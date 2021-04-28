package com.exerciciosluizacode.exercicios;


import com.exerciciosluizacode.exercicios.exe2704.exec1.ControllerPerson;

import com.exerciciosluizacode.exercicios.exec2.ControllerSchedule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(Application.class, args);

//		ExercicioTres exercicioTres = new ExercicioTres();
//		ExercicioQuatro exercicioQuatro = new ExercicioQuatro();
//		ExercicioCinco exercicioCinco = new ExercicioCinco();
//		ExercicioSeis exercicioSeis = new ExercicioSeis();
//		ExercicioSete exercicioSete = new ExercicioSete();
//		ExercicioOito exercicioOito = new ExercicioOito();
//		ExercicioNove exercicioNove = new ExercicioNove();
//		ExercicioDez exercicioDez = new ExercicioDez();
//		ExercicioOnze exercicioOnze = new ExercicioOnze();

//		exercicioTres.letraA();
//		exercicioTres.letraB();
//		exercicioTres.letraC();

//		exercicioQuatro.letraA();
//		exercicioQuatro.letraB();
//		exercicioQuatro.letraC();
//		exercicioQuatro.letraD();
//		exercicioQuatro.letraE();
//		exercicioQuatro.letraF();
//		exercicioQuatro.letraG();
//		exercicioQuatro.letraH();
//		exercicioQuatro.letraI();
//		exercicioQuatro.letraJ();

//		exercicioCinco.exercicioCinco();

//		exercicioSeis.exercicioSeis();

//		exercicioSete.exercicioSete();

//		exercicioOito.exercicioOito();

//		exercicioNove.exercicioNove();

//		exercicioDez.exercicioDez();

//		exercicioOnze.exercicioOnze();



		//! Exercicios dia 27/04

		//! Exercicio 1
//		ControllerPerson controllerPerson = new ControllerPerson();
//		controllerPerson.controllerPerson();

		//!Exercicio 2

		ControllerSchedule controllerSchedule = new ControllerSchedule();
		controllerSchedule.controllerSchedule();



	}

}
