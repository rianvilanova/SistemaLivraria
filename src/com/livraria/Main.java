package com.livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.addAutores();
        biblioteca.addLivros();

        Scanner input = new Scanner(System.in);
        boolean sair = false;
        int emprestimoId = 1;
        while (!sair) {
            System.out.println("Livraria: Gostaria de ver os livros disponíveis para empréstimo? (1 para SIM, 0 para NAO)");
            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    biblioteca.listarLivros();
                    System.out.println("Para alugar um livro, digite o ID do livro.");
                    int id = input.nextInt();
                    input.nextLine();
                    Livro livroSelecionado = biblioteca.livros.get(id-1);
                    if (livroSelecionado != null) {
                        System.out.print("Digite o seu nome para registrar o emprestimo: ");
                        String nome = input.next();
                        Emprestimo emprestimo = new Emprestimo(nome, id, livroSelecionado);
                        livroSelecionado.setDisponivel(false);
                        System.out.println("Emprestimo realizado com sucesso. ID: " + emprestimoId + ".");
                        emprestimoId++;
                        System.out.println(emprestimo.toString());
                    } else System.out.println("Livro nao encontrado.");
                case "0":
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
    }
}
