package br.ifsp.bra.servidor;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor() {
        this.nome = "Sem nome";
        this.disciplina = "Não definida";
    }

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " | Disciplina: " + disciplina;
    }
}
