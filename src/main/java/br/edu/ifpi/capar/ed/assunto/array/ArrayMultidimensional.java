package br.edu.ifpi.capar.ed.assunto.array;

/**
 *
 * @author seijuh
 */
public class ArrayMultidimensional {

    private static final int QUANT_ALUNOS = 5;
    private static final int QUANT_NOTAS = 4;
    private static final int QUANT_MEDIAS = 2;
    private static final int QUANT_NOTAS_MEDIA = 2;

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
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 5;
        notasAlunos[1][0] = 7;
        notasAlunos[1][1] = 6;
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 6;
        notasAlunos[3][0] = 10;
        notasAlunos[3][1] = 2;
        notasAlunos[4][0] = 0;
        notasAlunos[4][1] = 8;
        //      5               2
        double mediaAlunos[][] = new double[QUANT_ALUNOS][QUANT_MEDIAS];

        double notasProvisorias[][] = new double[QUANT_NOTAS_MEDIA][QUANT_NOTAS_MEDIA];
        for (int i = 0; i < QUANT_ALUNOS; i++) {
            for (int j = 0; j < QUANT_NOTAS_MEDIA; j++) {
                for (int k = 0; k < QUANT_NOTAS; k++) {

                    if( k >= 3)
                    
                    notasProvisorias[i][j] = notasAlunos[i][k];
                }

                mediaAlunos[i][j] = calcularMedia(notasProvisorias[j]);
            }

        }

        imprimirMedias(nomeAlunos, mediaAlunos);
    }

    private static void imprimirMedias(String[] alunos, double[][] medias) {

        System.out.println("Nome\t Média 1 \t Média 2\t\t Média Final");

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.print(alunos[i] + "\t   ");

            for (int j = 0; j < QUANT_MEDIAS; j++) {
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

}
