/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Manager;
import com.dmodena.model.Assistant;
import com.dmodena.model.Technical;
import com.dmodena.model.Administrative;

/**
 *
 * @author dmodena
 */
public class TesteEmployees {
    public static void main(String[] args) {
        Manager ma = new Manager("Gerente", 2500);
        Assistant as = new Assistant("Assistente", 2000, 1);
        Technical ta = new Technical("Técnico", 2500, 2, 250);
        Administrative aa = new Administrative("Administrativo", 2750, 3, 1, 250);
        
        System.out.println(ma.getNome()+ " " + ma.getSalario());
        System.out.println(as.getNome() + " " + as.getSalario() + " " + as.getId());
        System.out.println(ta.getNome() + " " + ta.getSalario() + " " + ta.assinatura());
        System.out.println(aa.getNome() + " " + aa.getSalario() + " " + aa.assinatura());
    }
}
