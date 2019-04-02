package br.edu.ifpi.capar.ed.assunto.vetor;

import java.util.Arrays;

/**
 *
 * @author seijuh
 */
public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int quantidadeAlunosCadastrados = 0;

    public int tamanho() {
        return this.quantidadeAlunosCadastrados;
    }

    public void adicionar(Aluno aluno) {
        this.alunos[quantidadeAlunosCadastrados] = aluno;
        this.quantidadeAlunosCadastrados++;
    }

    @Override
    public String toString() {
        String vetor = new String("Vetor [");

        for (int i = 0; i < (this.tamanho() - 1); i++) {
            vetor = vetor + this.alunos[i].nome + ", ";
        }

        if (this.tamanho() > 0) {
            vetor = vetor + this.alunos[this.tamanho() - 1].nome;
        }
        vetor = vetor + "]";
        return vetor;
    }
}
