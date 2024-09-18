package servicioperros;

import datos.Perros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerros {
    private ArrayList<Perros> listaPerros;
    private Scanner scanner;

    public ServicioPerros() {
        this.listaPerros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    Perros p;

    public void agregarPerro() {
        String respuesta;
        do {
            p = new Perros();
            System.out.print("Ingresa una raza de perro: ");
            p.setRaza(scanner.nextLine());
            listaPerros.add(p);
            System.out.print("¿Deseas agregar otra raza de perro? (s/n): ");
            respuesta = scanner.nextLine();         
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public void mostrarPerros() {
        System.out.println("Las razas de perros guardadas son:");
        for (Perros perro : listaPerros) {
            System.out.println(perro.getRaza());
        }
    }
    
    
    
    public void buscarYEliminarPerro() {
        
        System.out.print("Ingresa la raza de perro que deseas eliminar: ");
        String razaBuscada = scanner.nextLine();
        Iterator it = listaPerros.iterator(); 
        boolean perroEncontrado = false;
        while (it.hasNext()) { 
            
            if (it.next().equals(razaBuscada)) {
                it.remove();
                perroEncontrado = true;
                break;
            }
        }
        if (perroEncontrado = true){
            System.out.println("El perro de la raza " + razaBuscada + " Ha sido eliminado.");
        }
        else{
            System.out.println("El perro de la raza " + razaBuscada + " No se encuentra en la lista.");
        }
        //Collections.sort();
        System.out.println("Lista de razas de perros ordenada:");
        for (Perros raza : listaPerros) {
            System.out.println(raza.getRaza());
        }
    }
    
}


