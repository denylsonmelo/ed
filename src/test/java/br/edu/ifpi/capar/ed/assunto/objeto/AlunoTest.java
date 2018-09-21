package br.edu.ifpi.capar.ed.assunto.objeto;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author seijuh
 */
public class AlunoTest {

    @Test
    public void deveTerONomePassadoNoConstrutorComParametros() {
        Aluno aluno1 = new Aluno("gustavo"); // construtor

        Assert.assertEquals("gustavo", aluno1.getNome());

    }

    @Test
    public void deveTerUmTextoGenericoNoConstrutorSemParametros() {
        Aluno aluno1 = new Aluno(); // construtor

        Assert.assertEquals("nome não foi informado", aluno1.getNome());

    }
}
