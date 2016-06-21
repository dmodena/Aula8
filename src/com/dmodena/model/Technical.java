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
public class Technical extends Assistant implements IdentificaAssistente {
    private double bonus;
    
    public Technical(String nome, double salario, int id, double bonus) {
        super(nome, salario, id);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String assinatura() {
        return "Assinatura: " + super.getId();
    }
}
