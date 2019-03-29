package br.edu.ifpi.capar.ed.assunto.vetor;

import java.util.

/**
 *
 * @author seijuh
 */
public class Sala {

    public static void main(String[] args) {

        Vetor vetor = new Vetor();
        
        Aluno manoel = new Aluno();
        manoel.nome = "manoel";
        manoel.idade = 19;
        manoel.materia = "ingles";
        
        Aluno jamile = new Aluno();
        jamile.nome = "jamile";
        jamile.idade = 19;
        jamile.materia = "ingles";
        
        
        vetor.adicionar(manoel);
        vetor.adicionar(jamile);
        
        
        System.out.println(vetor);
        
        
        System.out.println("Quantidade de alunos no array: " + vetor.tamanho());
        
        
    }
}
