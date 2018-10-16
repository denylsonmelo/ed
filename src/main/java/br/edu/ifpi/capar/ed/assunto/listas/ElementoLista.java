package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class ElementoLista {

    private Materia proximo;

    public Materia irParaProximo() {
        return this.proximo;
    }

    public void definirProximo(Materia materia) {
        this.proximo = materia;
    }
}
