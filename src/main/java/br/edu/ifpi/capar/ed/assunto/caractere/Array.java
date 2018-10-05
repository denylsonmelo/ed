package br.edu.ifpi.capar.ed.assunto.caractere;

/**
 * 
 * @author Vitoria
 */
public class Array {

    public static void main(String[] args) {
        String nomeAluno[] = new String[9];
        nomeAluno[0] = "geyssy";
        nomeAluno[1] = "gilvan";
        nomeAluno[2] = "wendell";
        nomeAluno[3] = "vitoria";
        nomeAluno[4] = "fael";
        nomeAluno[5] = "claudemir";
        nomeAluno[6] = "jesse";
        nomeAluno[7] = "dany";
        nomeAluno[8] = "nicholas";

        StringBuilder sb = new StringBuilder(); //modifica uma cadeia de caracteres sem criar um novo objeto
        for (int i = 0; i < nomeAluno.length; i++) {
            String word = nomeAluno[i];
            word = word.substring(0, 1).toUpperCase() + word.substring(1);//o método substring retorna um subconjunto de uma string entre um inidce e outro,ou ate o final da string.
            sb.append("\n").append(word);//metodo da classe StrinBuilder,
            //serve pra adiconar algo a ultima linha no fim do StrinBuilder
        }

        System.out.println(sb.toString().replaceFirst(" ", ""));
        //toString é um método que retorna uma representação
        // string do objeto

        //replaceFirst é um método de substitição de caracteres que foram
        //apresentados na expressão regular do código
    }

}
