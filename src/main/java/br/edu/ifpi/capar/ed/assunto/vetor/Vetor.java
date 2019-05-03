package br.edu.ifpi.capar.ed.assunto.vetor;

import br.edu.ifpi.capar.ed.assunto.Aluno;

/**
 *
 * @author seijuh
 */
public class Vetor {

    private Aluno[] alunos = new Aluno[40];
    private int quantidadeAlunosCadastrados = 0;

    public void remover(int posicao) {
        this.verificarSeEhValidaA(posicao);
        boolean apagouAlgumaCoisa = false;
        
        for (int i = posicao; i < tamanho(); i++) {
            this.alunos[i] = this.alunos[i + 1];
            apagouAlgumaCoisa = true;
        }
        
        if(apagouAlgumaCoisa)
            this.quantidadeAlunosCadastrados--;
    }

    public boolean contem(Aluno aluno) {

        for (int i = 0; i < tamanho(); i++) {
            System.out.println("posicao do i: " + i + ", aluno: " + this.alunos[i].nome);
            if (aluno.equals(this.alunos[i])) {
                return true;
            }
        }

        return false;
    }

    public Aluno pegar(int posicao) {
        this.verificarSeEhValidaA(posicao);
        return this.alunos[posicao];
    }

    public int tamanho() {
        return this.quantidadeAlunosCadastrados;
    }

    private void verificarSePrecisarAumentarVetor() {
        if (this.quantidadeAlunosCadastrados == this.alunos.length) {
            Aluno[] auxiliar = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < tamanho(); i++) {
                auxiliar[i] = this.alunos[i];
            }
            this.alunos = auxiliar;
        }
    }

    private void verificarSeEhValidaA(int posicao) {
        if (posicao < 0) {
            throw new IllegalArgumentException("Espero que a posicao seja maior que zero");
        }
        if (posicao > tamanho()) {
            throw new IllegalArgumentException("nao existe elementos nessa posicao");
        }
    }

    public void adicionar(int posicao, Aluno aluno) {
        this.verificarSeEhValidaA(posicao);
        this.verificarSePrecisarAumentarVetor();

        if (posicao == tamanho()) {
            adicionar(aluno);
        }
        if (posicao < tamanho()) {
            for (int i = tamanho(); i > posicao; i--) {

                this.alunos[i] = this.alunos[i-1];

            }
            this.alunos[posicao] = aluno;
            this.quantidadeAlunosCadastrados++;
        }

    }

    public void adicionar(Aluno aluno) {
        this.verificarSePrecisarAumentarVetor();
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
