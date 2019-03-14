package br.edu.ifpi.capar.ed.uri;

import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Q1013 {
    public static void main(String[] args) {
        
        int maior, numero1, numero2, numero3;
        
        Scanner scanner = new Scanner(System.in);
        
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        numero3 = scanner.nextInt();
        
        
        //formula
        maior = (numero1 + numero2 + Math.abs(numero1 - numero2))/2;
        maior = (maior + numero3 + Math.abs(maior - numero3))/2;
        
        
        
        System.out.println(maior + " eh o maior");
        
        
        
        
    }
    
}
