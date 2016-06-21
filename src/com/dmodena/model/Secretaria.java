/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.model;

import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class Secretaria extends Funcionario implements PagamentoFuncionario {
    private ArrayList<String> idiomas;
    private int aumentosConcedidos;
    
    public Secretaria(String nome, long cpf, double salario) {
        super.setNome(nome);
        super.setCpf(cpf);
        super.setSalario(salario);
        idiomas = new ArrayList<>();
        idiomas.add("Português");
        aumentosConcedidos = 0;
    }
    
    public void adicionarIdioma(String idioma) {
        boolean idiomaValido = true;
        
        for(String i : idiomas) 
            if(i == idioma) idiomaValido = false;
        
        if(idiomaValido) {
            idiomas.add(idioma);
            aumentarSalario();
        }
    }
    
    public void removerIdioma(String idioma) {
        idiomas.remove(idioma);
    }

    @Override
    public void aumentarSalario() {
        int aux = 0;
        
        for(String i : idiomas) 
            if(!i.equals("Português") && !i.equals("Inglês"))
                aux++;
        
        if(aux > aumentosConcedidos) {
            super.setSalario(super.getSalario() + 100d);
            aumentosConcedidos++;
        }
    }

    @Override
    public String getCargo() {
        return "Secretaria";
    }
}
