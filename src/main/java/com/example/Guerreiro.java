package com.example;

import java.util.List;
import java.util.ArrayList;

public class Guerreiro {
    private String nome;
    private Coracao coracao;
    private List<ItemEquipavel> itensEquipados;

    public Guerreiro(String nome) {
        this.nome = nome;
        this.coracao = new Coracao(100, true);
        this.itensEquipados = new ArrayList<>();
    }

    public void equiparItem(ItemEquipavel item){
        itensEquipados.add(item);
    }

    public void desequiparItens(){
        itensEquipados.clear();
        System.out.println("Itens desequipados com sucesso!");
    }

    public void exibirStatus(){
        System.out.println("--- Status do Jogador ---");
        System.out.println("-- Nome do Guerreiro: ");
        System.out.println(getNome());
        System.out.println("-- Saude do Coração: ");
        System.out.println(this.coracao.getHitPoints());
        System.out.println("-- Coração está saudável?");
        System.out.println(this.coracao.isSaudavel());
        System.out.println(" ");

        System.out.println("--- Inventário Equipaveis ---");
        for(ItemEquipavel it : itensEquipados){
            if(it instanceof Arma){
                System.out.println("-- Arma: " + it.getNome());
                System.out.println("-- Dano: " + it.getEfeito());
            }

            if(it instanceof Escudo){
                System.out.println("-- Escudo: " + it.getNome());
                System.out.println("-- Proteção: " + it.getEfeito());
            }
        }
    }

    public String getNome() {
        return nome;
    }
    
}
