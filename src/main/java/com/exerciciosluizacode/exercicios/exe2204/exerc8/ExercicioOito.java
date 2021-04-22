package com.exerciciosluizacode.exercicios.exe2204.exerc8;

import java.util.Scanner;

public class ExercicioOito {
    public void exercicioOito(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número de eleitores");
        int eleitores = scanner.nextInt();

        System.out.println("Insira o número de votos brancos");
        int votosBrancos = scanner.nextInt();

        System.out.println("Insira o número de votos nulos");
        int votosNulos = scanner.nextInt();

        System.out.println("Insira o número de votos válidos");
        int votosValidos = scanner.nextInt();

        int quantidadeDeVotos = votosBrancos+votosNulos+votosValidos;

        if(eleitores != quantidadeDeVotos){
            System.out.println("A quantidade de votos não corresponde a quantidade de eleitores");
        }else {

            float porcentBrancos = 100 * votosBrancos / eleitores;
            float porcentNulos = 100f * votosNulos / eleitores;
            float porcentValidos = 100f * votosValidos / eleitores;

            System.out.println("A porcentagem de votos brancos, nulos e válidos respectivamente" +
                    " é de " + porcentBrancos + "% " + porcentNulos + "% " + porcentValidos + "%");
        }



    }
}
