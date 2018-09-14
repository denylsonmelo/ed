package br.edu.ifpi.capar.ed.assunto.array;

/**
 *
 * @author seijuh
 */
public class ArrayMultidimensional {

    private static final int QUANT_ALUNOS = 5;
    private static final int QUANT_BIMESTRES = 4;
    private static final int QUANT_NOTAS_BIMESTRE = 2;

    public static void main(String[] args) {

        String nomeAlunos[] = new String[QUANT_ALUNOS];

        nomeAlunos[0] = "geyssy";
        nomeAlunos[1] = "vitoria";
        nomeAlunos[2] = "wendell";
        nomeAlunos[3] = "thaynnar";
        nomeAlunos[4] = "davi";

        double notasAlunos[][][] = new double[QUANT_ALUNOS][QUANT_BIMESTRES][QUANT_NOTAS_BIMESTRE];

        notasAlunos[0][0][0] = 5;
        notasAlunos[0][0][1] = 7;
        notasAlunos[0][1][0] = 8;
        notasAlunos[0][1][1] = 5;
        notasAlunos[0][2][1] = 10;
        
        notasAlunos[1][0][0] = 7;
        notasAlunos[1][0][1] = 1;
        notasAlunos[1][1][0] = 6;
        notasAlunos[1][1][1] = 9;
        
        notasAlunos[2][0][0] = 8;
        notasAlunos[2][0][1] = 2;
        notasAlunos[2][1][0] = 6;
        notasAlunos[2][1][1] = 7;
        
        notasAlunos[3][0][0] = 10;
        notasAlunos[3][0][1] = 8;
        notasAlunos[3][1][0] = 2;
        notasAlunos[3][1][1] = 9.5;
        
        notasAlunos[4][0][0] = 0;
        notasAlunos[4][0][1] = 5;
        notasAlunos[4][1][0] = 8;
        notasAlunos[4][1][1] = 3.5;
                                        //      5               3
        double mediaAlunos[][] = new double[QUANT_ALUNOS][QUANT_BIMESTRES];

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            for (int j = 0; j < QUANT_BIMESTRES; j++) {
                mediaAlunos[i][j] = calcularMedia(notasAlunos[i][j]);
            }
        }

        imprimirMedias(nomeAlunos, mediaAlunos);
        //imprimirMediaSala(mediaAlunos);
    }

     private static void imprimirMediaSala(double[][] medias) {
         imprimirLinha();
         
         System.out.print("Total:" + "\t   ");
         
         for (int i = 0; i < QUANT_ALUNOS; i++) {
            // medias[i][0]
            // medias[i][1]
         }
         
         System.out.println("\n");
         imprimirLinha();
     }
    
    
    private static void imprimirMedias(String[] alunos, double[][] medias) {

        System.out.println("Nome\t Bimestre 1 \t Bimestre 2\t Bimestre 3\t Média Final");
        imprimirLinha();

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.print(alunos[i] + "\t   ");

            for (int j = 0; j < QUANT_BIMESTRES; j++) {
                System.out.print(medias[i][j] + "\t\t   ");
            }
            System.out.print(calcularMedia(medias[i]));
            System.out.println("");
        }
    }

    private static double calcularMedia(double... valores) {
        double media, soma = 0.0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        media = soma / valores.length;

        return media;
    }

    private static void imprimirLinha(){
        System.out.println("--------------------------------------------------------------------------");
    }
}
