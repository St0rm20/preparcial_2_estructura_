public class Punto7 {


    public void insertarDespuesSuma(SinglyLinkedList<Integer> lista) {

        insertarDespuesSuma(lista.getHead(), 0);
    }
    public int insertarDespuesSuma( Nodo<Integer> nodo, int suma) {

        if(nodo == null) {
            return 0;
        }
        int sumaTotal = nodo.getValue() + insertarDespuesSuma(nodo.getNext(), suma + nodo.getValue());
        if (nodo.getValue() == sumaTotal) {
            Nodo<Integer> nuevo = new Nodo<>(2);
            nuevo.setNext(nodo.getNext());
            nodo.setNext(nuevo);
        }

        return sumaTotal;
    }


    public static void main(String[] args) {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.show();
        Punto7 punto7 = new Punto7();
        punto7.insertarDespuesSuma(lista);
        lista.show();
    }
}
