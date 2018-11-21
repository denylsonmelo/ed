package br.edu.ifpi.capar.ed.assunto.pesquisa;

import java.util.Date;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 *
 * @author seijuh
 */
public class TestandoGeracaoAutomatica {

    public static void main(String[] args) {

        DataFactory df = new DataFactory();

        for (int i = 0; i < 5_000_000; i++) {
            
            int id = df.getNumberUpTo(200_000_000);
            String nome = df.getName();
            String email = df.getEmailAddress();
            Date nascimento = df.getBirthDate();
            String endereco = df.getAddress();
            String cidade = df.getCity();
            
            Pessoa pessoa = new Pessoa(id, nome, email, nascimento, endereco, cidade);
            System.out.println(pessoa);
            System.out.println("--------------------------------------------------");
        }
    }
}
