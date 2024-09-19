package servicioperros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerros {

    private ArrayList<String> listaPerros;
    private Scanner scanner;

    public ServicioPerros() {
        this.listaPerros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void agregarPerro() {
        String respuesta;
        do {
            System.out.print("Ingresa una raza de perro: ");
            listaPerros.add(scanner.next());
            System.out.print("¿Deseas agregar otra raza de perro? (s/n): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarPerros() {
        System.out.println("Las razas de perros guardadas son:");
        for (String perro : listaPerros) {
            System.out.println(perro);
        }
    }

    public void buscarYEliminarPerro() {
        System.out.print("Ingresa la raza de perro que deseas eliminar: ");
        String razaBuscada = scanner.next();
        Iterator it = listaPerros.iterator();
        boolean perroEncontrado = false;
        String p;
        while (it.hasNext()) {
            p = (String) it.next();
            if (p.equalsIgnoreCase(razaBuscada)) {
                it.remove();
                perroEncontrado = true;
                break;
            }
        }
        if (perroEncontrado) {
            System.out.println("El perro de la raza " + razaBuscada + " Ha sido eliminado.");
        } else {
            System.out.println("El perro de la raza " + razaBuscada + " No se encuentra en la lista.");
        }
        Collections.sort(listaPerros);
        System.out.println("Lista de razas de perros ordenada:");
        for (String raza : listaPerros) {
            System.out.println(raza);
        }
    }
}
