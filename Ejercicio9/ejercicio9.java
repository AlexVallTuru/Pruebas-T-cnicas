import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] arg){
       /**  ArrayList<Integer> listadoNumeros = new ArrayList<>();
        
        listadoNumeros.add(1);
        listadoNumeros.add(2);
        listadoNumeros.add(3);
        listadoNumeros.add(4);
        listadoNumeros.add(5);
**/

        ArrayList<Integer> listadoNumeros = new ArrayList<>(Arrays.asList(2, 13, 6, 15));
        int sumaPares = 0;
        for(int numero:listadoNumeros) {
            if(numero%2== 0) {
                sumaPares += numero;
            }
        }
        System.out.print(sumaPares);
    }
}
