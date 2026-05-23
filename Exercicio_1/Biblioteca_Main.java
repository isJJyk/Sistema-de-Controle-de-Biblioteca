package Exercicio_1;


import java.util.Scanner;


public class Biblioteca_Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int quantidade = 1;

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Digite sua matrícula: ");
        String matricula_resposta = sc.nextLine().trim();
        System.out.print("Digite o código do livro que deseja solicitar: ");
        String livro = sc.nextLine();
        Aluno_Class aluno = new Aluno_Class(name, matricula_resposta, livro);
        aluno.verificarMatricula();
        aluno.verificarpendencias();
        aluno.sistemaDeEmprestimo(quantidade);

    }
}
