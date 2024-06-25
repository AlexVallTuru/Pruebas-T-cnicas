import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio17 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
        ArrayList<String> parrafo = new ArrayList(Arrays.asList("Hola, soy Víctor Robles WEB","Me gusta programar","Y soy desarrollador web"));
        ArrayList<String> palabras = new ArrayList<>();

        for(int i = 0; i < parrafo.size(); i++){
            palabras.addAll(Arrays.asList(parrafo.get(i).split(" ")));    
        }

        System.out.print(palabras.size());
    }

}
