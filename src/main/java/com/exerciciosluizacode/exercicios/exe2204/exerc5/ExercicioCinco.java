package com.exerciciosluizacode.exercicios.exe2204.exerc5;

import java.util.Scanner;

public class ExercicioCinco {

    public void exercicioCinco() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int numDigitado = scanner.nextInt();
        System.out.println("\nO antecessor de " + numDigitado + " é o " + (numDigitado - 1));
    }
}
