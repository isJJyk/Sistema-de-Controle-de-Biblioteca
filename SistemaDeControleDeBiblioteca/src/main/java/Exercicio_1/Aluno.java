package Exercicio_1;


public class Aluno {
    public String name;
    public String livro;
    public boolean existe;
    public String matricula_resposta;
    public String[] matricula = {"1024", "3478", "5812", "7645", "9381", "1234"};
    public String[] livroCode = {"6756","8142","3975","4589","3176"};
    public int estoque = livroCode.length;

    public void verificarMatricula() {
        for (String matriculas : matricula) {
            if (matriculas.equals(matricula_resposta)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("Bem vindo! " + name);
        } else {
            System.out.println("Aluno não encontrado");
            System.exit(0);
        }
    }

    public void verificarpendencias() {
        if (matricula_resposta.equals("5812") | matricula_resposta.equals("9381")) {
            System.out.println("Empréstimo bloqueado por multa.");
            System.exit(0);
        } else if (matricula_resposta.equals("1234")) {
            System.out.println("Limite de empréstimos atingido");
            System.exit(0);
        }
    }
    public void sistemaDeEmprestimo(int quantidade){
        for (String resposta:livroCode){
            if (resposta.equals(livro)) {
                existe = true;
                break;
            }
        }
        if (livro.equals("3176")|livro.equals("4589")){
            System.out.println("Livro Indisponível");
            System.exit(0);
        }else {
            estoque-=quantidade;
        }
        System.out.println("Estoque atual: "+estoque);
        System.out.println("Empréstimo realizado com sucesso");
    }

}
