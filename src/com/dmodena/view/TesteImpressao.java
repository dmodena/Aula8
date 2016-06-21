/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Pessoa;
import com.dmodena.model.Produto;

/**
 *
 * @author dmodena
 */
public class TesteImpressao {
    public static void main(String[] args) {
        Pessoa pe = new Pessoa("John", 35);
        Produto pr = new Produto("Sabão", 62, 2.75);
        
        System.out.println(pe.imprimir());
        System.out.println(pr.imprimir());
    }
}
