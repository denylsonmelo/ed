package br.edu.ifpi.capar.ed.assunto.objeto.sistema;

import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getIdadeMinima;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getNotaMaximaPermitida;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getNotaMinimaPermitida;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getQuantidadeMaximaNotas;

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
    private int quantNotasAtribuidas;

    public double[] visualizarNotas() {
        return this.notas;
    }

    public double media(){
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        
        return soma/ this.notas.length;
    }
    
    public void atribuirNota(double nota) throws IllegalArgumentException {
        if (quantNotasAtribuidas < getQuantidadeMaximaNotas()) {
            if (nota >= getNotaMinimaPermitida() && nota <= getNotaMaximaPermitida()) {
                this.notas[this.quantNotasAtribuidas] = nota;
                this.quantNotasAtribuidas++;
            } else {
                throw new IllegalArgumentException("Nota fora dos padroes de minima ou maxima, verifique");
            }
        }
    }

    public void mudarIdadePara(int novaIdade) {
        if (novaIdade < getIdadeMinima()) {
            throw new IllegalArgumentException("A idade minima permitida no sistema é " + getIdadeMinima());
        }
        this.idade = novaIdade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.notas = new double[getQuantidadeMaximaNotas()];
        this.mudarIdadePara(idade);
        this.quantNotasAtribuidas = 0;
    }

    public int getQuantidadeNotasAtribuidas() {
        return this.quantNotasAtribuidas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

}
