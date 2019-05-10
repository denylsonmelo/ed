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

    private void verificarSeEhValidaA(int posicao) {
        if (posicao < 0) {
            throw new IllegalArgumentException("Espero que a posicao seja maior que zero");
        }
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException("nao existe elementos nessa posicao");
        }
    }

    public boolean contem(Aluno aluno){
        ElementoLista elemento = inicio;
        for (int i = 0; i < tamanho(); i++) {
            if(elemento.getAluno().equals(aluno)){
                return true;
            }else{
                elemento = elemento.getProximo();
            }
        }

        return false;
    }
    
    public boolean contem(String nome){
        ElementoLista elemento = inicio;
        for (int i = 0; i < tamanho(); i++) {
            if(elemento.getAluno().nome.equals(nome)){
                return true;
            }else{
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
            if(i == posicao){
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

    @Override
    public String toString() {
        String impressao = "Lista{\n\t" + "quantidade=" + tamanho() + ",";

        ElementoLista iterando = inicio;
        for (int i = 0; i < tamanho(); i++) {
            impressao = impressao + "\n\t" + "aluno: " + iterando.getAluno().nome + ",";
            iterando = iterando.getProximo();
        }

        return impressao + "\n}";
    }

}
