import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio31ConFunciones {

    public static void main(String[] args) {

        invertirPalabras("hola que tal estas?");

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void invertirPalabras(String frase) {

        List<String>  palabras = new ArrayList(Arrays.asList(frase.split(" ")));
        String fraseInvertida = "";
        for(int i = palabras.size() -1; i >= 0; i--){
            fraseInvertida = fraseInvertida + palabras.get(i) + " ";
        }
        fraseInvertida = fraseInvertida.trim();
        System.out.println(fraseInvertida);
    }

}
