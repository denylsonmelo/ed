package br.edu.ifpi.capar.ed.assunto.fila;

import br.edu.ifpi.capar.ed.assunto.Aluno;
import br.edu.ifpi.capar.ed.assunto.lista.Lista;

/**
 *
 * @author seijuh
 */
public class Fila extends Lista {

    public Aluno remover(){
        return super.remover(0);
    }
    
    @Override
    public void adicionar(Aluno aluno) {
        super.adicionar(aluno);
    }

    @Override
    public Aluno remover(int posicao) {
        System.out.println("por favor chame o metodo remover() sem parametros");
        return null;
    }

}
