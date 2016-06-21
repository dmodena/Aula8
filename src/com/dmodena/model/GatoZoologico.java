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
public class GatoZoologico extends Mamifero {
    private final String alimentoPreferido;
    
    public GatoZoologico(String nome) {
        super();
        super.setNumeroPatas(4);
        super.setVelocidade(13);
        super.setNome(nome);
        alimentoPreferido = "leite";
    }
    
    public String getAlimentoPreferido() {
        return alimentoPreferido;
    }
    
    @Override
    public String toString() {
        return super.getNome() + " é um gato, vive na " + super.getAmbiente() +
                ", tem " + super.getNumeroPatas() + " patas, sua velocidade é de " + 
                super.getVelocidade() + " m/s, e seu alimento preferido é " + 
                getAlimentoPreferido();
    }
}
