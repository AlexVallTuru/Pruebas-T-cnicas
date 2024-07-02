public class ejercicio31again {

    public static void main(String[] args) {

        invertirPalabras("hola que tal estas?");

    }

    public static void invertirPalabras(String frase) {

        char[] palabrasOrdenadas = frase.toCharArray();
        char[] palabrasDesordenadas = new char[palabrasOrdenadas.length];
        int contador = 0;
        int end = palabrasOrdenadas.length;

        for (int i = palabrasOrdenadas.length - 1; i >= 0; i--) {

            if (palabrasOrdenadas[i] == ' ' || i == 0) {

                int start = (i == 0) ? i : i + 1;

                for (int j = start; j < end; j++) {

                    palabrasDesordenadas[contador] = palabrasOrdenadas[j];
                    contador++;

                }
                end = i;
                if (i != 0) {
                    contador++;
                    palabrasDesordenadas[contador] = ' ';
                }
            }

        }

    }

}
