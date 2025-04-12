public class Punto1 {


    public static <T> SinglyLinkedList<T> invertirListaConPila(SinglyLinkedList<T> list) {
        SinglyLinkedList<T> listaInversa = new SinglyLinkedList<>();
        Stack<T> aux = new Stack<>(); //el stack es clase propia, no de util XD
        Nodo<T> actual = list.getHead();
        while (actual != null) {
            aux.push(actual.getValue());
            actual = actual.getNext();
        }
        while (!aux.isEmpty()) {
            listaInversa.add(aux.pop());
        }
        return listaInversa;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.show();
        SinglyLinkedList listaInversa = invertirListaConPila(lista);
        listaInversa.show();
    }

}
