package br.ifsp.bra.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.ifsp.bra.servidor.*;
import br.ifsp.bra.util.ImpressoraDadosServidor;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImpressoraDadosServidor impressora = new ImpressoraDadosServidor();

        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Criar Professor");
            System.out.println("2. Criar Técnico");
            System.out.println("3. Criar Aluno");
            System.out.println("4. Mostrar todos registrados");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do professor: ");
                    String nomeProf = sc.nextLine();
                    System.out.print("Disciplina: ");
                    String disc = sc.nextLine();
                    Professor p = new Professor(nomeProf, disc);
                    professores.add(p);
                    System.out.println("Professor registrado!");
                    break;

                case 2:
                    System.out.print("Nome do tecnico: ");
                    String nomeTec = sc.nextLine();
                    System.out.print("Setor: ");
                    String setor = sc.nextLine();
                    Tecnico t = new Tecnico(nomeTec, setor);
                    tecnicos.add(t);
                    System.out.println("Tecnico registrado!");
                    break;

                case 3:
                    System.out.print("Nome do aluno: ");
                    String nomeAlu = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();
                    Aluno a = new Aluno(nomeAlu, curso);
                    alunos.add(a);
                    System.out.println("Aluno registrado!");
                    break;

                case 4:
                    System.out.println("\n--- LISTA DE REGISTRADOS ---");
                    
                    if (professores.isEmpty() && tecnicos.isEmpty() && alunos.isEmpty()) {
                        System.out.println("Nenhum registro encontrado.");
                    } else {
                        for (Professor prof : professores) {
                            impressora.imprimir(prof);
                        }
                        for (Tecnico tec : tecnicos) {
                            impressora.imprimir(tec);
                        }
                        for (Aluno alu : alunos) {
                            impressora.imprimir(alu);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
