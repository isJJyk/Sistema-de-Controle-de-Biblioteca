package Exercicio_1;


import java.util.Scanner;


public class Biblioteca_Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int quantidade = 1;

        System.out.print("Digite seu nome: ");
        aluno.name = sc.nextLine().toUpperCase();
        System.out.print("Digite sua matrícula: ");
        aluno.matricula_resposta = sc.nextLine().trim();
        aluno.verificarMatricula();
        aluno.verificarpendencias();
        System.out.print("Digite o código do livro que deseja solicitar: ");
        aluno.livro = sc.next();
        aluno.sistemaDeEmprestimo(quantidade);
    }
}
