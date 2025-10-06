package com.livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    protected List<Livro> livros = new ArrayList<>();
    protected List<Autor> autores = new ArrayList<>();
    protected List<Emprestimo> emprestimos = new ArrayList<>();

    Autor a1 = new Autor(1, "Rian Vilanova", "22/05/2006");
    Autor a2 = new Autor(2, "Renan Vilanova", "05/06/2005");
    Autor a3 = new Autor( 3, "Rodrigo Vilanova", "11/04/1987");

    public void addAutores(){
        autores.add(a1);
        autores.add(a2);
        autores.add(a3);
    }

    Livro l1 = new Livro(1, "Outliers", a1, false);
    Livro l2 = new Livro(2, "Pai rico, pai pobre", a2, true);
    Livro l3 = new Livro(3, "Harry Potter", a3, true);

    public void addLivros(){
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("ID: " + livro.getId() + " | Titulo: " + livro.getTitulo() + " | Autor: " + livro.getAutor());
            }
        }
    }

}
