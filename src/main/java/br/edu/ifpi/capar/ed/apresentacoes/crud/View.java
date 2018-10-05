package br.edu.ifpi.capar.ed.apresentacoes.crud;

/**
 * 
 * @author Vitoria
 */
public class View {

    public static void main(String[] args) {
        Controle teste = new Controle();
        Alunos pos = new Alunos();

        pos = new Alunos();
        pos.idAluno = 0;
        pos.nome = "Vitória";
        pos.B1 = 9.0;
        pos.B2 = 8.0;
        pos.B3 = 10.0;
        pos.B4 = 7.0;
        teste.Inserir(pos);
        teste.listar();
        teste.mediaAluno();

        pos = new Alunos();
        pos.idAluno = 1;
        pos.nome = "Maria Clara";
        pos.B1 = 9.0;
        pos.B2 = 8.0;
        pos.B3 = 10.0;
        pos.B4 = 7.0;
        teste.Inserir(pos);
        teste.listar();
        teste.mediaAluno();

    }

}
