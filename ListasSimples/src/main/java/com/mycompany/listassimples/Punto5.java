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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("punto-5 agregar inicio");
        Scanner respuesta = new Scanner(System.in);
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
        System.out.println("valor del nuevo nodo");
        int res = respuesta.nextInt();
        miLista5.agregarFinal(res);
        System.out.println("----------------------------------");
        miLista5.listar();
    }

}
