package br.edu.ifpi.capar.ed;

/**
 *
 * @author seijuh
 */
public class Array {

    public static void main(String[] args) {

        String nomeAluno1 = "iuri";
        String nomeAluno2 = "thaynnar";
        String nomeAluno3 = "breno";
        String nomeAluno4 = "vitoria";
        String nomeAluno5 = "wendell";
        String nomeAluno6 = "milena";
        String nomeAluno7 = "gustavo";

        System.out.println(nomeAluno1 + "," + nomeAluno2 + "," + nomeAluno3);

        /*
        String nomeAluno[];
        nomeAluno = new String[31];
         */
        String nomeAlunos[] = new String[31];

        nomeAlunos[0] = "geyssy";
        nomeAlunos[1] = "vitoria";
        nomeAlunos[2] = "wendell";
        nomeAlunos[3] = "thaynnar";
        nomeAlunos[4] = "davi";

        String variavel = "nome qualquer";
        
        System.out.println(new String(variavel.toCharArray()));

        /*
        for (int indice = 0; indice < nomeAlunos.length; indice++) {
            if( nomeAlunos[indice] != null )
                if(indice == 0)
                    System.out.print(nomeAlunos[indice].charAt(indice));
                else
                    System.out.print(", " + nomeAlunos[indice].toUpperCase());
        }
         */
    }

}
