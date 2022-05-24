/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listassimples;

/**
 *
 * @author 57314
 */
public class ejecutable {

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
        miLista1.listar();
        System.out.println("---------------");

        System.out.println("");

        System.out.println("punto-2 eliminar inicio");
        Lista miLista2 = new Lista();
        miLista2.agregarFinal(1);
        miLista2.agregarFinal(2);
        miLista2.agregarFinal(3);
        miLista2.agregarFinal(4);
        miLista2.agregarFinal(5);
        miLista2.agregarFinal(7);
        miLista2.agregarFinal(8);
        miLista2.agregarFinal(9);
        miLista2.agregarFinal(10);
        miLista2.agregarFinal(11);
        miLista2.agregarFinal(12);
        miLista2.agregarFinal(13);
        miLista2.agregarFinal(14);
        miLista2.agregarFinal(15);
        miLista2.agregarFinal(16);
        miLista2.remover(miLista2.getInicio().valor);
        miLista2.listar();
        System.out.println("---------------");

        System.out.println("");

        System.out.println("punto-3 eliminar nodo siguiente con valo mayor a 21");
        Lista miLista3 = new Lista();
        miLista3.agregarFinal(4);
        miLista3.agregarFinal(8);
        miLista3.agregarFinal(12);
        miLista3.agregarFinal(16);
        miLista3.agregarFinal(20);
        miLista3.agregarFinal(24);
        miLista3.agregarFinal(28);
        miLista3.agregarFinal(32);
        miLista3.agregarFinal(36);
        miLista3.agregarFinal(40);
        int valorEliminar = 22;
        if (valorEliminar > 21) {
            while (valorEliminar != valorEliminar + 1) {
                if (miLista3.buscar(valorEliminar)) {
                    System.out.println("se elimino" + valorEliminar);
                    miLista3.remover(valorEliminar);
                    return;
                } else {
                    valorEliminar++;
                }
            }
        }

        System.out.println("-------aaaaaaa--------");

        System.out.println("");

        System.out.println("punto-4 eliminar nodo siguiente con valo mayor a 21");
        Lista miLista4 = new Lista();
        miLista4.agregarFinal(1);
        miLista4.agregarFinal(2);
        miLista4.agregarFinal(3);
        miLista4.agregarFinal(4);
        miLista4.agregarFinal(5);
        miLista4.agregarFinal(7);
        miLista4.agregarFinal(8);
        miLista4.agregarFinal(9);
        miLista4.agregarFinal(10);
        miLista4.agregarFinal(11);
        miLista4.agregarFinal(12);//
        miLista4.agregarFinal(13);//
        miLista4.agregarFinal(14);
        miLista4.agregarFinal(15);
        miLista4.agregarFinal(16);
        miLista4.agregarFinal(17);
        miLista4.agregarFinal(18);
        miLista4.agregarFinal(19);
        miLista4.agregarFinal(20);

        System.out.println(miLista4.getTamano());
        System.out.println(miLista4.getTamano() - (miLista4.getTamano() % 2));
        miLista4.remover(miLista4.getTamano() - (miLista4.getTamano() % 2));
        miLista4.listar();
        
        System.out.println("punto-5 agregar inicio");
        Lista miLista5 = new Lista();
        miLista5.agregarFinal(1);
        miLista5.agregarFinal(2);
        miLista5.agregarFinal(3);
        miLista5.agregarFinal(4);
        miLista5.agregarFinal(5);
        miLista5.agregarFinal(7);
        miLista5.agregarFinal(8);
        miLista5.agregarFinal(9);
        miLista5.agregarFinal(10);
        miLista5.listar();
        System.out.println("nuevo");
        miLista5.agregarFinal(11);
        miLista5.listar();
        
        System.out.println("---------------");

        System.out.println("");

        System.out.println("punto-6 eliminar nodo anterior con valo mayor a 37");
        Lista miLista6 = new Lista();
        miLista6.agregarFinal(5);
        miLista6.agregarFinal(10);
        miLista6.agregarFinal(15);
        miLista6.agregarFinal(20);
        miLista6.agregarFinal(25);
        miLista6.agregarFinal(30);
        miLista6.agregarFinal(35);
        miLista6.agregarFinal(40);
        miLista6.agregarFinal(45);
        miLista6.agregarFinal(50);
        int valorEliminar2 = 36;
        if (valorEliminar2 < 37) {
            while (valorEliminar2 != valorEliminar2 - 1) {
                if (miLista6.buscar(valorEliminar2)) {
                    System.out.println("se elimino" + valorEliminar2);
                    miLista6.remover(valorEliminar2);
                    return;
                } else {
                    valorEliminar2--;
                }
            }
        }

        System.out.println("---------------");

        System.out.println("");

    }

}
