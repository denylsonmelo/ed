package br.edu.ifpi.capar.ed.assunto.objeto.sistema;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author seijuh
 */
public class Configuracao {

    private static final int IDADE_MINIMA = 15;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;
    private static final int QUANT_MAX_NOTAS = 4;

    public static double arredondar(double valor, String formatoCasas){
        DecimalFormat formato = new DecimalFormat(formatoCasas);
        formato.setRoundingMode(RoundingMode.DOWN);
        String formatoString = formato.format(valor);
        formatoString = formatoString.replace(',', '.');
        return Double.parseDouble(formatoString);
    }
    
    public static double arredondarDuasCasas(double valor) {
        return arredondar(valor, "0.00");
    }
    
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
