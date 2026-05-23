package Exercicio_1;


public class Aluno_Class {
    private String name;
    private String livro;
    private boolean existe;
    private String matricula_resposta;
    private String[] matricula = {"1024", "3478", "5812", "7645", "9381", "1234"};
    private String[] livroCode = {"6756", "8142", "3975", "4589", "3176"};
    private int estoque = livroCode.length;

    public Aluno_Class(String name, String matricula_resposta, String livro) {
        this.name = name;
        this.livro = livro;
        this.matricula_resposta = matricula_resposta;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return livro;
    }

    public void setMatricula_resposta(String matricula_resposta) {
        this.matricula_resposta = matricula_resposta;
    }

    public String getMatricula_resposta() {
        return matricula_resposta;
    }


    public String[] getMatricula() {
        return matricula;
    }


    public String[] getLivroCode() {
        return livroCode;
    }

    public int getEstoque() {
        return estoque;
    }


    public void verificarMatricula() {
        for (String matriculas : getMatricula()) {
            if (matriculas.equals(getMatricula_resposta())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("Bem vindo! " + getName());
        } else {
            System.out.println("Aluno não encontrado");
            System.exit(0);
        }
    }

    public void verificarpendencias() {
        if (getMatricula_resposta().equals("5812") | getMatricula_resposta().equals("9381")) {
            System.out.println("Empréstimo bloqueado por multa.");
            System.exit(0);
        } else if (getMatricula_resposta().equals("1234")) {
            System.out.println("Limite de empréstimos atingido");
            System.exit(0);
        }
    }

    public void sistemaDeEmprestimo(int quantidade) {
        for (String resposta : getLivroCode()) {
            if (resposta.equals(getLivro())) {
                existe = true;
                break;
            }
        }
        if (getLivro().equals("3176") | getLivro().equals("4589")) {
            System.out.println("Livro Indisponível");
            System.exit(0);
        } else {
            this.estoque -= quantidade;
        }
        System.out.println("Estoque atual: " + getEstoque());
        System.out.println("Empréstimo realizado com sucesso");
    }

}
