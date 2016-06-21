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
public class Saxofone implements Instrumento {

    @Override
    public String getDefinicao() {
        return "Este é um saxofone";
    }

    @Override
    public String getTipo() {
        return "Sopro";
    }

    @Override
    public String tocar() {
        return "Tocando um saxofone...";
    }
}
