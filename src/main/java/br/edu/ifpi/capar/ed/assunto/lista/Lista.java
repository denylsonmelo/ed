package br.edu.ifpi.capar.ed.assunto.lista;

import br.edu.ifpi.capar.ed.assunto.Aluno;

/**
 *
 * @author seijuh
 */
public class Lista {

    private ElementoLista inicio;
    private ElementoLista fim;
    private int quantidadeAlunosCadastrados = 0;

    public void adicionar(Aluno aluno) {
        if (inicio == null && fim == null) {
            ElementoLista novoElemento = new ElementoLista();
            novoElemento.setProximo(null);
            novoElemento.setAluno(aluno);
            inicio = novoElemento;
            fim = novoElemento;
        } else {
            ElementoLista novoElemento = new ElementoLista();
            novoElemento.setAluno(aluno);
            novoElemento.setProximo(null);
            fim.setProximo(novoElemento);
            fim = novoElemento;
        }

        this.quantidadeAlunosCadastrados++;
    }

    public int tamanho() {
        return quantidadeAlunosCadastrados;
    }

    @Override
    public String toString() {
        String impressao = "Lista{\n\t" + "quantidade=" + tamanho();

        impressao = impressao + "\n\t" + "aluno: " + inicio.getAluno().nome;

        ElementoLista iterando = inicio.getProximo();
        for (int i = 1; i < tamanho() ; i++) {
            impressao = impressao + "\n\t" + iterando.getAluno().nome;
            iterando = iterando.getProximo();
        }

        return impressao + "\n}";
    }

}
