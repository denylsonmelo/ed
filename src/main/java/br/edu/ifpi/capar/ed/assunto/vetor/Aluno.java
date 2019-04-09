package br.edu.ifpi.capar.ed.assunto.vetor;

import java.util.Objects;

/**
 *
 * @author seijuh
 */
public class Aluno {
    public String nome;
    public short idade;
    public double nota1;
    public double nota2;
    public String materia;

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", nota1=" + nota1 + ", nota2=" + nota2 + ", materia=" + materia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nome);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}
