package br.edu.ifpi.capar.ed;

/**
 *
 * @author seijuh
 */
public class ArrayMultidimensional {

    private static final int QUANT_ALUNOS = 5;
    private static final int QUANT_NOTAS = 2;

    public static void main(String[] args) {

        String nomeAlunos[] = new String[QUANT_ALUNOS];

        nomeAlunos[0] = "geyssy";
        nomeAlunos[1] = "vitoria";
        nomeAlunos[2] = "wendell";
        nomeAlunos[3] = "thaynnar";
        nomeAlunos[4] = "davi";

        double notasAlunos[][] = new double[QUANT_ALUNOS][QUANT_NOTAS];

        notasAlunos[0][0] = 5;
        notasAlunos[0][1] = 7;
        notasAlunos[1][0] = 7;
        notasAlunos[1][1] = 6;
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 6;
        notasAlunos[3][0] = 10;
        notasAlunos[3][1] = 2;
        notasAlunos[4][0] = 0;
        notasAlunos[4][1] = 8;


        double mediaAlunos[][] = new double[QUANT_ALUNOS][1];
        
        int soma;
        for (int i = 0; i < QUANT_ALUNOS; i++) {
            
            soma = 0;
            
            for (int j = 0; j < QUANT_NOTAS; j++) {

                soma += notasAlunos[i][j];
                
            }
            
            mediaAlunos[i][0] = (double) soma/QUANT_NOTAS;
        }

        
        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.println(nomeAlunos[i] + ": " + mediaAlunos[i][0]);
        }
        
    }

}
