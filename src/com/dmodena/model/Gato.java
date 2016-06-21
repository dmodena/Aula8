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
public class Gato extends Animal implements AnimalBrincar {
    
    public Gato(double peso, String habitat) {
        super.setPeso(peso);
        super.setHabitat(habitat);
    }

    @Override
    public String alimentar() {
        return "Implementar como um gato se alimenta.";
    }
    
    @Override
    public String brincar() {
        return "Implementar como um gato brinca.";
    }
}
