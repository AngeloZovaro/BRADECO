package br.ifsp.bra.main;

import br.ifsp.bra.servidor.*;
import br.ifsp.bra.util.ImpressoraDadosServidor;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Luiz Gustado", "BRADECO");
        Tecnico tec = new Tecnico("João", "TI");
        Aluno aluno = new Aluno("Angelo", "ADS");

        ImpressoraDadosServidor impressora = new ImpressoraDadosServidor();

        impressora.imprimir(prof);
        impressora.imprimir(tec);
        impressora.imprimir(aluno);
    }
}
