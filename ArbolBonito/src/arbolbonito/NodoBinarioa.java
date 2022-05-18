package arbolbonito;

public class NodoBinarioa {

    private int dato;
    NodoBinarioa nodoDerecho;
    NodoBinarioa nodoIzquierdo;

    public NodoBinarioa(int dato) {
        this.dato = dato;
        this.nodoDerecho = null;
        this.nodoIzquierdo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoBinarioa getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(NodoBinarioa nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    public NodoBinarioa getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(NodoBinarioa nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public boolean hoja() {
        return (nodoDerecho == null && nodoIzquierdo == null);
    }

    @Override
    public String toString() {
        return " el dato es :" + dato;
    }

}
