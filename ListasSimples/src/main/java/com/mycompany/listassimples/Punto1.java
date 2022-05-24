/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Sala Univalle
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("punto-1 agregar inicio");
        Lista miLista1 = new Lista();
        miLista1.agregarInicio(1);
        miLista1.agregarInicio(2);
        miLista1.agregarInicio(3);
        miLista1.agregarInicio(4);
        miLista1.agregarInicio(5);
        miLista1.agregarInicio(6);
        System.out.println("el inicio es: "+miLista1.getInicio().valor);
        System.out.println("el final es: "+miLista1.getFin().valor);
        miLista1.listar();
    }
    
}
