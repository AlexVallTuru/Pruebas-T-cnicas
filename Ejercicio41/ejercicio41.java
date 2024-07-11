
public class ejercicio41 {

    public static void main(String[] args) {

        invertirNumeros(45);

    }

    public static void invertirNumeros(int numero) {
        /*
         * String numeroEditado = String.valueOf(numero);
         * 
         * if (numeroEditado.contains("-")) {
         * numeroEditado = numeroEditado.replace("-", "");
         * }else {
         * numeroEditado = "-" + numeroEditado;
         * }
         * 
         * numero = Integer.parseInt(numeroEditado);
         * System.out.println(numero);
         */

        if (numero < 0) {
            numero = -numero;
        } else {
            numero = +numero;
        }
        System.out.println(numero);
    }

}
