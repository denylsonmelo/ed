package br.edu.ifpi.capar.ed.assunto.objeto;

/**
 *
 * @author seijuh
 */
public class Aluno {

    private long matricula;
    private String nomeDaClasse;
    private int idade;
    private String disciplina;
    private double nota;

    public Aluno(){
        this.nomeDaClasse = "nome não foi informado";
    }
    
    public Aluno(String nomeRecebido){
        this.nomeDaClasse = nomeRecebido;
    }
    
    public String getNome() {
        return this.nomeDaClasse;
    }

}
