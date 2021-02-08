package com.br.zup;
/**
 * Classe de gerenciamento da lista.
 * @author Vinicius Ferreira
 * Apesar do @author ser Vinicius Ferreira, essa classe teve alteracao cujo metodo toString
 */

public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String numeroDeTelefone, String CNPJ, String nomeFantasia) {
        super(nome, numeroDeTelefone);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        return  "Nome: " + super.getNome() +"\n"+
                "Telefone: "+ super.getNumeroDeTelefone()+ "\n"+
                "CNPJ :'" + CNPJ +"\n"+
                "Nome fantasia: "  + nomeFantasia;
   }
}
