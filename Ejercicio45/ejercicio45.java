import java.util.ArrayList;
import java.util.List;

public class ejercicio45 {

    public static void main(String[] args) {
        
        List<Integer> listaNumeros = List.of(1, 1, 2, 2, 3, 4, 5, 5, 5, 6);

        eliminarDuplicados(listaNumeros);
        
    }

    public static void eliminarDuplicados(List<Integer> listaNumeros){

        List<Integer> sinDuplicados = new ArrayList<Integer>();

        for(int numero:listaNumeros){
            if(!sinDuplicados.contains(numero)){
                sinDuplicados.add(numero);
            }
        }

        sinDuplicados.forEach(numero -> System.out.println(numero));

    }

}