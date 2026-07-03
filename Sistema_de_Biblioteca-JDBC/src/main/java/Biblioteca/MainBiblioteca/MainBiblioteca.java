package Biblioteca.MainBiblioteca;
import Biblioteca.ClassBiblioteca.UsuarioBiblioteca;
import Biblioteca.Conexao.ClassConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainBiblioteca {
    static void main(String[] args)throws SQLException {
        int quantidade = 0;
        String name = null;
        String matricula_resposta = null;
        String livro = null;

        Scanner sc = new Scanner(System.in);

        try {
            quantidade = 1;

            System.out.print("Digite seu nome: ");
            name = sc.nextLine().toUpperCase();

            Connection conexao = ClassConnection.getConnection();

            String sql = "INSERT INTO ALUNOS (nome) VALUES('" + name + "');";

            Statement stmt = conexao.createStatement();
            stmt.execute(sql);


            System.out.print("Digite sua matrícula: ");
            matricula_resposta = sc.nextLine().trim();

            String sql2 = "INSERT INTO EMPRESTIMOS (matricula_aluno) VALUES('" + matricula_resposta + "');";
            stmt.execute(sql2);

            System.out.print("Digite o código do livro que deseja solicitar: ");
            livro = sc.nextLine();

            String sql3 = "INSERT INTO LIVROS (codigo) VALUES('" + livro + "');";
            stmt.execute(sql3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        UsuarioBiblioteca aluno = new UsuarioBiblioteca(name, matricula_resposta, livro);
        aluno.definirStatusInicial(matricula_resposta);
        aluno.verificarMatricula();
        aluno.verificarpendencias();
        aluno.sistemaDeEmprestimo(quantidade);


    }
}
