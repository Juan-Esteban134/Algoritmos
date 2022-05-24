/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Sala Univalle
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("punto-2 eliminar inicio");
        Lista miLista = new Lista();
        miLista.agregarFinal(1);
        miLista.agregarFinal(2);
        miLista.agregarFinal(3);
        miLista.agregarFinal(4);
        miLista.agregarFinal(5);
        miLista.agregarFinal(7);
        miLista.agregarFinal(8);
        miLista.agregarFinal(9);
        miLista.agregarFinal(10);
        miLista.agregarFinal(11);
        miLista.agregarFinal(12);
        miLista.agregarFinal(13);
        miLista.agregarFinal(14);
        miLista.agregarFinal(15);
        miLista.agregarFinal(16);

        System.out.println("el inicio es antes era: " + miLista.getInicio().valor);
        System.out.println("el final es antes era: " + miLista.getFin().valor);
        System.out.println("se elimino: "+miLista.getInicio().valor);
        miLista.eliminarCabeza(miLista);
        System.out.println("el inicio nuevo es: " + miLista.getInicio().valor);
        System.out.println("el final nuevo es: " + miLista.getFin().valor);
        miLista.listar();
    }

}
