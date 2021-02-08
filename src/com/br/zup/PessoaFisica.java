package com.br.zup;

public class PessoaFisica extends Pessoa {
    private String CPF;
    private int idade;

    public PessoaFisica(String nome, String numeroDeTelefone, String CPF, int idade) {
        super(nome, numeroDeTelefone);
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getCPF() {

        return CPF;
    }

    public void setCPF(String CPF) {

        this.CPF = CPF;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: "+ super.getNome() +"\n"+
                "Telefone: "+ super.getNumeroDeTelefone()+ "\n"+
                "CPF: " + CPF + "\n" +
                "Idade: " + idade;
    }
}
