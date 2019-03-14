package br.edu.ifpi.capar.ed.uri;

import java.util.Scanner;

/**
 *
 * @author seijuh
 */
public class Q1045 {

    public static void main(String[] args) {

        double ladoA, ladoB, ladoC, maior;
        Scanner scanner = new Scanner(System.in);

        ladoA = scanner.nextDouble();
        ladoB = scanner.nextDouble();
        ladoC = scanner.nextDouble();

        //problema 1
        maior = (ladoA + ladoB + Math.abs(ladoA - ladoB)) / 2;
        maior = (maior + ladoC + Math.abs(maior - ladoC)) / 2;

        

        //problema 2
        if (ladoA >= (ladoB + ladoC)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (Math.pow(ladoA, 2) == (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (Math.pow(ladoA, 2) > (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (Math.pow(ladoA, 2) < (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((ladoA == ladoB && ladoA != ladoC)
                || (ladoB == ladoC && ladoA != ladoC)
                || (ladoC == ladoA && ladoB != ladoC)) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}
