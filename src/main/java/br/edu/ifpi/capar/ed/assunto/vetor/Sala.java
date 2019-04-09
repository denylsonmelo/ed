package br.edu.ifpi.capar.ed.assunto.vetor;

import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Sala {

    public static void main(String[] args) {

        Vetor vetor = new Vetor();
        Scanner scanner = new Scanner(System.in);

        Aluno manoel = new Aluno();
        manoel.nome = "manoel";
        manoel.idade = 19;
        manoel.materia = "ingles";

        Aluno jamile = new Aluno();
        jamile.nome = "jamile";
        jamile.idade = 19;
        jamile.materia = "ingles";

        Aluno fatima = new Aluno();
        fatima.nome = "fatima";
        fatima.idade = 19;
        fatima.materia = "ingles";

        vetor.adicionar(manoel);
        vetor.adicionar(jamile);
        vetor.adicionar(fatima);

        scanner.next();
        long inicio = System.currentTimeMillis();
        System.out.println("adicionando");
        for (int i = 0; i < 3_000_000; i++) {
            fatima = new Aluno();
            fatima.nome = "nome de aluno -> " + i;
            vetor.adicionar(fatima);
        }
        long fim = System.currentTimeMillis();

        System.out.println("diferenca no adicionar: " + (fim - inicio) / 1000.0000000000);

        //System.out.println(vetor);
        Aluno alunoASerPesquisado = new Aluno();
        alunoASerPesquisado.nome = "vitin";

        scanner.next();
        inicio = System.currentTimeMillis();
        System.out.println(">>>  Aluno " + alunoASerPesquisado.nome + " estah no vetor: "
                + vetor.contem(alunoASerPesquisado));
        fim = System.currentTimeMillis();
        System.out.println("diferenca no pesquisar: " + (fim - inicio) / 1000.0000000000);

        //System.out.println(vetor.pegar(55));
        System.out.println("Quantidade de alunos no array: " + vetor.tamanho());

    }
}
