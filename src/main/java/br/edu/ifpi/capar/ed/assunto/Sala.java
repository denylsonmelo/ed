package br.edu.ifpi.capar.ed.assunto;

import br.edu.ifpi.capar.ed.assunto.lista.Lista;
import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Sala {

    public static void main(String[] args) {

        Lista lista = new Lista();
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

        lista.adicionar(fatima);
        lista.adicionar(jamile);
        lista.adicionar(manoel);
        
        System.out.println(lista);
        
        lista.remover(1);
        //lista.remover(1);
        
        System.out.println(lista);
    }
}
