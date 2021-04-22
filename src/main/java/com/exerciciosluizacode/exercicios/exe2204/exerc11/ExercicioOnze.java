package com.exerciciosluizacode.exercicios.exe2204.exerc11;

import java.awt.*;
import java.util.Scanner;

public class ExercicioOnze {

    public void exercicioOnze(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        int salarioFunc = scanner.nextInt();

        System.out.println("Digite o número de carros vendidos");
        int numeroCarros = scanner.nextInt();

        System.out.println("Digite o valor total dos veiculos");
        int totalVeiculos = scanner.nextInt();

        System.out.println("Digite o valor dos carros vendidos");
        int valorCarroVendido = scanner.nextInt();

        int comicao1 = numeroCarros*valorCarroVendido;
        int comicao2 = totalVeiculos *5;

        int salarioFinal = salarioFunc+comicao1+comicao2;

        System.out.println("O salário final do vendedor é de: "+salarioFinal);




    }

}
