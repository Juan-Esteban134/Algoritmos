/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author Sala Univalle
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("punto-3 eliminar nodo siguiente con valo mayor a 21");
        Lista miLista = new Lista();
        miLista.agregarFinal(4);
        miLista.agregarFinal(8);
        miLista.agregarFinal(12);
        miLista.agregarFinal(16);
        miLista.agregarFinal(20);
        miLista.agregarFinal(24);
        miLista.agregarFinal(28);
        miLista.agregarFinal(32);
        miLista.agregarFinal(36);
        miLista.agregarFinal(40);

        Nodo nodoActual = miLista.getInicio();
        while (nodoActual.valor > 21) {
            nodoActual = nodoActual.sig;
        }
        System.out.println("El valor del nodo a eliminar es: " + nodoActual.valor);
        miLista.remover(nodoActual.valor);
        miLista.listar();
    }
}
