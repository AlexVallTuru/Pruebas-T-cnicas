import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ejercicio32 {

    public static void main(String[] args) {

        crearFraseSuperiorCuatroCaracteres("Hola com estas el pati es el meu aniversari!");

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void crearFraseSuperiorCuatroCaracteres(String frase) {

        List<String> listaPalabras = new ArrayList(Arrays.asList(frase.split(" ")));
        List<String> listaPalabrasSuperioresACutro = new ArrayList<>();
        listaPalabrasSuperioresACutro = listaPalabras.stream().filter(p -> p.length() >= 4)
                .collect(Collectors.toList());
        String listaPalabrasSuperioresACutroStr = "";

        for (String palabra : listaPalabrasSuperioresACutro) {
            listaPalabrasSuperioresACutroStr = listaPalabrasSuperioresACutroStr + palabra + " ";
        }
        listaPalabrasSuperioresACutroStr = listaPalabrasSuperioresACutroStr.trim();
        System.out.println("\n" + listaPalabrasSuperioresACutroStr);

    }

}
