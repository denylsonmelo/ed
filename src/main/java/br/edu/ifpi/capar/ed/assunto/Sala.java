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
        
        scanner.next();
        long inicio = System.currentTimeMillis();
        System.out.print("adicionando ");
        
        Aluno alunoGenerico;
        for (int i = 0; i < 35_000_000; i++) {
            alunoGenerico = new Aluno();
            alunoGenerico.nome = "algo " + i;
            lista.adicionar(alunoGenerico);
            //if((i % 50_000) == 0){
            //    System.out.print(".");
            //}
        }
        
        long fim = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("tempo de adicao: " + (fim - inicio));
        //System.out.println(lista);
        
        
        scanner.next();
        inicio = System.currentTimeMillis();
        System.out.print("buscando\n");
        System.out.println(lista.contem("evaldo"));
        fim = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("tempo de busca: " + (fim - inicio));
    }
}
