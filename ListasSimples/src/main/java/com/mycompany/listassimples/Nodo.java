package com.mycompany.listassimples;

public class Nodo {

    int valor;
    Nodo sig;
}

class Lista {

    private Nodo inicio;
    private int tamano;

    public Lista() {
        inicio = null;
        tamano = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void agregarInicio(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio = nuevo;
        }
        tamano++;
    }

    public void agregarFinal(int valor) {
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;

        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
        tamano++;
    }

    public void listar() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println("El valor es: " + aux.valor);
            aux = aux.sig;
        }
    }

    public boolean buscar(int dato) {
        Nodo aux = inicio;
        boolean encontrado = false;
        while (aux != null && encontrado != true) {
            if (dato == aux.valor) {
                // Cambia el valor de la bandera.
                encontrado = true;
            } else {
                // Avanza al siguiente nodo
                aux = aux.sig;
            }
        }
        return encontrado;
    }

    public void remover(int referencia) {
        // Consulta si el valor de referencia existe en la lista.
        if (buscar(referencia)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.valor == referencia) {
                inicio = inicio.sig;
            } else {
                Nodo aux = inicio;
                while (aux.sig.valor != referencia) {
                    aux = aux.sig;
                }
                Nodo siguiente = aux.sig.sig;
                aux.sig = aux.sig.sig;
            }

        }
    }

}
