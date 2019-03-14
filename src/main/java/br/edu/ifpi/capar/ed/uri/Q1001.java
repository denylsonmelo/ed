package br.edu.ifpi.capar.ed.uri;

import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Q1001 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int a =0 , b =0, soma = 0;
        a = b = soma = 0;
        
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        
        soma = a + b ;
        
        System.out.println("X = " +  soma);
    }
}
