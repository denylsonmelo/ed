package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class ElementoLista {

    private final Materia materia;
    private ElementoLista proximo;

    public Materia getMateria(){
        return this.materia;
    }
    
    public ElementoLista irParaProximo() {
        return this.proximo;
    }

    public void definirProximo(ElementoLista elemento) {
        this.proximo = elemento;
    }

    public ElementoLista(Materia materia) {
        this.materia = materia;
        this.proximo = null;
    }
    
    @Override
    public String toString(){
        return this.materia.getNome();
    }
}
