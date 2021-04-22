package com.exerciciosluizacode.exercicios.exe2204.exerc9;

import java.util.Scanner;

public class ExercicioNove {
    public void exercicioNove(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário");
        float salarioFuncionario = scanner.nextFloat();

        System.out.println("Digite a porcentagem do reajuste sem %");
        float porcentReajuste = scanner.nextFloat();

        float Aumento = salarioFuncionario*porcentReajuste/100f;
        float salarioFinal = Aumento+salarioFuncionario;

        System.out.println("O salário final é de: "+salarioFinal);


    }
}
