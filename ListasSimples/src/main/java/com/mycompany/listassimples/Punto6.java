/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author 57314
 */
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("punto-6 eliminar nodo anterior con valo mayor a 37");
        Lista miLista = new Lista();
        miLista.agregarFinal(5);
        miLista.agregarFinal(10);
        miLista.agregarFinal(15);
        miLista.agregarFinal(20);
        miLista.agregarFinal(25);
        miLista.agregarFinal(30);
        miLista.agregarFinal(35);
        miLista.agregarFinal(40);
        miLista.agregarFinal(45);
        miLista.agregarFinal(50);
        Nodo nodoActual = miLista.getInicio();
        while (nodoActual.sig.valor < 37) {
            nodoActual = nodoActual.sig;
        }
        miLista.remover(nodoActual.valor);
        System.out.println("El valor del nodo a eliminar es: " + nodoActual.valor);
        miLista.listar();
    }
}
