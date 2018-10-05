package br.edu.ifpi.capar.ed.apresentacoes.crud;

/**
 * 
 * @author Vitoria
 */
public class Controle {

    Alunos[] alunos = new Alunos[10];
    int pos = 0;

    void Inserir(Alunos novo) {
        if (pos < alunos.length) {
            alunos[pos] = novo;
            pos++;
        } else {
            System.out.println("Tamanho do array ultrapassado");
        }
    }

    public void mediaAluno() {
        double media = 0;
        for (int i = 0; i < pos; i++) {
            media = alunos[i].B1 + alunos[i].B2 + alunos[i].B3 + alunos[i].B4;
            media = media / 4;
        }
        System.out.println(media);
    }

    public void listar() {
        for (int i = 0; i < pos; i++) {
            if (alunos[i] != null) {
                System.out.println("Nome:\t" + alunos[i].nome + "\nB1:\t" + alunos[i].B1 + "\nB2:\t" + alunos[i].B2 + "\nB3:\t" + alunos[i].B3 + "\nB4:\t" + alunos[i].B4 + "\nMédia:");
            }
        }
    }

    int pesquisar(int idAluno) {
        int local = -1;
        for (int i = 0; i < pos; i++) {
            if (alunos[i].idAluno == idAluno) {
                local = i;
            }
        }
        return local;
    }

    void remover(int id) {
        int local = pesquisar(id);
        if (local != -1) {
            for (int i = local; i < pos; i++) {
                alunos[i] = alunos[i + 1];
            }
            pos--;
            System.out.println("Excluido com sucesso");
        }
    }

}
