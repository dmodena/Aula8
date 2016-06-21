package com.dmodena.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmodena
 */
public class Bateria implements Instrumento {

    @Override
    public String getDefinicao() {
        return "Esta é uma bateria";
    }

    @Override
    public String getTipo() {
        return "Percussão";
    }

    @Override
    public String tocar() {
        return "Tocando uma bateria...";
    }    
}
