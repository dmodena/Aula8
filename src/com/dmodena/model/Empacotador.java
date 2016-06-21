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
public class Empacotador extends Funcionario {
    
    public Empacotador(String nome, long cpf, double salario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setSalario(salario);
    }

    @Override
    public String getCargo() {
        return "Empacotador";
    }
}
