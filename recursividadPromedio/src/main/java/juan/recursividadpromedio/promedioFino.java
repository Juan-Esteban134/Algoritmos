/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juan.recursividadpromedio;

import java.util.ArrayList;

/**
 *
 * @author juane
 */
public class promedioFino {

 static int acumulado=0;
    public static void main(String[] args) {
        ArrayList coleccion = new ArrayList();
        coleccion.add(2);
        coleccion.add(1);
        System.out.println(promedioRecursivo(coleccion, acumulado));
    }
    
    
    public static double promedioRecursivo(ArrayList cole, int indice) {
        if (indice < cole.size()) {
            acumulado += (int) cole.get(indice);            
            promedioRecursivo(cole, indice + 1);
        }
        return (double)acumulado/(double)cole.size();
    }
}
