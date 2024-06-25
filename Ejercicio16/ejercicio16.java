import java.util.Arrays;

public class ejercicio16 {
    
    private static final String ArrayList = null;

    public static void main(String[] args) {

        String fraseImprimir  = "Hola soy Àlex Vall WEB";

        String[] fraseImprimirLista = fraseImprimir.split(" ");
        
        System.out.print("********");
        
        int longitudMaximaFrase = 0;

        for(String frase:fraseImprimirLista) {
            if (frase.length() > longitudMaximaFrase) {
                longitudMaximaFrase = frase.length();        
            }                
        }
        for(String frase:fraseImprimirLista){

            if (frase.length() != longitudMaximaFrase ) {
                int cantidadEspacios = longitudMaximaFrase - frase.length();
                System.out.print("\n* " + frase + " ".repeat(cantidadEspacios -1)  +" *");
            }
            else
            {
                System.out.print("\n* " + frase + " *");
            }

        }

        System.out.print("\n********");

    }

}
