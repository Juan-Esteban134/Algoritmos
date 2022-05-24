/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

import java.util.Scanner;

/**
 *
 * @author Sala Univalle
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("punto-4 eliminar nodo entre el 10 y 11");
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
        miLista.agregarFinal(12);//
        miLista.agregarFinal(13);//
        miLista.agregarFinal(14);
        miLista.agregarFinal(15);
        miLista.agregarFinal(16);
        miLista.agregarFinal(17);
        miLista.agregarFinal(18);
        miLista.agregarFinal(19);
        miLista.agregarFinal(20);
        int aux = 0;
        Nodo nodoActual = miLista.getInicio();
        while (aux != miLista.getTamano()) {
            nodoActual = nodoActual.sig;
            aux++;
            if (aux == 10) {
                System.out.println("este es el nodo con la posicion 10 y valor " + nodoActual.valor + " lo quiere eliminar ?");
                int res = respuesta.nextInt();
                if (res == 1) {
                    miLista.remover(nodoActual.valor);
                    miLista.listar();
                    break;
                } else {
                    nodoActual = nodoActual.sig;
                    System.out.println("este es el nodo con la posicion 11 y valor " + nodoActual.valor + " lo quiere eliminar ?");
                    res = respuesta.nextInt();
                    if (res == 1) {
                        miLista.remover(nodoActual.valor);
                        miLista.listar();
                        return;

                    }

                }

            }

        }
    }
}
