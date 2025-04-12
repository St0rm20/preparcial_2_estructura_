public class Punto4 {

    public static String representacionBinaria(int numero){
        Stack <String> stack = new Stack<>();

        while(numero > 0){
            int residuo = numero % 2;
            stack.push(String.valueOf(residuo));
            numero = numero / 2;
        }

        String binario = "";
        while(!stack.isEmpty()){
            binario += stack.pop();
        }
        return binario;
    }


    public static void main(String[] args) {

        int numero = 255;
        String binario = representacionBinaria(numero);
        System.out.println("El numero " + numero + " en binario es: " + binario);
    }
}
