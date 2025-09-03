package br.ifsp.bra.servidor;

public class Aluno {
    private String nome;
    private String curso;

    public Aluno() {
        this.nome = "Sem nome";
        this.curso = "Não definido";
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Curso: " + curso;
    }
}
