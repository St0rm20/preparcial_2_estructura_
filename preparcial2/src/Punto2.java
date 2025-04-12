import java.util.LinkedList;

public class Punto2 {

    public static boolean esPrimo(int numero){
        if(numero < 2){
            return false;
        }
        if(numero == 2){
            return true;
        }

        for(int i = 2; i <= Math.pow((double) numero, (double) 1 /2); i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
//El stack es una clase propia
    public static Queue<Integer> getQueue(Stack<Integer> stack){
        Queue<Integer> queue = new Queue<>();//El queue es clase propia
        Queue<Integer> queue2 = new Queue<>();
        while(!stack.isEmpty()){
            int numero = stack.pop();
            System.out.println(esPrimo(numero)+" numero: "+numero);
            if(esPrimo(numero)){
                queue.push(numero);
            }else {
                queue2.push(numero);
            }
        }

        while(!queue2.isEmpty()){
            queue.push(queue2.pop());
        }
        return queue;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        Queue<Integer> queue = getQueue(stack);
        queue.show();
    }
}
