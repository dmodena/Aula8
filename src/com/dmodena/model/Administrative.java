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
public class Administrative extends Assistant implements IdentificaAssistente {
    private int turno; // 1 - diurno; 2 - noturno
    private double adicionalNoturno;
    
    public Administrative(String nome, double salario, int id, int turno, double adicionalNoturno) throws IllegalArgumentException {
        super(nome, salario, id);
        
        if(turno == 1 || turno == 2) {            
            this.turno = turno;
            this.adicionalNoturno = adicionalNoturno;
        }
        else {
            throw new IllegalArgumentException("Turno incorreto.");
        }
        
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        if(turno == 1 || turno == 2)
            this.turno = turno;
        else
            throw new IllegalArgumentException("Turno incorreto.");
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public String assinatura() {
        return "Assinatura: " + super.getId();
    }
}
