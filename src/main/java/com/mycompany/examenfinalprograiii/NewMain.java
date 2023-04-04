/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinalprograiii;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eddy Argueta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("DATOS DE ESTUDIANTE");
        try {
            System.out.println("=========================");
            System.out.println("5190-20-522, Eddy Jehovany Argueta Ramirez,  Seccion D");
            System.out.println("" + InetAddress.getLocalHost());
            System.out.println("=========================");
        } catch (UnknownHostException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        tablaHasH n = new tablaHasH();

        
        int correlativo = 10;
        System.out.println("Codigo | Indice Calculado");
        
        for (int i = 0; i < 30; i++) {

            String codigo = "SEC-0" + correlativo + "D";
            String Curso = "Curso SEC-0" + correlativo + "D";
            float precio = 50.01f * correlativo ;

            persona p = new persona(codigo, Curso, precio);

            n.Insertar(p);
            correlativo++;
          

        }
        n.Mostrar();
        
  
     

    }

}
