
public class ejercicioOptimizado40 {

    public static void main(String[] args) {
        romanoAEntero("CDXIV");
    }

    public static void romanoAEntero(String numeroRomano) {

        String[] simbolosRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] valoresDecimales = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        int numeroDecimal = 0;
        char[] numerosRomanosIndependientes = numeroRomano.toCharArray();
        int lenNumRomanos = numerosRomanosIndependientes.length - 1;
        int lenSimbolosRomanos = simbolosRomanos.length - 1;

        for (int i = lenNumRomanos; i >= 0; i--) {
            int posNumeroRomanoActual = -1;
            int posNumeroRomanoAnterior = -1;
            for (int j = 0; j < simbolosRomanos.length; j++) {
                if (String.valueOf(numerosRomanosIndependientes[i]).equals(simbolosRomanos[j])) {
                    posNumeroRomanoActual = j;
                    break;
                }
            }
            if (i - 1 >= 0) {
                for (int k = 0; k <= lenSimbolosRomanos; k++) {
                    if (String.valueOf(numerosRomanosIndependientes[i - 1]).equals(simbolosRomanos[k])) {
                        posNumeroRomanoAnterior = k - 1;
                        break;
                    }
                }
            }
            if (posNumeroRomanoAnterior == -1) {
                numeroDecimal = numeroDecimal + valoresDecimales[posNumeroRomanoActual];
            } else if (valoresDecimales[posNumeroRomanoAnterior] < valoresDecimales[posNumeroRomanoActual]) {
                numeroDecimal = numeroDecimal + valoresDecimales[posNumeroRomanoAnterior];
                i--;
            } else {
                numeroDecimal = numeroDecimal + valoresDecimales[posNumeroRomanoActual];
            }
        }

        System.out.println(numeroDecimal);
    }

}
