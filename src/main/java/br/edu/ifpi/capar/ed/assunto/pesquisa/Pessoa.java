package br.edu.ifpi.capar.ed.assunto.pesquisa;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author seijuh
 */
public class Pessoa {

    private int id;
    private String nome;
    private String email;
    private Date nascimento;
    private String endereco;
    private String cidade;

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + ", endereco=" + endereco + ", cidade=" + cidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.nascimento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        return true;
    }

    public Pessoa(int id, String nome, String email, Date nascimento, String endereco, String cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
