package com.exerciciosluizacode.exercicios.exe2204.exerc6;

import java.util.Scanner;

public class ExercicioSeis {

    public void exercicioSeis(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a base do retangulo");
        int base = scanner.nextInt();

        System.out.println("Digite a altura do retangulo");
        int altura = scanner.nextInt();

        int result = base * altura;

        System.out.println("A área do retangulo é:"+ result);

    }

}
