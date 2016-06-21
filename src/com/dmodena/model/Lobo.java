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
public class Lobo extends Animal {
    
    public Lobo(double peso, String habitat) {
        super.setPeso(peso);
        super.setHabitat(habitat);
    }

    @Override
    public String alimentar() {
        return "Implementar como um Lobo se alimenta.";
    }
}
