package com.br.zup;

/**
 * Classe de modelagem do sistema para a entidade Pessoa.
 *
 * @author Vinicius Raymundo
 * @version v0.0
 */
public class Pessoa {
    private String nome;
    private String numeroDeTelefone;

    public Pessoa(String nome, String numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNumeroDeTelefone() {

        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {

        this.numeroDeTelefone = numeroDeTelefone;
    }
}
