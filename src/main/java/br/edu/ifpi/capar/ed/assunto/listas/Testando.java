package br.edu.ifpi.capar.ed.assunto.listas;

/**
 *
 * @author seijuh
 */
public class Testando {
    public static void main(String[] args) {
        
        var materia1 = new Materia("Estrutura de Dados", "60");
        var materia2 = new Materia("Analise de Dados", "60");
        var materia3 = new Materia("Projeto de Banco", "60");
        
        Lista lista = new Lista();
        lista.adicionar(materia1);
        lista.adicionar(materia2);
        lista.adicionar(materia3);
        
        
        System.out.println(lista.totalElementos());
        System.out.println(lista.imprimirLista());
    }
}
