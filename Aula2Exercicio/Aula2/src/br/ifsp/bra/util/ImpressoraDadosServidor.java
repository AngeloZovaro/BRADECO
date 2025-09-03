package br.ifsp.bra.util;

import br.ifsp.bra.servidor.*;

public class ImpressoraDadosServidor {

    public void imprimir(Professor professor) {
        System.out.println(professor);
    }

    public void imprimir(Tecnico tecnico) {
        System.out.println(tecnico);
    }

    public void imprimir(Aluno aluno) {
        System.out.println(aluno);
    }
}
