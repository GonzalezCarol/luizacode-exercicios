package com.exerciciosluizacode.exercicios.exe2304;
import java.time.LocalDateTime;
import java.util.List;

public class Livros {
    public String titulo;
    public String autor;
    public int matricula;
    public int quantidade;
    public boolean statusAlugado;
    public LocalDateTime retirada;
    public String devolucao;

    public Livros(String titulo, String autor, int matricula, int quantidade, boolean statusAlugado, LocalDateTime retirada, String devolucao) {
        this.titulo = titulo;
        this.autor = autor;
        this.matricula = matricula;
        this.quantidade = quantidade;
        this.statusAlugado = statusAlugado;
        this.retirada = retirada;
        this.devolucao = devolucao;
    }

    public Livros(){}

    public void listarLivros(List<Livros> listaLivros){

//        retirada = LocalDateTime.now();

//        System.out.println("titulooo :::"+titulo);
//        System.out.println("LISTO DE LIVROOS :::"+listaLivros.get(0).titulo);

        for(Livros list: listaLivros){
            if(list.statusAlugado == true){
                System.out.println();
            }
        }

    }

}
