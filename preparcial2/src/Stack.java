public class Stack<T>{
    Nodo<T> head;
    int length;

    public Stack() {
        head = null;
    }

    public void push(T value) {
        Nodo<T> nodo = new Nodo<>(value);
        if(head == null) {
            head = nodo;
        }
        else {
            nodo.setNext(head);
            head = nodo;
        }
        length++;
    }

    public T pop() {
        if(head == null) {
            return null;
        }
            T value = head.getValue();
            head = head.getNext();
            length--;

        return value;
    }

    public T peek() {
        if(head == null) {
            return null;
        }
        return head.getValue();
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

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
