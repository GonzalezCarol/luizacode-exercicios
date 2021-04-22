package com.exerciciosluizacode.exercicios.exe2204.exerc10;

import java.util.Scanner;

public class ExercicioDez {
    public void exercicioDez(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de custo do carro");
        int valorCusto = scanner.nextInt();

        int valorDistribuidor = valorCusto*28/100;
        int valorImposto= valorCusto*45/100;

        int valorFinal = valorCusto+valorDistribuidor+valorImposto;

        System.out.println("O valor final do carro é de: "+valorFinal);

    }
}
