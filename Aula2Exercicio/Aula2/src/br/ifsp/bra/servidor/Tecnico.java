package br.ifsp.bra.servidor;

public class Tecnico {
    private String nome;
    private String setor;

    public Tecnico() {
        this.nome = "Sem nome";
        this.setor = "Não definido";
    }

    public Tecnico(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public String toString() {
        return "Técnico: " + nome + " | Setor: " + setor;
    }
}
