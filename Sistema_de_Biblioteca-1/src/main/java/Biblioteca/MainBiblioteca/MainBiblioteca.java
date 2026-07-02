package Biblioteca.MainBiblioteca;
import Biblioteca.ClassBiblioteca.UsuarioBiblioteca;
import java.util.Scanner;

public class MainBiblioteca {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            int quantidade = 1;

            System.out.print("Digite seu nome: ");
            String name = sc.nextLine().toUpperCase();

            System.out.print("Digite sua matrícula: ");
            String matricula_resposta = sc.nextLine().trim();

            System.out.print("Digite o código do livro que deseja solicitar: ");
            String livro = sc.nextLine();

            UsuarioBiblioteca aluno = new UsuarioBiblioteca(name, matricula_resposta, livro);
            aluno.definirStatusInicial(matricula_resposta);
            aluno.verificarMatricula();
            aluno.verificarpendencias();
            aluno.sistemaDeEmprestimo(quantidade);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
