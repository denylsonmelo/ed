package br.edu.ifpi.capar.ed.assunto.objeto.sistema;

import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getIdadeMinima;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getNotaMaximaPermitida;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getNotaMinimaPermitida;
import static br.edu.ifpi.capar.ed.assunto.objeto.sistema.Configuracao.getQuantidadeMaximaNotas;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author seijuh
 */
public class AlunoTest {

    public Aluno aluno;
    public int idade;

    @Before
    public void preparacoesIniciais() {
        idade = getIdadeMinima() + 3;
        aluno = new Aluno("Gustavo", idade);
    }

    @Test
    public void devePermitirAtribuirAQuartaNota(){
        this.aluno.atribuirQuartaNota(5.265);
        
        assertEquals(5.26, this.aluno.visualizarNotas()[3], 0.0001);
    }
    

    @Test
    public void devePermitirAtribuirTerceiraNota(){
        this.aluno.atribuirTerceiraNota(5.265);
        
        assertEquals(5.26, this.aluno.visualizarNotas()[2], 0.0001);
    }
    

    @Test
    public void devePermitirAtribuirASegundaNota(){
        this.aluno.atribuirSegundaNota(5.265);
        
        assertEquals(5.26, this.aluno.visualizarNotas()[1], 0.0001);
    }
    
    @Test
    public void devePermitirAtribuirAPrimeiraNota(){
        this.aluno.atribuirPrimeiraNota(5.265);
        
        assertEquals(5.26, this.aluno.visualizarNotas()[0], 0.0001);
    }
    
    @Test
    public void deveArredondarMediaComMenos2CasasDecimais(){
        this.aluno.atribuirNota(5);
        this.aluno.atribuirNota(7);
        this.aluno.atribuirNota(8);
        this.aluno.atribuirNota(5.2);
        
        assertEquals(6.3, this.aluno.media(), 0.0001);
    }
    
    @Test
    public void naoDeveArredondarMediaCom2CasasDecimais(){
        this.aluno.atribuirNota(5);
        this.aluno.atribuirNota(7);
        this.aluno.atribuirNota(8);
        this.aluno.atribuirNota(5.48);
        
        assertEquals(6.37, this.aluno.media(), 0.0001);
    }
    
    @Test
    public void deveArredondarMediaComMais3CasasDecimais(){
        this.aluno.atribuirNota(5);
        this.aluno.atribuirNota(7);
        this.aluno.atribuirNota(8);
        this.aluno.atribuirNota(5.5);
        
        assertEquals(6.37, this.aluno.media(), 0.0001);
    }
    
    @Test
    public void naoDeveArredondarNotaComMenos2CasasDecimais(){
        this.aluno.atribuirNota(5.4);
        
        assertEquals(5.40, this.aluno.visualizarNotas()[0], 0.0001);
    }
    
    @Test
    public void naoDeveArredondarNotaCom2CasasDecimais(){
        this.aluno.atribuirNota(5.41);
        
        assertEquals(5.41, this.aluno.visualizarNotas()[0], 0.0001);
    }
    
    @Test
    public void deveArredondarNotaComMaisDe3CasasDecimais(){
        this.aluno.atribuirNota(5.426);
        
        assertEquals(5.42, this.aluno.visualizarNotas()[0], 0.0001);
    }
    
    @Test()
    public void deveCalcularAMediaCorretamenteMesmoComNotasFaltando() {
        this.aluno.atribuirNota(8);

        assertEquals(2, this.aluno.media(), 0.01);
    }
    
    @Test()
    public void deveCalcularAMediaCorretamente() {
        this.aluno.atribuirNota(5);
        this.aluno.atribuirNota(7);
        this.aluno.atribuirNota(8);
        this.aluno.atribuirNota(5);

        assertEquals(6.25, this.aluno.media(), 0.01);
    }

    @Test()
    public void deveGarantirQueOAlunoSoTenhaQuantidadeMaximaNotasPermitida() {
        for (int i = 0; i < getQuantidadeMaximaNotas(); i++) {
            this.aluno.atribuirNota(3 + i);
        }
        this.aluno.atribuirNota(5);
        this.aluno.atribuirNota(5);

        assertEquals(4, aluno.getQuantidadeNotasAtribuidas());
        for (int i = 0; i < getQuantidadeMaximaNotas(); i++) {
            assertEquals(i + 3, aluno.visualizarNotas()[i], 0.1);
        }
    }

    @Test()
    public void notasNaoAtribuidasDevemTerValorMinimo() {
        this.aluno.atribuirNota(5);

        assertEquals(1, aluno.getQuantidadeNotasAtribuidas());
        assertEquals(5, aluno.visualizarNotas()[0], 0.1);
        for (int i = 1; i < getQuantidadeMaximaNotas(); i++) {
            assertEquals(getNotaMinimaPermitida(), aluno.visualizarNotas()[i], 0.1);
        }
    }

    @Test()
    public void deveTerAQuantidadeDeNotasAtribuidas() {

        double[] notas = new double[4];
        notas[0] = 7;
        notas[1] = 11;
        notas[2] = 8;
        notas[3] = -1;

        for (int i = 0; i < 4; i++) {
            try {
                this.aluno.atribuirNota(notas[i]);
            } catch (IllegalArgumentException argumentException) {
                System.out.println("fazer nada");
            }
        }

        assertEquals(2, aluno.getQuantidadeNotasAtribuidas());
        assertEquals(7, aluno.visualizarNotas()[0], 0.1);
        assertEquals(8, aluno.visualizarNotas()[1], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarNotaMaiorQueAMaxima() {
        this.aluno.atribuirNota(getNotaMaximaPermitida() + 1);
    }

    @Test
    public void deveAceitarNotaIgualComAMaxima() {
        this.aluno.atribuirNota(getNotaMaximaPermitida());

        assertEquals(getNotaMaximaPermitida(), this.aluno.visualizarNotas()[0], 0.1);
    }

    @Test()
    public void deveAceitarNotaMenorQueAMaxima() {
        this.aluno.atribuirNota(8);
        assertEquals(8, this.aluno.visualizarNotas()[0], 0.1);
    }

    @Test
    public void deveAceitarNotaMaiorQueAMinima() {
        this.aluno.atribuirNota(8);

        assertEquals(8, this.aluno.visualizarNotas()[0], 0.1);
    }

    @Test
    public void deveAceitarNotaIgualComAMinima() {
        this.aluno.atribuirNota(getNotaMinimaPermitida());

        assertEquals(getNotaMinimaPermitida(), this.aluno.visualizarNotas()[0], 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarNotaMenorQueAMinima() {
        this.aluno.atribuirNota(getNotaMinimaPermitida() - 1);
    }

    @Test
    public void deveAceitarAlunoComAIdadeMinima() {
        var aluno = new Aluno("gustavo", getIdadeMinima());

        assertEquals(getIdadeMinima(), aluno.getIdade());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarMudancaIdadeAbaixoDaMinima() {
        aluno.mudarIdadePara(getIdadeMinima() - 1);
    }

    @Test
    public void deveAceitarAlunoComMaisQueIdadeMinima() {
        assertEquals(idade, aluno.getIdade());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarAlunoComMenosQueIdadeMinima() {
        var aluno = new Aluno("Gustavo", getIdadeMinima() - 2);
    }

    @Test
    public void deveTerONomePassadoNoConstrutorComParametros() {
        assertEquals("Gustavo", aluno.getNome());

    }

}
