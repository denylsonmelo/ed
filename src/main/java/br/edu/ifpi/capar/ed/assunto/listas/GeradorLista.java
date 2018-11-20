package br.edu.ifpi.capar.ed.assunto.listas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author seijuh
 */
public class GeradorLista {

    private static List<String> primeirosNomes = Arrays.asList(
            "Algoritmos", "Fundamentos", "hardware", 
            "Sistemas", "Seguranca", "introducao", 
            "redes", "projeto", "estrutura", 
            "programacao", "empreendedorismo", "topicos", 
            "arquitetura", "ingles", "antropologia", 
            "metodologia", "analise", "fisica", 
            "eletromecanica", "calculo", "edificacoes", 
            "direito", "medicina", "biologia", "interface", "desenho", "banco"
    );
    
    private static List<String> segundosNomes = Arrays.asList(
            "informatica", "basico", "operacionais",
            "informacao", "web", "mobile", "embarcado",
            "computadores", "supervisionado", "nao-supervisionado",
            "dados", "especiais", "diferencial"
    );
    
    
    private static List<String> valores = Arrays.asList(
            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
    );
    
    public static Lista gerar(int total){
        System.out.println("   >>>    iniciando geracao de lista");
        long inicio = System.currentTimeMillis();
        Lista lista = new Lista();
        for (int i = 1; i <= total; i++) {
            System.out.print(" - " + i + " ->  ");
            lista.adicionarNoFinal(gerarMateria());
        }
        long fim = System.currentTimeMillis();
        System.out.println("   >>>    terminando geracao de lista. >> " + (fim-inicio) + " milisegundos");
        return lista;
    }
    
    private static Materia gerarMateria(){
        Random random = new Random();
        
        int valorAleatorio = random.nextInt(primeirosNomes.size());
        String nome = primeirosNomes.get(valorAleatorio);
    
        valorAleatorio = random.nextInt(segundosNomes.size());
        nome = nome + " " + segundosNomes.get(valorAleatorio);
        
        valorAleatorio = random.nextInt(valores.size());
        nome = nome + " " + valores.get(valorAleatorio);
        
        int cargaHoraria = random.nextInt(180);
        Materia materia = new Materia(nome, Integer.toString(cargaHoraria));
        
        System.out.println(materia);
        
        return materia;
    }
    
}
