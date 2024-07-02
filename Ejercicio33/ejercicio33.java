import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ejercicio33 {

    public static void main(String[] args) {

        contarPalabras("Hola -como esta_ bien bien bien");

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void contarPalabras(String frase) {

        frase = frase.replace("-", "");
        frase = frase.replace("_", "");
        List<String> listaPalabras = new ArrayList(Arrays.asList(frase.split(" ")));
        listaPalabras = listaPalabras.stream().map(String::toLowerCase).collect(Collectors.toList());
        Map<String, Integer> contadorPalabras = new HashMap<>();

        for (String palaraula : listaPalabras) {
            if (contadorPalabras.containsKey(palaraula)) {
                contadorPalabras.put(palaraula, (contadorPalabras.get(palaraula) + 1));
            } else {
                contadorPalabras.put(palaraula, 1);
            }

        }
        for (Map.Entry<String, Integer> entry : contadorPalabras.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
