/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

/**
 *
 * @author dmodena
 */
public class SpeedBike implements FuncoesBicicleta {
    private String cor;
    private int marchaAtual;
    private int velocidade;
        
    public SpeedBike(String cor) {
        this.cor = cor;
        marchaAtual = 1;
        velocidade = 0;
    }
    
    public SpeedBike(String cor, int marchaAtual, int velocidade) {
        this.cor = cor;
        this.marchaAtual = marchaAtual;
        this.velocidade = velocidade;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }    
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar(int acrescimo) {
        this.velocidade += acrescimo;
    }

    @Override
    public void frear(int decrescimo) {
        this.velocidade -= decrescimo;
    }

    @Override
    public void mudarMarcha(int novaMarcha) {
        this.marchaAtual = novaMarcha;
    }
    
    @Override
    public String toString() {
        return "Bike speed " + cor + " marcha " + marchaAtual + " velocidade " + velocidade + " km/s.";
    }
}
