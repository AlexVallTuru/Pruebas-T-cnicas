//package Ejercicio51;

public class ejercicio51 {

    public static void main(String[] args) {

        generarDiamante(11);

    }

    public static void generarDiamante(int tamanio) {

        /*
         * 1. Calcular la cantidad de espacios iniciales
         * 2. Calcular la cantidad de estrellas iniciales
         * (5)
         *   *
            *** 
           *****
            *** 
             * 
         */
        int cantidadEspacios = 0;
        int cantidadEstrellas = 0;
        StringBuilder estrellas = new StringBuilder();
        StringBuilder espacios = new StringBuilder();
         //El numero 3 es el minimo para hacer la piramide mas pequeña
        if (!(tamanio < 3)) {
            if (parImpar(tamanio).equals("par")) {
                tamanio = tamanio - 1;
                cantidadEspacios = (tamanio-1)/2;
              
            } else {
                cantidadEspacios = (tamanio-1)/2;
              
            }

            for(int i = cantidadEspacios; i > 0; i--){
                for(int j = 0; j < i; j++){
                    espacios.append(" ");
                }
                cantidadEstrellas =  tamanio/2 - i +1;
                //System.out.println("cantidad de estrellas a añadir esta vuelta es de" + cantidadEstrellas);
                for(int x = 0; x < cantidadEstrellas; x++){
                    estrellas.append("*");
                }
                System.out.print(espacios);
                System.out.print(estrellas + "\n");
                espacios.setLength(0);
                estrellas.setLength(0);
                i = i-1;
            }

        } else {
            System.out.println("No se puede crear un diamante con longitud de 2 o inferior....");
        }
    }

    public static String parImpar(int tamanio) {

        if (tamanio % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }

    }

}
