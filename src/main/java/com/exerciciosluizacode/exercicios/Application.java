package com.exerciciosluizacode.exercicios;


import com.exerciciosluizacode.exercicios.exe2704.exec1.Person;
import com.exerciciosluizacode.exercicios.exe2704.exec1.ServicePerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
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

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o seu nome");
		String name = scanner.next();

		ServicePerson servicePerson = new ServicePerson(name, "03-12-1995", 1.64);
//		servicePerson.setName("CAROLA");
		System.out.println(servicePerson.getName());




	}

}
