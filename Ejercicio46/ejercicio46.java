//package Ejercicio46;

public class ejercicio46 {

    public static void main(String[] args) {

        calificar(8.2); // Notable

    }

    public static void calificar(double nota) {

        if (nota < 3) {
            System.out.println("Deficiente");
        } else if (nota > 3 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota > 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota > 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }

}
