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
public class Peixe extends Zoologico {
    private final String caracteristicas;
    
    public Peixe(String nome) {
        super.setAmbiente("água");
        super.setNumeroPatas(0);
        super.setVelocidade(7);
        super.setNome(nome);
        caracteristicas = "barbatanas e cauda";
    }
    
    public String getCaracteristicas() {
        return caracteristicas;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " é um peixe, vive na " + super.getAmbiente() + 
                ", tem " + super.getNumeroPatas() + " patas, sua velocidade é de " + 
                super.getVelocidade() + " m/s, e possui as seguintes características: " + 
                getCaracteristicas();
    }
}
