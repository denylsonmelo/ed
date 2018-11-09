package br.edu.ifpi.capar.ed.assunto.listas;

import java.util.Objects;

/**
 *
 * @author seijuh
 */
public class Materia {

    private final String nome;
    private final String cargaHoraria;

    @Override
    public String toString() {
        return "Materia{" + "nome=" + nome + ", cargaHoraria=" + cargaHoraria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.cargaHoraria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargaHoraria, other.cargaHoraria)) {
            return false;
        }
        return true;
    }
    
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
