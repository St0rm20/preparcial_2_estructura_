package Punto5;


public  class MiPila {
    private Nodo cima;

    private static class Nodo {
        char valor;
        Nodo siguiente;

        Nodo(char valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    public void push(char c) {
        Nodo nuevo = new Nodo(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public char pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        char valor = cima.valor;
        cima = cima.siguiente;
        return valor;
    }

    public boolean estaVacia() {
        return cima == null;
    }
}