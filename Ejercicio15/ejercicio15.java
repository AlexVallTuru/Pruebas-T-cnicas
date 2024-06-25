import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio15 {

    public static void main(String[] args) {
        
        ArrayList<String> listaPalabras = new ArrayList<>(Arrays.asList("Hola", "soy","Àlex Vall","y", "hoy", "voy", "a", "ir", "a", "ingles"));

        ordenar(listaPalabras);

        for(String palabra:listaPalabras){
            System.out.print(palabra);
        }

        
    }

    public static ArrayList<String> ordenarProgramacionFuncional(ArrayList<String> listaPalabras) {
        
        listaPalabras.sort((p1, p2) -> Integer.compare(p1.length(), p2.length()));  
        
        return listaPalabras;
    }
    
    public static ArrayList<String> ordenar(ArrayList<String> listaPalabras) {
        
        ArrayList<String> listaPalabrasOrdenadas = new ArrayList<>();

        String tmp = "";
        for (int i = 0; i < listaPalabras.size(); i++) {
            for(int j = 0; j < listaPalabras.size(); j++){
                if(listaPalabras.get(i).length() == listaPalabras.get(j).length() ){
                    listaPalabrasOrdenadas.add(listaPalabras.get(i));
                }
                else if (listaPalabras.get(i).length() < listaPalabras.get(j).length()) {
                    listaPalabras.get(i);
                    listaPalabrasOrdenadas.add(listaPalabras.get(j));
                }
            }
        }
        
        return listaPalabrasOrdenadas;
    }
}