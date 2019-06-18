package br.edu.ifpi.capar.ed.assunto.lista;

import br.edu.ifpi.capar.ed.assunto.Aluno;

/**
 *
 * @author seijuh
 */
public class Lista {

    protected ElementoLista inicio;
    protected ElementoLista fim;
    protected int quantidadeAlunosCadastrados = 0;

    public Aluno remover(int posicao) {
        this.verificarSeEhValidaA(posicao);
        Aluno alunoParaRetornar = null;

        if (posicao == 0) {

            ElementoLista elemento = this.inicio.getProximo();
            this.inicio.setProximo(null);
            alunoParaRetornar = this.inicio.getAluno();
            this.inicio = elemento;

            this.quantidadeAlunosCadastrados--;
            return alunoParaRetornar;
        }

        ElementoLista elemento = this.inicio.getProximo(); //segundo da lista
        ElementoLista anterior = this.inicio; // primeiro da lista
        for (int i = 1; i < tamanho(); i++) {
            if (posicao == i) {
                alunoParaRetornar = elemento.getAluno();
                anterior.setProximo(elemento.getProximo());
                elemento.setProximo(null);
                this.quantidadeAlunosCadastrados--;
                return alunoParaRetornar;
            }

            anterior = elemento;
            elemento = elemento.getProximo();
        }
        return null;
    }

    private void verificarSeEhValidaA(int posicao) {
        if (posicao < 0) {
            throw new IllegalArgumentException("Espero que a posicao seja maior que zero");
        }
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException("nao existe elementos nessa posicao");
        }
    }

    public boolean contem(Aluno aluno) {
        ElementoLista elemento = inicio;
        for (int i = 0; i < tamanho(); i++) {
            if (elemento.getAluno().equals(aluno)) {
                return true;
            } else {
                elemento = elemento.getProximo();
            }
        }

        return false;
    }

    public boolean contem(String nome) {
        ElementoLista elemento = inicio;
        for (int i = 0; i < tamanho(); i++) {
            if (elemento.getAluno().nome.equals(nome)) {
                return true;
            } else {
                elemento = elemento.getProximo();
            }
        }

        return false;
    }

    public Aluno pegar(int posicao) {
        this.verificarSeEhValidaA(posicao);

        Aluno aluno = null;
        ElementoLista elemento = inicio;
        for (int i = 0; i < tamanho(); i++) {
            if (i == posicao) {
                aluno = elemento.getAluno();
                break;
            }
            elemento = elemento.getProximo();
        }

        return aluno;
    }

    public void adicionar(Aluno aluno) {
        ElementoLista novoElemento = new ElementoLista();
        novoElemento.setProximo(null);
        novoElemento.setAluno(aluno);

        if (inicio == null && fim == null) {
            inicio = novoElemento;
        } else {
            fim.setProximo(novoElemento);
        }
        fim = novoElemento;

        this.quantidadeAlunosCadastrados++;
    }

    public int tamanho() {
        return quantidadeAlunosCadastrados;
    }

    //one liner method
    public boolean estahVazia() {
        return (this.tamanho() == 0) ? true : false;
    }

    @Override
    public String toString() {
        return this.imprimir(this.nomeClasse());
    }

    protected String nomeClasse() {
        return this.getClass().getSimpleName();
    }

    protected String imprimir(String tipo) {
        String impressao = tipo + " {\n\t" + "quantidade=" + tamanho() + ",";

        ElementoLista iterando = this.inicio;
        for (int i = 0; i < tamanho(); i++) {
            impressao = impressao + "\n\t" + "aluno: " + iterando.getAluno().nome + ",";
            iterando = iterando.getProximo();
        }

        return impressao + "\n}";
    }
}
