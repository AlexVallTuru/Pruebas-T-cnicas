public class Ejercicio51Optimizado {

    public static void main(String[] args) {
        generarDiamante(16); // Puedes cambiar el tamaño aquí para probar diferentes valores
    }

    public static void generarDiamante(int tamanio) {
        if (tamanio < 3) {
            System.out.println("No se puede crear un diamante con longitud de 2 o inferior....");
            return;
        }

        if (tamanio % 2 == 0) {
            tamanio--; // Ajustar a impar si es necesario
        }

        int cantidadEspacios = (tamanio - 1) / 2;

        // Parte superior del diamante
        for (int i = 0; i <= cantidadEspacios; i++) {
            imprimirLinea(cantidadEspacios - i, 2 * i + 1);
        }

        // Parte inferior del diamante
        for (int i = cantidadEspacios - 1; i >= 0; i--) {
            imprimirLinea(cantidadEspacios - i, 2 * i + 1);
        }
    }

    public static void imprimirLinea(int cantidadEspacios, int cantidadEstrellas) {
        StringBuilder linea = new StringBuilder();

        for (int i = 0; i < cantidadEspacios; i++) {
            linea.append(" ");
        }
        for (int i = 0; i < cantidadEstrellas; i++) {
            linea.append("*");
        }

        System.out.println(linea);
    }
}