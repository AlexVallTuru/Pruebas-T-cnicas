import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    
    public static void main(String[] args) {

        ArrayList<String> letrasDni = new ArrayList<>(Arrays.asList("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", 
                "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "T"));

        //Scanner sc = new Scanner(System.in);

        System.out.print("El numero de su dni: 25439343\n");
        //int numeroDni = sc.nextInt();
        int numeroDni = 25439343;
        int numeroLetraDni = numeroDni%23;

        System.out.print("La letra de este dni es la siguiente: " + letrasDni.get(numeroLetraDni));
            
        }
    }
