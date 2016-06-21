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
public class Viola implements Instrumento {
    
    @Override
    public String getDefinicao() {
        return "Esta é uma viola";
    }

    @Override
    public String getTipo() {
        return "Corda";
    }

    @Override
    public String tocar() {
        return "Tocando uma viola...";
    }    
}
