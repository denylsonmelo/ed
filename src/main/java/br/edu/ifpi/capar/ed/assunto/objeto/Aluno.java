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
    private double[] notas;
    private static final int IDADE_MINIMA = 15;

    public void mudarPara(int idade){
        if(idade <= IDADE_MINIMA)
            throw new IllegalArgumentException("A idade minima permitida no sistema é " + IDADE_MINIMA);
        this.idade = idade;
    }
    
    public Aluno() {
        this.nomeDaClasse = "nome não foi informado";
    }

    public Aluno(String nomeRecebido, int idade) {
        this.nomeDaClasse = nomeRecebido;

        this.mudarPara(idade);
    }

    public String getNome() {
        return this.nomeDaClasse;
    }

    public int getIdade() {
        return idade;
    }

    public static int getIdadeMinima(){
        return IDADE_MINIMA;
    }
    
}
