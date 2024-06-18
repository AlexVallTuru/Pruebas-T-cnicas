//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Ejercicio12 {

    public static void main(String[] args) {

        String frase = ("El perro de san roque no tiene el rabo porque es un perro muy muy malo").toLowerCase();

        String[] palabras = frase.split(" ");

        Map<String, Integer> mapPalabras = contarPalabras(palabras);

        System.out.println(mapPalabras);
    }

    public static Map<String, Integer> contarPalabras(String[] palabras) {

        //Map<String, Integer> mapPalabras = new HashMap<>();

        //LinkedHashMap mantiene el orden de inserción a diferencia de HashMap
        Map<String, Integer> mapPalabras = new LinkedHashMap<>();


        for (String palabra : palabras) {
            if (!mapPalabras.containsKey(palabra)) {
                mapPalabras.put(palabra, 1);
            } else {
                mapPalabras.put(palabra, mapPalabras.get(palabra)+1);
            }

        }
        return mapPalabras;
    }

}