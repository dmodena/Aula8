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
public class Seguranca extends Funcionario {
    private boolean jornadaNoturna;
    
    public Seguranca(String nome, long cpf, double salario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setSalario(salario);
        jornadaNoturna = false;
    }

    public boolean isJornadaNoturna() {
        return jornadaNoturna;
    }

    public void setJornadaNoturna(boolean jornadaNoturna) {
        this.jornadaNoturna = jornadaNoturna;
    }

    @Override
    public String getCargo() {
        return "Seguranca";
    }
}
