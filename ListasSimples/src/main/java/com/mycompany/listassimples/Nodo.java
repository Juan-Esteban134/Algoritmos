package com.mycompany.listassimples;

public class Nodo {

    int valor;
    Nodo sig;
}

class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int tamano;
    Nodo nodoActual;

    public Lista() {
        inicio = null;
        fin = null;
        tamano = 0;

    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
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

    public void agregarInicio(int valor) { //preguntar si en el else es neceasrio poner la asignacion de que fin=nuevo
        Nodo nuevo = new Nodo();
        nuevo.valor = valor;
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
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
            fin = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            fin = nuevo;
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
    
    public void moverPuntero(Lista l){
    
        
        
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

    public void eliminarCola(Lista lista) {
        if (lista.getInicio() != null) {
            nodoActual = lista.getInicio();
            if (nodoActual.sig == null) {
                lista = null;
                do {
                    if (nodoActual.sig != null) {
                        nodoActual = nodoActual.sig;
                    } else {
                        nodoActual.sig = null;
                        fin = nodoActual;
                    }
                } while (nodoActual.sig != null);
            }
        }
    }

    public void eliminarCabeza(Lista lista) {

        if (lista.getInicio() != null) {
            nodoActual = lista.getInicio();
            if (nodoActual.sig == null) {
                lista = null;
            }else{
            nodoActual=nodoActual.sig;
            inicio=null;
            lista.setInicio(nodoActual);
            }
        }else{
        esVacia();
        }

    }
}
