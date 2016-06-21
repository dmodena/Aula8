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
public class Assistant extends Employee {
    private final int id;
    
    public Assistant(String nome, double salario, int id) {
        super.setNome(nome);
        super.setSalario(salario);
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
}
