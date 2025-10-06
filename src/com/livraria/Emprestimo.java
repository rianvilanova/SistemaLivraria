package com.livraria;

import java.util.Scanner;

public class Emprestimo {
    private String nome;
    private int id;
    private Livro livro;

    public Emprestimo(String nome, int id, Livro livro) {
        this.nome = nome;
        this.id = id;
        this.livro = livro;
    }
}
