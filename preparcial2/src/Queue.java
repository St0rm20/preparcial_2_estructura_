public class Queue<T>{

    protected Nodo<T> start;
    protected Nodo<T> end;
    protected int length;

    public Queue() {
        length = 0;
        start = null;
        end = null;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(T value) {
        Nodo<T> node = new Nodo<>(value);
        if (isEmpty()) {
            start = node;
            end = node;
        }else {
            end.setNext(node);
            end = node;
        }
        length++;
    }

    public void removeFirst(){
        if (isEmpty()) {
            return;
        }
        start = end.getNext();
        length--;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Nodo<T> node = start;
        start = start.getNext();
        length--;
        return node.getValue();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return start.getValue();
    }

    public boolean contains(T value) {
        if (isEmpty()) {
            return false;
        }
        Nodo<T> node = start;
        while (node.getNext() != null) {
            if (node.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return length;
    }

    public void clear(){
        start = null;
        end = null;
        length = 0;
    }

    public Nodo<T> getStart() {
        return start;
    }

    public void setStart(Nodo<T> start) {
        this.start = start;
    }

    public Nodo<T> getEnd() {
        return end;
    }

    public void setEnd(Nodo<T> end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void show() {
        Nodo<T> current = start;
        String output = "";
        while (current != null) {
            output += (current.getNext() == null) ? current.getValue(): current.getValue()  + " -> " ;
            current = current.getNext();
        }
        System.out.println(output);
    }
}
