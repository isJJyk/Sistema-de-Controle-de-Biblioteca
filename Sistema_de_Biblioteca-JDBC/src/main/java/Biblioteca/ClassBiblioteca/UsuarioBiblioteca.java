package Biblioteca.ClassBiblioteca;

import Biblioteca.EnumVer.EnumBibli;

public class UsuarioBiblioteca {
    protected String name;
    protected String livro;
    protected boolean existe;
    protected String matricula_resposta;
    protected EnumBibli statusAluno;

    private final String[] matricula = {"1024", "3478", "5812", "7645", "9381", "1234"};
    private final String[] livroCode = {"6756", "8142", "3975", "4589", "3176"};
    protected int estoque = livroCode.length;

    public UsuarioBiblioteca(String name, String matricula_resposta, String livro) {
        this.name = name;
        this.matricula_resposta = matricula_resposta;
        this.livro = livro;
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

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public EnumBibli getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(EnumBibli statusAluno) {
        this.statusAluno = statusAluno;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // metodo que define como as matriculas estao classificadas
    public EnumBibli definirStatusInicial(String matricula) {
        if (matricula.equals("5812") || matricula.equals("9381")) {
            return EnumBibli.MULTADO;
        } else if (matricula.equals("1234")) {
            return EnumBibli.LIMITE_ATINGIDO;
        } else {
            return EnumBibli.REGULAR;

        }

    }

    // apos o usuario digitar a matricula um for percorre cada matricula para garantir que ela esteja no sistema
    public void verificarMatricula() {
        for (String matriculas : getMatricula()) {
            if (matriculas.equals(getMatricula_resposta())) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Matricula nao cadastrada!!");
            System.exit(0);
        } else {
            System.out.println("bem vindo(a) " + getName());
        }


    }

    public void verificarpendencias() {
        if (this.getStatusAluno() == EnumBibli.MULTADO) {
            System.out.println("Empréstimo bloqueado por multa.");
            System.exit(0);
        } else if (this.getStatusAluno() == EnumBibli.LIMITE_ATINGIDO) {
            System.out.println("Limite de empréstimos atingido");
            System.exit(0);
        }

    }public void sistemaDeEmprestimo(int quantidade){
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
