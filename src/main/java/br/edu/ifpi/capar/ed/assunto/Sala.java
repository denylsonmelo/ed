package br.edu.ifpi.capar.ed.assunto;

import br.edu.ifpi.capar.ed.assunto.fila.Fila;
import br.edu.ifpi.capar.ed.assunto.lista.Lista;
import br.edu.ifpi.capar.ed.assunto.pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Sala {

    public static void main(String[] args) throws Exception {

        Fila fila = new Fila();
        
        
        //  pai --> filho : erro
        // filho --> pai : funciona, metodo do filho, o cara do new
        
        
        Scanner scanner = new Scanner(System.in);

        Aluno manoel = new Aluno();
        manoel.nome = "manoel";
        manoel.idade = 19;
        manoel.materia = "ingles";

        Aluno jamile = new Aluno();
        jamile.nome = "jamile";
        jamile.idade = 19;
        jamile.materia = "ingles";

        Aluno fatima = new Aluno();
        fatima.nome = "fatima";
        fatima.idade = 19;
        fatima.materia = "ingles";

        fila.adicionar(fatima);
        fila.adicionar(jamile);
        fila.adicionar(manoel);
        System.out.println(fila);
        fila.remover();
        fila.remover();
        System.out.println(fila);
        
    }
}
