package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;
	    LOL:
        while (true){
            contador++;
            System.out.println("Quantas vezes entrou? " + contador);
            System.out.println("Voce deseja continuar ou sair do loop?");
            System.out.println("Se voce deseja sair digite (1)");
            System.out.println("Se voce deseja criar uma entidade cliente, digite (2)");
            System.out.println("Se voce deseja remover um cliente, digite (3)");
            System.out.println("Se voce deseja achar um cliente em especifico, digite (4)");
            System.out.println("Se voce deseja mostrar todos os clientes digite (5)");
            System.out.println("Se deseja atualizar a idade de um cliente digite (6)");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            //PARAR O LOOP
            if (opcaoEscolhida==1){
                System.out.println("voce esta saindo do loop...");
                break LOL;
            }
            //ADICIONAR CLIENTE
            if (opcaoEscolhida==2){
                Cliente cliente = new Cliente();
                System.out.println("Digite o nome e depois a idade do cliente");
                Scanner atributosDoCliente = new Scanner(System.in);
                cliente.nome = atributosDoCliente.nextLine();
                cliente.idade = Integer.valueOf(atributosDoCliente.nextLine());
                System.out.println("Cliente com nome: "+cliente.nome);
                System.out.println("Cliente com idade: "+cliente.idade);
                clienteList.add(cliente);
            }
            //REMOVER DA LISTA PELO NOME
            if (opcaoEscolhida==3){
                for(int as =0;as<clienteList.size();as++){
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Digite o nome que voce deseja remover");
                    String remove = scanner1.nextLine();
                    if(remove.equals(clienteList.get(as))){
                        clienteList.remove(as);
                    }
                }
            }
            //VER UM CLIENTE EM ESPECIFICO
            if (opcaoEscolhida==4){
//                for(int i = 0;i<clienteList.size();i++) {
//                    System.out.println("Digite o nome do cliente que voce quer");
//                    Scanner scanner1 = new Scanner(System.in);
//                    String clienteEmEspecifico = scanner1.nextLine();
//                    if (clienteEmEspecifico.equals(clienteList.get(i).nome)){                     ERRO
//                        System.out.println("Nome: " + clienteList.get(i).nome);               NAO FUNCIONA FICA EM LOOP NO 4
//                        System.out.println("Idade: "+ clienteList.get(i).idade);
//
//                    }
//                }
                System.out.println("Digite o nome do cliente que voce quer");
                Scanner scanner1 = new Scanner(System.in);
                String clienteEmEspecifico = scanner1.nextLine();
                for(Cliente c : clienteList){
                    if(clienteEmEspecifico.equals(c.nome)){
                        System.out.println("Nome: " +c.nome);
                        System.out.println("Idade: "+ c.idade);
                    }
                }
            }
            //IMPRIMINDO OS NOMES DA LISTA
            if (opcaoEscolhida==5){
                System.out.println("Imprimindo os nomes da lista...");
                for (Cliente s:clienteList)
                    System.out.println(s.nome);
            }
            //ATUALIZAR A IDADE DO CLIENTE
            if (opcaoEscolhida==6){


            }
        }
    }
}
