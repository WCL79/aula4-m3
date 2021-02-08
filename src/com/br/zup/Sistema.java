package com.br.zup;

import java.util.Scanner;

/**
 * Classe para rodar o sistema e executar os modulos
 * @author Vinicius Ferreira
 */
public class Sistema {
    private static ListaDeContatos contatos = new ListaDeContatos();

    public static String readLine(){
        return new Scanner(System.in).nextLine();
    }
    public static void showData(String text) {
        System.out.println(text);
    }
    public static void menu(){
        showData("Digite: \n1 para cadastrar PJ\n2 para cadastrar PF" +
                "\n3 para pesquisar por nome Contato");
    }

    /**
     * Constroi o objeto Pessoa Fisica para salvar na lista de contatos
     *
     */
    public static void cadastrarPF(){
        showData("Digite nome");
        String nome = readLine();
        showData("Digite telefone");
        String telefone = readLine();
        showData("Digite CPF");
        String cpf = readLine();
        showData("Digite idade");
        int idade = new Scanner(System.in).nextInt();

        PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, cpf, idade);
        contatos.adicionarPessoa(pessoaFisica);
    }
    /**
     * Constroi o objeto Pessoa Juridica para salvar na lista de contatos
     *
     */
    public static void cadastrarPJ(){
        showData("Digite nome: ");
        String nome = readLine();
        showData("Digite telefone: ");
        String telefone = readLine();
        showData("Digite CNJP:  ");
        String cnpj = readLine();
        showData("Digite nome fantasia: ");
        String nomefantasia = new Scanner(System.in).nextLine();

        PessoaJuridica pessJuridica = new PessoaJuridica(nome,telefone,cnpj,nomefantasia);
        contatos.adicionarPessoaPJ(pessJuridica);
    }
    /**
     * Pesquisa contato pelo nome e mostra na tela para o usuario
     */
    public static void pesquisarContato(){
        showData("Digite nome");
        String nome = new Scanner(System.in).nextLine();
        try {
            Pessoa pessoa = contatos.buscarPessoa(nome);
            System.out.println(pessoa);
        }catch (RuntimeException e){
           showData("Não encontrei esse contato");
        }

    }
    public static void executarSistema(){
        boolean continuar = true;
        while (continuar) {
            menu();
            int resposta = new Scanner(System.in).nextInt();
            if      (resposta == 1){
                cadastrarPJ();
            }else if(resposta == 2){
                cadastrarPF();
            }else if (resposta == 3){
                pesquisarContato();
            }
        }
    }
}
