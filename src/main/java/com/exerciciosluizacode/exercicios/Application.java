package com.exerciciosluizacode.exercicios;

import com.exerciciosluizacode.exercicios.exe2204.exerc3.ExercicioTres;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ExercicioTres exerciciotres = new ExercicioTres();
		exerciciotres.letraA();

	}

}
