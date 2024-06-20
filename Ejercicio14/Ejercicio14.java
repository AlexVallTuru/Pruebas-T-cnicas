import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
//import java.util.stream.Collector;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        System.out.print(esPalindromo("reconocer"));
    }

    public static boolean esPalindromo(String name){
    
        char[] nameCaracters = new char[name.length()];
        char[] nameCaractersInverso = new char[name.length()];

        for(int i = 0; i < name.length(); i++){
            nameCaracters[i] = name.charAt(i);
        }
        for(int i = (name.length()-1); i >= 0; i--){
            nameCaractersInverso[i] = name.charAt(i);
        }

        if (String.valueOf(nameCaracters).equalsIgnoreCase(String.valueOf(nameCaractersInverso))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPalindromoConFunciones(String name){

        name.toLowerCase();

        ArrayList<Character> letrasSeparadas = new ArrayList<>();

        for(int i = 0; i < name.length(); i++){
            letrasSeparadas.add(name.charAt(i));
        }
    
        ArrayList<Character> letrasSeparadas2 = new ArrayList<>(letrasSeparadas);
        Collections.reverse(letrasSeparadas2);

        return letrasSeparadas.equals(letrasSeparadas2);
    } 

}
