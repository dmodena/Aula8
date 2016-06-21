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
public class MountainBike implements FuncoesBicicleta {
    private int aro;
    private int marchaAtual;
    private int velocidade;
    
    public MountainBike(int aro, int marchas) {
        this.aro = aro;       
        marchaAtual = 1;
        velocidade = 0;        
    }
    
    public MountainBike(int aro, int marchaAtual, int velocidade) {
        this.aro = aro;        
        this.marchaAtual = marchaAtual;
        this.velocidade = velocidade;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
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
        return "Mountain bike aro " + aro + " marcha " + marchaAtual + " velocidade " + velocidade + " km/s.";
    }
}
