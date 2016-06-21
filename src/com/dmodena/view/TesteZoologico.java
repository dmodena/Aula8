/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.view;

import com.dmodena.model.GatoZoologico;
import com.dmodena.model.Peixe;

/**
 *
 * @author dmodena
 */
public class TesteZoologico {
    public static void main(String[] Args) {
        GatoZoologico gabby = new GatoZoologico("Gabby");
        GatoZoologico gael = new GatoZoologico("Gael");
        Peixe paco = new Peixe("Paco");
        Peixe paili = new Peixe("Paili");
        
        System.out.println(gabby);
        System.out.println(gael);
        System.out.println(paco);
        System.out.println(paili);
    }
}
