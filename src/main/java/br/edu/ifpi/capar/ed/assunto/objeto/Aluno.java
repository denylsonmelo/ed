package br.edu.ifpi.capar.ed.assunto.objeto;

/**
 *
 * @author seijuh
 */
public class Aluno {

    private long matricula;
    private String nome;
    private int idade;
    private String disciplina;
    private double nota;

    public Aluno(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

}
