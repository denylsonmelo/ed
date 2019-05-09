package br.edu.ifpi.capar.ed.assunto.lista;

import br.edu.ifpi.capar.ed.assunto.Aluno;

/**
 *
 * @author seijuh
 */
public class ElementoLista {
      private ElementoLista proximo;
      private Aluno aluno;

    public ElementoLista getProximo() {
        return proximo;
    }

    public void setProximo(ElementoLista proximo) {
        this.proximo = proximo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return aluno.toString();
    }
      
      
}
