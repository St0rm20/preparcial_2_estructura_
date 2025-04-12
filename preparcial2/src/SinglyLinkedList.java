
/**
*  List made by: Miguel Vargas
 *  <p>
 * Only JhancaGOD
*
 */
//ListaSimplementeEnlazada
public class SinglyLinkedList<T>  {

    private Nodo<T> head;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
    }

    public SinglyLinkedList(SinglyLinkedList<T> list) {
        this.head = null;
        addAll(list);
    }

    public T get(int i) {
        if(!indexIsValid(i)){
            return null;
        }
        Nodo<T> current = head;
        for (int j = 0; j < i; j++) {
            System.out.println("Start");
            System.out.println(j);
            current = current.getNext();
        }
        return current.getValue();
    }

    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    public T getLast() {
        if (head == null) {
            return null;
        }
        Nodo<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getValue();
    }

    /**
     * @param value

     */
    public void add(T value) {
        Nodo<T> nodo = new Nodo<>(value);
        if (head == null) {
            head = nodo;
            length++;
            return;
        }

        Nodo<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(nodo);
        length++;
    }

    public void add(T value, int index) {
        addBeforeElement(value, index);
    }

    public void addFirst(T value) {
        Nodo<T> nodo = new Nodo<>(value);
        nodo.setNext(head);
        head = nodo;
        length++;
    }

    public void addBeforeElement(T value, int position) {
        if(!indexIsValid(position)){
            return;
        }
        if (position == 0) {
            addFirst(value);
            return;
        }
        Nodo<T> nodo = new Nodo<>(value);

        Nodo<T> current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.getNext();
        }

        nodo.setNext(current.getNext());
        current.setNext(nodo);
        length++;
    }

    public void addAfterElement(T value, int position) {
        if(!indexIsValid(position)){
            return;
        }
        if (position == 0) {
            addFirst(value);
            return;
        }
        Nodo<T> nodo = new Nodo<>(value);
        Nodo<T> current = head;

        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        nodo.setNext(current.getNext());
        current.setNext(nodo);
        length++;
    }

    public void addAll(SinglyLinkedList<T> list) {
        Nodo<T> current = list.head;
        while (current != null) {
            add(current.getValue());
            current = current.getNext();
        }
        length += list.size();
    }


    public void addAll(SinglyLinkedList<T> list, int index){
        if(!indexIsValid(index)){
            return;
        }
        Nodo<T> current = list.head;
        while (current != null) {
            addBeforeElement(current.getValue(),index);
            index++;
            current = current.getNext();
        }
        length += list.size();

    }

    public void remove(int index){
        if(index==0){
            head = head.getNext();
            length--;
            return;
        }
        if(!indexIsValid(index)){
            return;
        }
        Nodo<T> nodo = head;
        for(int i = 0; i< index -1; i++){
            nodo = nodo.getNext();
        }
        nodo.setNext(nodo.getNext().getNext());
        length--;
    }

    public void remove(T t){
        if(head == null){
            return;
        }
        Nodo<T> current = head;
        if(current.getValue().equals(t)){
            head = head.getNext();
            length--;
        }
        while (current.getNext() != null) {
            if(current.getNext().getValue().equals(t)){
                current.setNext(current.getNext().getNext());
                length--;
            }
            current = current.getNext();
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.getNext();
        length--;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
            length--;
            return;
        }
        Nodo<T> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        length--;
    }

    public void clear() {
        head = null;
        length = 0;
    }

    public boolean contains(T t){

        Nodo<T> current = head;
        while(current!=null ){
            if(current.getValue().equals(t)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int length(){
        return length;
    }

    public int size(){
        return length;
    }

    public void show() {
        Nodo<T> current = head;
        String output = "";
        while (current != null) {
            output += (current.getNext() == null) ? current.getValue(): current.getValue()  + " -> " ;
            current = current.getNext();
        }
        System.out.println(output);
    }


    private boolean indexIsValid(int index) {
        if (index >= 0 && index < length) {
            return true;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");

    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
