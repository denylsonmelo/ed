package br.edu.ifpi.capar.ed.assunto;

import br.edu.ifpi.capar.ed.assunto.lista.Lista;
import br.edu.ifpi.capar.ed.assunto.pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Sala {

    public static void main(String[] args) throws Exception {

        Pilha pilha = new Pilha();
        
        
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

        
        pilha.push(fatima);
        pilha.push(jamile);
        pilha.push(manoel);
        Aluno alunoRecuperado = pilha.pop();
        
        
        //System.out.println(nomeDaVariavel.estahVazia());
        
        System.out.println(pilha);
        System.out.println("-----------------");
        System.out.println(alunoRecuperado.nome);
        alunoRecuperado = pilha.pop();
        System.out.println(alunoRecuperado.nome);
        
    }
}
