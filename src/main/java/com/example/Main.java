package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tt = new Scanner(System.in);

        Guerreiro pessoa = new Guerreiro("Isaias");

        while(true){
            System.out.println("\n--- BEM - VINDO ---");
            System.out.println("Selecione o que deseja fazer:");
            System.out.println("1. Equipar Item");
            System.out.println("2. Desequipar Item");
            System.out.println("3. Exibir Status");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int escolha = tt.nextInt();
            tt.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Qual tipo de item deseja equipar?");
                    System.out.println("Digite 1 para Arma ou 2 para Escudo");
                    int tipoeq = tt.nextInt();
                    tt.nextLine();

                    if(tipoeq == 1){
                        System.out.println("Digite o nome da arma: ");
                        String nomedigitado = tt.nextLine();

                        System.out.println("Digite o dano da arma: ");
                        int danodigitado = tt.nextInt();
                        
                        Arma novaArma = new Arma(nomedigitado, danodigitado);
                        pessoa.equiparItem(novaArma);

                        System.out.println("Arma equipada com sucesso!");
                    }
                    if(tipoeq == 2){
                        System.out.println("Digite o nome da arma: ");
                        String nomedigitado = tt.nextLine();

                        System.out.println("Digite a defesa da arma: ");
                        int defesadigitada = tt.nextInt();
                        
                        Escudo novoEscudo = new Escudo(nomedigitado, defesadigitada);
                        pessoa.equiparItem(novoEscudo);

                        System.out.println("Escudo equipado com sucesso!");
                    }
                    break;
                case 2:
                    pessoa.desequiparItens();
                    break;
                case 3:
                    pessoa.exibirStatus();
                    break;
                case 0:
                System.out.println("Saindo do sistema...");
                tt.close();
                System.exit(0);
                break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}