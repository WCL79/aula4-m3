package com.br.zup;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de gerenciamento da lista.
 * @author Vinicius Ferreira
 */
public class ListaDeContatos {
    private List<Pessoa> pessoas;

    public ListaDeContatos(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){

        pessoas.add(pessoa);
    }
    public void adicionarPessoaPJ(Pessoa pessoaPj){

        pessoas.add(pessoaPj);
    }

    /**
     * Metodo que busca uma objeto do tipo PESSOA na lista pessoas atribuida na classe
     * @param nome
     * @return Pessoa
     * @throws RuntimeException
     */
    public Pessoa buscarPessoa(String nome){
        for (Pessoa pessoa : pessoas){
            if (pessoa.getNome().equalsIgnoreCase(nome)){
                return pessoa;
            }
        }
        throw new RuntimeException("Pessoa não encontrada");
    }
}
