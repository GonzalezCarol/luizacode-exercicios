package com.exerciciosluizacode.exercicios.exe2204.exerc7;

import java.util.Scanner;

public class ExercicioSete {

    public void exercicioSete(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade em anos, meses e dia");

        System.out.println("Anos");
        int anos = scanner.nextInt();

        System.out.println("Meses");
        int meses = scanner.nextInt();

        System.out.println("Dias");
        int dias = scanner.nextInt();

        int anosEmDias = anos*365;
        int mesesEmDias = meses*30;
        int resultadoFinal = anosEmDias+mesesEmDias+dias;

        System.out.println("Sua idade em dias é de: "+resultadoFinal);


    }

}
