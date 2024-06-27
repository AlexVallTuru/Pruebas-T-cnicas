import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio23 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(0,1,2,3,4));
        desifrar(lista);
    }

    public static void desifrar(List<Integer> lista) {

        List<String> letras = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "ñ", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

        String frase = "";
        for(int i =0; i < lista.size(); i++){
            frase = frase.concat(letras.get(lista.get(i)));

        }

        System.out.print(frase);
    }

}
