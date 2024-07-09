import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio37 {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList(Arrays.asList(4,6,8,10,13));
        
        System.out.println(sonParesMetodosDeLenguaje(numeros));
        System.out.println(sonParesEstructuraDeControl(numeros));

    }

    public static boolean sonParesMetodosDeLenguaje(ArrayList<Integer> listaNumeros) {

        for(int numero:listaNumeros){
            if (numero % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sonParesEstructuraDeControl(ArrayList<Integer> listaNumeros) {

        for(int numero:listaNumeros){
            while (numero >= 2) {
                numero = numero -2 ;
            }
            if (numero != 0) {
                return false;
            }
        }
        return true;       
    }
}
