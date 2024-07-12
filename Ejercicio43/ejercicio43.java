//package Ejercicio43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio43 {

    public static void main(String[] args) {

        // Crear un array de arrays
        ArrayList<ArrayList<String>> coleccion = new ArrayList<ArrayList<String>>();
        ArrayList<String> subColeccion1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> subColeccion2 = new ArrayList<String>(Arrays.asList("Z", "V", "K", "S"));
        ArrayList<String> subColeccion3 = new ArrayList<String>(Arrays.asList("F", "G", "O", "E"));

        coleccion.add(subColeccion1);
        coleccion.add(subColeccion2);
        coleccion.add(subColeccion3);

        puedeFormarPalabra("PERRO", coleccion); // false
        puedeFormarPalabra("CASO", coleccion); // true

    }

    public static boolean puedeFormarPalabra(String palabraBuscar, ArrayList<ArrayList<String>> colecciones) {

        char[] palabra = palabraBuscar.toCharArray();
        boolean cotienePalabra = false;

        for (char caracter : palabra) {
            for (ArrayList<String> subColeccion : colecciones) {
                if (subColeccion.contains(Character.toString(caracter))) {
                    cotienePalabra = true;
                    break;
                }
            }
            if (!cotienePalabra) {
                System.out.println(cotienePalabra);
                return cotienePalabra;
            }
        }
        System.out.println(true);
        return cotienePalabra;
    }
}
