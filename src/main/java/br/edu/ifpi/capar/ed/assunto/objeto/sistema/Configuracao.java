package br.edu.ifpi.capar.ed.assunto.objeto.sistema;

/**
 *
 * @author seijuh
 */
public class Configuracao {

    private static final int IDADE_MINIMA = 15;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final int QUANT_MAX_NOTAS = 4;

    public static int getQuantidadeMaximaNotas() {
        return QUANT_MAX_NOTAS;
    }

    public static int getIdadeMinima() {
        return IDADE_MINIMA;
    }

    public static double getNotaMinimaPermitida() {
        return NOTA_MINIMA;
    }

    public static double getNotaMaximaPermitida() {
        return NOTA_MAXIMA;
    }

}
