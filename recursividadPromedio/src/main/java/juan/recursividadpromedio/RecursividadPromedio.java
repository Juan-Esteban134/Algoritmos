package juan.recursividadpromedio;

import java.util.ArrayList;

public class RecursividadPromedio {

    public static void main(String[] args) {

        ArrayList coleccion = new ArrayList();
        coleccion.add(2);
        coleccion.add(1);

        double tam = coleccion.size();
        int acumulado = acumulado(coleccion, 0, 0, tam);
        System.out.println(acumulado(coleccion, 0, 0, tam));
        System.out.println("Division recursiva:  " + divisionRecursiva(acumulado, tam));
        System.out.println("Division normal:  " + (acumulado / tam));
        

    }

    public static int acumulado(ArrayList array, int indice, int acumulado, double tam) {

        if (tam == 0) {
            return acumulado;
        }
        if (indice == array.size()) {
            return acumulado;
        }
        return acumulado(array, indice + 1, acumulado + (int) array.get(indice), tam);
    }

    public static double divisionRecursiva(double dividendo, double divisor) {

        if (divisor > dividendo) {
            return 0;
        } else {
            return 1.0 + divisionRecursiva(dividendo - divisor, divisor);
        }
    }


}
