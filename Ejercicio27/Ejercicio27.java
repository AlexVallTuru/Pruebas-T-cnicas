import java.util.Arrays;
import java.util.List;

public class Ejercicio27 {

    public static void main(String[] args) {

        System.out.println(buscarPalabra("Hola como estas", "holA"));

    }

    public static boolean buscarPalabra(String cadena, String palabra) {

        List<String> palabras = Arrays.asList(cadena.split(" "));

        for (String palabraArray : palabras) {

            if (palabraArray.equalsIgnoreCase(palabra)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

}
