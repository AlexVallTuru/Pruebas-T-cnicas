
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class ejercicio36 {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList(Arrays.asList(1, 2, 3, 4, 1, 2));

        encontrarParejasConSuma(numeros, 5);

    }

    public static void encontrarParejasConSuma(List<Integer> numeros, int resultado) {

        //Set no permite duplicados.
        Set<ArrayList<Integer>> listaPosibles = new HashSet<>();

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i; j < numeros.size(); j++) {
                ArrayList<Integer> par = new ArrayList<>();
                if ((numeros.get(i) + numeros.get(j)) == resultado) {
                    par.add(numeros.get(i));
                    par.add(numeros.get(j));
                    Collections.sort(par);
                    listaPosibles.add(par);
                }
            }
        }

        System.out.println(listaPosibles);

    }

}
