/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.Funcionario;
import com.dmodena.model.Empacotador;
import com.dmodena.model.Entregador;
import com.dmodena.model.Gerente;
import com.dmodena.model.Secretaria;
import com.dmodena.model.Seguranca;
import java.util.ArrayList;

/**
 *
 * @author dmodena
 */
public class TesteFuncionarios {
    public static void main(String[] Args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        Empacotador empacotador = new Empacotador("Cheri", 878491889, 1400.79);
        Entregador entregador = new Entregador("Tama", 547591435, 1700.63);
        Gerente gerente = new Gerente("Delena", 362531666, 2250.38);
        Secretaria secretaria = new Secretaria("Monique", 968458905, 1800.27);
        Seguranca seguranca = new Seguranca("Wallace", 951005528, 1600.73);
        
        // Testando valor do salario do Entregador
        System.out.println(entregador);
        entregador.entregarPizzas(85);
        System.out.println(entregador);
        entregador.entregarPizzas(30);
        System.out.println(entregador);
        
        System.out.println();
        
        // Testando valor do salario da Secretaria
        System.out.println(secretaria);
        secretaria.adicionarIdioma("Inglês");
        System.out.println(secretaria);
        secretaria.adicionarIdioma("Francês");
        System.out.println(secretaria);
        
        System.out.println();
        
        // Testando joranada do Segurança
        System.out.println(seguranca);
        System.out.println("Jornada noturna? " + seguranca.isJornadaNoturna());
        seguranca.setJornadaNoturna(true);
        System.out.println("Jornada noturna? " + seguranca.isJornadaNoturna());
        
        System.out.println();
        
        // Adicionando funcionários a lista e exibindo todos eles
        funcionarios.add(empacotador);
        funcionarios.add(entregador);
        funcionarios.add(gerente);
        funcionarios.add(secretaria);
        funcionarios.add(seguranca);
        
        for(Funcionario f : funcionarios) System.out.println(f);
        
    }
}
