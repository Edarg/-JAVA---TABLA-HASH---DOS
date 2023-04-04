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
public class tablaHasH {

    static final int TAMTABLA = 35;
    private persona[] tabla;

    public tablaHasH() {

        this.tabla = new persona[TAMTABLA];
        for (int i = 0; i < TAMTABLA; i++) {
            tabla[i] = null;
        }

    }

    public int ValorHash(String Cadena, persona person) {
        long d;
        int i = 0, p;
        d = transformaClave(Cadena);

        //aritmetica Modular
        p = (int) (d % TAMTABLA);

        while (tabla[p] != null && !tabla[p].getCodigo().equals(Cadena)) {
            i++;
            p = p + i;
            p = p % TAMTABLA;
            person.setAsterisco("*");

        }

        return p;

    }

    static long transformaClave(String Convertir) {
        long d;
        d = 0;
        for (int j = 0; j < Math.min(Convertir.length(), 10); j++) {
            d = d * 27 + (int) Convertir.charAt(j);

        }

        if (d < 0) {
            d = -d;
        }

        return d;

    }

    public void Insertar(persona persona) {
        int posicion;
        long d;
        int p;

        posicion = ValorHash(persona.getCodigo(), persona);
        this.tabla[posicion] = persona;

        d = transformaClave(persona.getCodigo());
        p = (int) (d % TAMTABLA);

        System.out.println(this.tabla[posicion].getCodigo() + this.tabla[posicion].getAsterisco() + " ; " + p);

    }

    public void Mostrar() {

        long d;
        int p;
        System.out.println("\n\nLISTA DE LOS DATOS CON EXPLORACION LINEAL\n\nIndice|Codigo|Nombre|Precio");

        for (int u = 0; u < TAMTABLA; u++) {
            if (this.tabla[u] == null) {
                System.out.println(u + "---------------libre------------------");
            } else {

                d = transformaClave(this.tabla[u].getCodigo());
                p = (int) (d % TAMTABLA);
                System.out.println(p + " ; " + this.tabla[u].getCodigo() + " ; " + this.tabla[u].getNombre() + " ; " + this.tabla[u].getPrecio());
            }
        }
    }

   

}
