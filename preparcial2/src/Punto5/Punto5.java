package Punto5;

public class Punto5 {

    public static boolean esBalanceada(String cadena) {
        MiPila pila = new MiPila();

        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.estaVacia()) {
                    return false;
                }
                char tope = pila.pop();
                if (!esPar(tope, c)) {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    private static boolean esPar(char a, char b) {
        return (a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']');
    }

}

