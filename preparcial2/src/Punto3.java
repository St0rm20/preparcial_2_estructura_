import java.util.LinkedList;

public class Punto3 {

    public static Queue<Persona> quitarPersonasEdad(Queue<Persona> personas) {
        Queue<Persona> personasEdad = new Queue<>();
        while (!personas.isEmpty()) {
            Persona persona = personas.pop();
            if(!(persona.edad() >= 30 && persona.edad() <= 50)) {
                personasEdad.push(persona);
            }
        }
        return personasEdad;
    }

    public static void main(String[] args) {
        Queue<Persona> personas = new Queue<>();
        personas.push(new Persona("Jhanca",18,"M"));
        personas.push(new Persona("Robinson",29,"M"));
        personas.push(new Persona("William",39,"M"));
        personas.push(new Persona("Jorge",50,"M"));
        personas.push(new Persona("Luisa",28,"F"));
        personas.push(new Persona("Candela",43,"M"));

        personas.show();
         personas = quitarPersonasEdad(personas);
         personas.show();

    }
}
