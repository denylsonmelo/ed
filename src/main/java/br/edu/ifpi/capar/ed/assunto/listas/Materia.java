package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class Materia {

    private final String nome;
    private final String cargaHoraria;
    
    public String getNome() {
        return nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public Materia(String nome, String cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    
}
