package MainBiblioteca;

import java.util.Scanner;
import ClassBilioteca.ClassBiblioteca;
public class MainBibli {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidade = 1;

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine().toUpperCase();
        System.out.print("Digite sua matrícula: ");
        String matricula_resposta = sc.nextLine().trim();
        System.out.print("Digite o código do livro que deseja solicitar: ");
        String livro = sc.nextLine();
        ClassBiblioteca aluno = new ClassBiblioteca(name, matricula_resposta, livro);
        aluno.verificarMatricula();
        aluno.verificarpendencias();
        aluno.sistemaDeEmprestimo(quantidade);

    }
}
