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
    private double[] notas;
    private static final int IDADE_MINIMA = 15;
    private static final double NOTA_MINIMA = 0.0;
    private static final int QUANT_MAX_NOTAS = 4;

    public double[] visualizarNotas(){
        return this.notas;
    }
    
    public void atribuirNota(double nota){
        if (nota >= NOTA_MINIMA) 
            this.notas[0] = nota;
        else
            throw new IllegalArgumentException("Nota menor que a mínima permitida");
    }
    
    
    public void mudarIdadePara(int novaIdade){
        if(novaIdade < IDADE_MINIMA)
            throw new IllegalArgumentException("A idade minima permitida no sistema é " + IDADE_MINIMA);
        this.idade = novaIdade;
    }
    
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.notas = new double[QUANT_MAX_NOTAS];
        this.mudarIdadePara(idade);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getIdadeMinima(){
        return IDADE_MINIMA;
    }
    
    public static double getNotaMinimaPermitida(){
        return NOTA_MINIMA;
    }
    
}
