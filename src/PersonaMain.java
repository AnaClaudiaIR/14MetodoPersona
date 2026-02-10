import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonaMain {
    public static void main(String[] args) {
        //Creación lista de objetos
        List<Persona> listaPersonas = new ArrayList<>();

        //Agregar las personas
        Persona persona = new Persona("Laura",30);
        listaPersonas.add(persona);
        Persona persona2 = new Persona("Gabriela",7);
        listaPersonas.add(persona2);
        Persona persona3 = new Persona("Luis",90);
        listaPersonas.add(persona3);
        Persona persona4 = new Persona("Tania",16);
        listaPersonas.add(persona4);
        Persona persona5 = new Persona("Víctor",36);
        listaPersonas.add(persona5);

        System.out.println("---Lista Personas---");
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println(" ");
        }

        //Iterador para eliminar a los menores de 18 años
        Iterator<Persona> iterator = listaPersonas.iterator();
        while (iterator.hasNext()) {
            Persona p = iterator.next();
            if (p.getEdad() < 18) {
                iterator.remove();
            }
        }

        System.out.println("---Lista Personas (mayores de edad)---");
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Edad: " + p.getEdad());
            System.out.println(" ");
        }
    }
}
