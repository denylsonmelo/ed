package br.edu.ifpi.capar.ed.assunto.pilha;

import br.edu.ifpi.capar.ed.assunto.Aluno;
import br.edu.ifpi.capar.ed.assunto.lista.ElementoLista;
import br.edu.ifpi.capar.ed.assunto.lista.Lista;

/**
 *
 * @author seijuh
 */
public class Pilha extends Lista {

    //TODO bloquear os outros metodos
    
    public Aluno pop() throws Exception {
        Aluno ultimoAluno = null;
        
        if (estahVazia()) {
            throw new Exception("nao ha elementos");
        }
        if (this.tamanho() == 1) {

            ultimoAluno = this.inicio.getAluno();
            
            this.inicio = this.fim = null;
            this.quantidadeAlunosCadastrados--;

        } else {
            ElementoLista anterior = this.inicio;
            ElementoLista elemento = this.inicio.getProximo();

            for (int i = 1; i < tamanho(); i++) {
                if (elemento.getProximo() == null) {  //  elemento.equals(this.fim) // precisa do equal() e hashCode()
                    fim = anterior;
                    anterior.setProximo(null);
                    this.quantidadeAlunosCadastrados--;
                    
                    ultimoAluno = elemento.getAluno();
                    
                    elemento = null; // opcional por conta do gc
                    break;
                }

                anterior = elemento;
                elemento = elemento.getProximo();
            }
        }
        return ultimoAluno;
    }

    @Override
    public void remover(int posicao) {
        System.out.println("por favor chame o metodo pop()");
    }

    @Override
    public void adicionar(Aluno aluno) {
        System.out.println("por favor, para adicionar o {aluno= " + aluno.nome + "} chame o metodo push()");
    }

    public void push(Aluno aluno) {
        super.adicionar(aluno);
    }

    public boolean estahVazia() {

        if (this.tamanho() == 0) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String impressao = "Pilha{\n\t" + "quantidade=" + tamanho() + ",";

        ElementoLista iterando = this.inicio;
        for (int i = 0; i < tamanho(); i++) {
            impressao = impressao + "\n\t" + "aluno: " + iterando.getAluno().nome + ",";
            iterando = iterando.getProximo();
        }

        return impressao + "\n}";
    }

}
