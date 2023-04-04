/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinalprograiii;

/**
 *
 * @author Eddy Argueta
 */
public class persona {

    String codigo;
    String nombre;
    float precio;

    String asterisco;

    public persona(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.asterisco = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setAsterisco(String asterisco) {
        this.asterisco = asterisco;
    }

    public String getAsterisco() {
        return asterisco;
    }
    
 
}
