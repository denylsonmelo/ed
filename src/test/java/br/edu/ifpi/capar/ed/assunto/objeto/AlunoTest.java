package br.edu.ifpi.capar.ed.assunto.objeto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author seijuh
 */
public class AlunoTest {

    public Aluno aluno;
    
    @Before
    public void preparacoesIniciais(){
        aluno = new Aluno("Gustavo", Aluno.getIdadeMinima() + 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarMudancaIdadeAbaixoDaMinima(){
        aluno.mudarPara(Aluno.getIdadeMinima()-1);
    }
    
    @Test
    public void deveAceitarAlunoComMaisQueIdadeMinima(){
        Assert.assertEquals(18, aluno.getIdade());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void deveRejeitarAlunoComMenosQueIdadeMinima(){
        Aluno aluno = new Aluno("Gustavo", 14);
        //Assert.fail("teste ainda nao implementado");
    }
    
    
    @Test
    public void deveTerONomePassadoNoConstrutorComParametros() {
        Assert.assertEquals("Gustavo", aluno.getNome());

    }

    @Test
    public void deveTerUmTextoGenericoNoConstrutorSemParametros() {
        Aluno aluno1 = new Aluno(); // construtor

        Assert.assertEquals("nome não foi informado", aluno1.getNome());

    }
}
