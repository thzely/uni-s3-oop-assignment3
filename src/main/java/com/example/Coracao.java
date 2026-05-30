package com.example;

public class Coracao {
    private int hitPoints;
    private boolean saudavel;

    public Coracao(int hitPoints, boolean saudavel) {
        this.hitPoints = hitPoints;
        this.saudavel = saudavel;
    }

    public Coracao() {
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isSaudavel() {
        return saudavel;
    }

}
