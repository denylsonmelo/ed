package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class MateriaLista {

    private Materia proximo;
    private Materia anterior;

    public void adicionar(Materia materia){
        this.array = materia;
        this.proximo = materia;
        this.anterior = proximoanterio;
    }
    
    public Materia irParaAnterior() {
        return this.anterior;
    }

    public void definirAnterior(Materia materia) {
        this.anterior = materia;
    }

    public Materia irParaProximo() {
        return this.proximo;
    }

    public void definirProximo(Materia materia) {
        this.proximo = materia;
    }
}
