package br.edu.ifpi.capar.ed.assunto;

import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class FilaDosMaisAltos {

    public static void main(String[] args) {
        int quantidadeDePessoas = 5;
        
        float alturaMaisAlta;
        Scanner scanner = new Scanner(System.in);

        float[] alturas = new float[quantidadeDePessoas];
       
        int iterador = 0;
        while (iterador < alturas.length) {
            System.out.println(" antes >>  " + iterador);
            alturas[iterador++] = scanner.nextFloat();
            System.out.println(" depois >>  " + iterador);
        }
        
        
        for (int i = 0; i < alturas.length; i++) {
            System.out.println(i + " - " + alturas[i]);
        }
        
/*
        alturaMaisAlta = alturas[0];

        iterador = 1;
        while(iterador < quantidadeDePessoas){
            System.out.println(" iterador >>  " + iterador);
            if (alturas[iterador] > alturaMaisAlta) {
                alturaMaisAlta = alturas[iterador];
            }
            iterador++;
        }
        
        System.out.println("o mais alto eh " + alturaMaisAlta);
*/
    }

}
