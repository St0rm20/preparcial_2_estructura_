

public class Pila<T> {

    private Nodo<T> cima;
    private int tamano;

    public Pila(){
        this.cima = null;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return cima==null;
    }

    /**
     * Inserta un elemento en la Pila - push
     * @param dato elemento a guardar en la pila
     */
    public void push(T dato) {

        Nodo<T> nodo = new Nodo<>(dato);
        nodo.setNext(cima);
        cima = nodo;

        tamano++;
    }

    /**
     * Retorna y elimina el elemento que est� en la cima de la Pila - pop
     * @return Elemento de la cima
     */
    public T pop() {

        if(estaVacia()) {
            throw new RuntimeException("La Pila est� vac�a");
        }

        T dato = cima.getValue();
        cima = cima.getNext();
        tamano--;

        return dato;
    }

    /**
     * Borra completamente la Pila
     */
    public void borrarPila() {
        cima = null;
        tamano = 0;
    }

    /**
     * @return the cima - peek
     */
    public T obtenerCima() {
        return cima.getValue();
    }

    /**
     * @return the cima - peek
     */
    public Nodo<T> getCima() {
        return cima;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }


    /**
     * Imprime una pila en consola
     */
    public void imprimir() {
        Nodo<T> aux = cima;
        while(aux!=null) {
            System.out.print(aux.getValue()+"\t");
            aux = aux.getNext();
        }
        System.out.println();
    }

}
