package br.edu.ifpi.capar.ed.apresentacoes.crud.multiarray;

/**
 *
 * @author Geyssyele
 */
public class MultArray {
    private static final int QUANT_ALUNOS = 5;
    private static final int QUANT_BIMESTRES = 4;
    private static final int QUANT_NOTAS_BIMESTRE = 2;

    public static void main(String[] args) {

        String nomeAlunos[] = new String[QUANT_ALUNOS];

        nomeAlunos[0] = "Geyssy";
        nomeAlunos[1] = "Vitoria";
        nomeAlunos[2] = "Wendell";
        nomeAlunos[3] = "Thaynar";
        nomeAlunos[4] = "Davi";

        double notasAlunos[][][] = new double[QUANT_ALUNOS][QUANT_BIMESTRES][QUANT_NOTAS_BIMESTRE];
        
        // Primeiro Aluno
        // 1 Bimestre
        notasAlunos[0][0][0] = 5;
        notasAlunos[0][0][1] = 7;
        // 2 Bimestre
        notasAlunos[0][1][0] = 8;
        notasAlunos[0][1][1] = 5;
        // 3 Bimestre
        notasAlunos[0][2][0] = 10;
        notasAlunos[0][2][1] = 9;
        // 4 Bimestre
        notasAlunos[0][3][0] = 6;
        notasAlunos[0][3][1] = 8;
        
        // Segundo Aluno
        // 1 Bimestre
        notasAlunos[1][0][0] = 10;
        notasAlunos[1][0][1] = 7;
        // 2 Bimestre
        notasAlunos[1][1][0] = 8;
        notasAlunos[1][1][1] = 0;
        // 3 Bimestre
        notasAlunos[1][2][0] = 5;
        notasAlunos[1][2][1] = 6;
        // 4 Bimestre
        notasAlunos[1][3][0] = 9;
        notasAlunos[1][3][1] = 4;
        
        // Terceiro Aluno
        // 1 Bimestre
        notasAlunos[2][0][0] = 5.5;
        notasAlunos[2][0][1] = 7;
        // 2 Bimestre
        notasAlunos[2][1][0] = 6;
        notasAlunos[2][1][1] = 8;
        // 23 Bimestre
        notasAlunos[2][2][0] = 6;
        notasAlunos[2][2][1] = 9;
        // 3 Bimestre
        notasAlunos[2][3][0] = 7;
        notasAlunos[2][3][1] = 8;
        
        // Quarto Aluno
        // 1 Bimestre
        notasAlunos[3][0][0] = 5;
        notasAlunos[3][0][1] = 7;
        // 2 Bimestre
        notasAlunos[3][1][0] = 8;
        notasAlunos[3][1][1] = 5;
        // 3 Bimestre
        notasAlunos[3][2][0] = 10;
        notasAlunos[3][2][1] = 9;
        // 4 Bimestre
        notasAlunos[3][3][0] = 6;
        notasAlunos[3][3][1] = 8;
        
        // Quinto Aluno
        // 1 Bimestre
        notasAlunos[4][0][0] = 5;
        notasAlunos[4][0][1] = 7;
        // 2 Bimestre
        notasAlunos[4][1][0] = 8;
        notasAlunos[4][1][1] = 5;
        // 3 Bimestre
        notasAlunos[4][2][0] = 10;
        notasAlunos[4][2][1] = 9;
        // 4 Bimestre
        notasAlunos[4][3][0] = 6;
        notasAlunos[4][3][1] = 8;
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
         
         //System.out.println("\n");
         imprimirLinha();
     }
    
    
    private static void imprimirMedias(String[] alunos, double[][] medias) {
        
        

        System.out.println("Nome\t Bimestre 1 \t Bimestre 2\t Bimestre 3\t Bimestre 4\t Média Final");
        imprimirLinha();

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.print(alunos[i] + "\t   ");

            for (int j = 0; j < QUANT_BIMESTRES; j++) {
                System.out.print(medias[i][j] + "\t\t");
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
        System.out.println("-------------------------------------------------------------------------------------");
}
    
}
