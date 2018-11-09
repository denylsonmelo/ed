package br.edu.ifpi.capar.ed.assunto.listas;

import static java.lang.System.out;
import java.util.List;

/**
 *
 * @author seijuh
 */
public class Testando {
    public static void main(String[] args) throws Exception {
        
        var materia0 = new Materia("Algoritmos 1", "60");
        var materia1 = new Materia("Fundamentos de info", "60");
        var materia2 = new Materia("Sistemas Operacionais", "60");
        var materia3 = new Materia("hardware basico", "60");
        var materia4 = new Materia("Seguranca de info", "60");
        var materia5 = new Materia("Algoritmos 2", "60");
        var materia6 = new Materia("Introducao a PWEB", "60");
        var materia7 = new Materia("Redes de Computadores", "60");
        var materia8 = new Materia("Projeto de Banco", "60");
        var materia9 = new Materia("Estrutura de dados", "60");
        var materia10 = new Materia("Programacao Orientada a Objetos", "60");
        
        Lista lista = new Lista();
        lista.adicionarNoFinal(materia0); // pilha : push
        lista.adicionarNoFinal(materia1);
        lista.adicionarNoFinal(materia2);
        lista.adicionarNoFinal(materia3);
        lista.adicionarNoFinal(materia4);
        lista.adicionarNoFinal(materia5);
        lista.adicionarNoFinal(materia6);
        lista.adicionarNoFinal(materia7);
        lista.adicionarNoFinal(materia8);
        lista.adicionarNoFinal(materia9);
        lista.adicionarNoFinal(materia10);
        
        //lista.removerFinal();  // pilha : pop


        
        System.out.println("Total: " + lista.totalElementos());
        
        List variavel = lista.pesquisarTodasOcorrencias("a");
        
        System.out.println(variavel.size());
        System.out.println(variavel);
//        lista.removerFinal();
//        System.out.println("Total: " + lista.totalElementos());
//        System.out.println(lista.pesquisar("tos"));
    }
}










