/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.SpeedBike;
import com.dmodena.model.MountainBike;

/**
 *
 * @author dmodena
 */
public class TesteBicicletas {
    public static void main(String[] Args) {
        MountainBike mtb = new MountainBike(29, 5, 40);
        SpeedBike speedy = new SpeedBike("azul", 7, 80);
        
        System.out.println(mtb);
        System.out.println(speedy);
        
        System.out.println("\nAcelerando...");        
        mtb.acelerar(20);
        speedy.acelerar(25);
        System.out.println(mtb);
        System.out.println(speedy);
        
        System.out.println("\nFreando...");        
        mtb.frear(40);
        speedy.frear(45);
        System.out.println(mtb);
        System.out.println(speedy);
        
        System.out.println("\nMudando de marcha...");
        mtb.mudarMarcha(3);
        speedy.mudarMarcha(2);
        System.out.println(mtb);
        System.out.println(speedy);
    }
}
