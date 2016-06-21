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
public class Entregador extends Funcionario implements PagamentoFuncionario {
    private int pizzasEntregues;
    private int aumentosConcedidos;
    
    public Entregador(String nome, long cpf, double salario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setSalario(salario);
        pizzasEntregues = 0;
        aumentosConcedidos = 0;
    }
    
    public void entregarPizzas(int pizzas) {
        pizzasEntregues += pizzas;
        aumentarSalario();
    }

    @Override
    public void aumentarSalario() {
        int aux = pizzasEntregues / 100;
        
        if(aux > aumentosConcedidos) {
            super.setSalario(super.getSalario() * 1.05d);
            aumentosConcedidos++;
        }
    }

    @Override
    public String getCargo() {
        return "Entregador";
    }
}
