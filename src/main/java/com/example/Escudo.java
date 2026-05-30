package com.example;

public class Escudo implements ItemEquipavel{
    private String nome;
    private int defesa;
    
    public Escudo(String nome, int defesa) {
        this.nome = nome;
        this.defesa = defesa;
    }

    public Escudo() {
    }

    public String getNome() {
        return nome;
    }

    public String getEfeito(){
        return "Suporta " + defesa + " de defesa";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    
}
