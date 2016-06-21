/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.text.DecimalFormat;

/**
 *
 * @author dmodena
 */
public abstract class Funcionario {
    private String nome;
    private long cpf;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getSalarioFormatado() {
        DecimalFormat dc = new DecimalFormat("0.##");
        return dc.format(salario);
    }

    public abstract String getCargo();
    
    @Override
    public String toString() {
        return this.getNome() + " " + this.getCargo() + " " + this.getSalarioFormatado();
    }
}
