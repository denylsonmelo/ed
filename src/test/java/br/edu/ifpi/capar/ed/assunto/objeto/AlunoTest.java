package br.edu.ifpi.capar.ed.assunto.objeto;

import static br.edu.ifpi.capar.ed.assunto.objeto.Aluno.getIdadeMinima;
import static br.edu.ifpi.capar.ed.assunto.objeto.Aluno.getNotaMinimaPermitida;
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
    public void preparacoesIniciais(){
        idade = getIdadeMinima() + 3;
        aluno = new Aluno("Gustavo", idade);
    }
    
    @Test
    public void deveAceitarNotaMaiorQueAMinima(){
        this.aluno.atribuirNota(8);
        
        assertEquals(8, this.aluno.visualizarNotas()[0], 0.1);
    }
    
    @Test
    public void deveAceitarNotaIgualComAMinima(){
        this.aluno.atribuirNota(getNotaMinimaPermitida());
        
        assertEquals(getNotaMinimaPermitida(), this.aluno.visualizarNotas()[0], 0.1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarNotaMenorQueAMinima(){
        this.aluno.atribuirNota(getNotaMinimaPermitida()-1);
    }
    
    @Test
    public void deveAceitarAlunoComAIdadeMinima(){
        var aluno = new Aluno("gustavo", getIdadeMinima());
        
        assertEquals(getIdadeMinima(), aluno.getIdade());        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarMudancaIdadeAbaixoDaMinima(){
        aluno.mudarIdadePara(getIdadeMinima()-1);
    }
    
    @Test
    public void deveAceitarAlunoComMaisQueIdadeMinima(){
        assertEquals(idade, aluno.getIdade());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarAlunoComMenosQueIdadeMinima(){
        var aluno = new Aluno("Gustavo", getIdadeMinima()-2);
    }
    
    
    @Test
    public void deveTerONomePassadoNoConstrutorComParametros() {
        assertEquals("Gustavo", aluno.getNome());

    }

}
