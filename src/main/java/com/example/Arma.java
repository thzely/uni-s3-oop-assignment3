package com.example;

public class Arma implements ItemEquipavel{

    private String nome;
    private int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public Arma() {
    }

    public String getNome(){
        return nome;
    }

    public String getEfeito(){
        return "Causa " + dano + " de dano!";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    
}
