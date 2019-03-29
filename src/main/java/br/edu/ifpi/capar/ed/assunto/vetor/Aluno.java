package br.edu.ifpi.capar.ed.assunto.vetor;

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
}
