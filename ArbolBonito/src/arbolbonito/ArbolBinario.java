package arbolbonito;

import javax.swing.JOptionPane;

public class ArbolBinario {

    private NodoBinarioa raiz;
    private String respuesta = "";

    public ArbolBinario(NodoBinarioa raiz) {
        this.raiz = raiz;
    }

    public NodoBinarioa getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBinarioa raiz) {
        this.raiz = raiz;
    }

    public void insertarNodo(NodoBinarioa raiz, NodoBinarioa nodo) {

        if (raiz != null) {
            if (nodo.getDato() < raiz.getDato()) {
                if (raiz.getNodoIzquierdo() == null) {
                    raiz.setNodoIzquierdo(nodo);
                } else {
                    insertarNodo(raiz.getNodoIzquierdo(), nodo);
                }

            } else {
                if (raiz.getNodoDerecho() == null) {
                    raiz.setNodoDerecho(nodo);
                } else {
                    insertarNodo(raiz.getNodoDerecho(), nodo);
                }
            }
        } else {
            raiz = nodo;
        }
    }

    public NodoBinarioa buscarNodo(int d) {

        NodoBinarioa aux = raiz;
        while (aux.getDato() != d) {
            if (d < aux.getDato()) {
                aux = aux.getNodoIzquierdo();
            } else {
                aux = aux.getNodoDerecho();
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean eliminar(int dato) {

        NodoBinarioa aux = raiz;
        NodoBinarioa padre = raiz;
        boolean esHijoIzquierdo = true;

        while (aux.getDato() != dato) {
            padre = aux;
            if (dato < aux.getDato()) {
                esHijoIzquierdo = true;
                aux = aux.getNodoIzquierdo();
            } else {
                esHijoIzquierdo = false;
                aux = aux.getNodoDerecho();
            }
            if (aux == null) {
                return false;
            }
        }
        if (aux.getNodoIzquierdo() == null && aux.getNodoDerecho() == null) {
            if (aux == raiz) {
                raiz = null;
            } else if (esHijoIzquierdo) {
                padre.setNodoIzquierdo(null);
            } else {
                padre.setNodoDerecho(null);
            }
        } else if (aux.getNodoDerecho() == null) {
            if (aux == raiz) {
                raiz = aux.getNodoIzquierdo();
            } else if (esHijoIzquierdo) {
                padre.setNodoIzquierdo(raiz);
            } else {
                padre.setNodoDerecho(aux.getNodoIzquierdo());
            }
        } else if (aux.getNodoIzquierdo() == null) {
            if (aux == raiz) {
                raiz = aux.getNodoDerecho();
            } else if (esHijoIzquierdo) {
                padre.setNodoIzquierdo(aux.getNodoDerecho());
            } else {
                padre.setNodoDerecho(aux.getNodoIzquierdo());
            }
        } else {
            NodoBinarioa reemplazo = obtenerNodoReemplazo(aux);
            if (aux == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzquierdo) {
                padre.setNodoIzquierdo(reemplazo);
            } else {
                padre.setNodoDerecho(reemplazo);
            }
            reemplazo.setNodoIzquierdo(aux.getNodoIzquierdo());
        }

        return true;
    }

    public NodoBinarioa obtenerNodoReemplazo(NodoBinarioa nodoReemp) {
        NodoBinarioa reemplazarPadre = nodoReemp;
        NodoBinarioa reemplazo = nodoReemp;
        NodoBinarioa aux = nodoReemp.getNodoDerecho();

        while (aux != null) {
            reemplazarPadre = reemplazo;
            reemplazo = aux;
            aux = aux.getNodoIzquierdo();
        }
        if (reemplazo != nodoReemp.getNodoDerecho()) {
            reemplazarPadre.setNodoIzquierdo(reemplazo.getNodoDerecho());
            reemplazo.setNodoDerecho(nodoReemp.getNodoDerecho());
        }
        System.out.println("El nodo reemplazo es: " + reemplazo);
        return reemplazo;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public String recorrerPreOrden(NodoBinarioa raiz) {
        respuesta = "";
        if (raiz != null) {
            JOptionPane.showMessageDialog(null, raiz.getDato());
            respuesta = respuesta + "   " + raiz.getDato();
            recorrerPreOrden(raiz.getNodoIzquierdo());
            recorrerPreOrden(raiz.getNodoDerecho());
            return respuesta;
        }
        return null;
    }

    public String recorrerInOrden(NodoBinarioa raiz) {
        respuesta = "";
        if (raiz != null) {
            recorrerInOrden(raiz.getNodoIzquierdo());
            JOptionPane.showMessageDialog(null, raiz.getDato());
            respuesta = respuesta + "   " + raiz.getDato();
            recorrerInOrden(raiz.getNodoDerecho());
            return respuesta;
        }
        return null;
    }

    public String recorrerPosOrden(NodoBinarioa raiz) {
        respuesta = "";
        if (raiz != null) {
            recorrerPosOrden(raiz.getNodoIzquierdo());
            recorrerPosOrden(raiz.getNodoDerecho());
            JOptionPane.showMessageDialog(null, raiz.getDato());
            respuesta = respuesta + "   " + raiz.getDato();
            return respuesta;

        }
        return null;
    }

}
