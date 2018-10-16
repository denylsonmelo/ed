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
        
        
        
//        materia1.definirAnterior(null);
//        materia1.definirProximo(materia2);
//        materia2.definirAnterior(materia1);
//        materia2.definirProximo(materia3);
//        materia3.definirAnterior(materia2);
//        materia3.definirProximo(null);
        
        
        var materia = materia1;
        for (int i = 0; i < 6; i++) {
            System.out.println(materia.getNome());
            if(materia.irParaProximo() == null)
                materia = materia.irParaAnterior();
            else
                materia = materia.irParaProximo();
        }
        
        
        
//        
//        Materia[] materias = {materia1, materia2, materia3};
//        
//        for (int i = 0; i < materias.length; i++) {
//            System.out.println(materias[i].getNome());
//        }
        
    }
}
