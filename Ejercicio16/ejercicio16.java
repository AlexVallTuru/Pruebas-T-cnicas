public class ejercicio16 {

    public static void main(String[] args) {

        String fraseImprimir = "Hola soy Alex Vall WEB";

        String[] fraseImprimirLista = fraseImprimir.split(" ");

        int longitudMaximaFrase = calcularPalabraMasLargar(fraseImprimirLista);

        System.out.print("*".repeat(longitudMaximaFrase+4) );
        for (String frase : fraseImprimirLista) {
            int cantidadEspacios = calcularCantidadEspacios(frase, longitudMaximaFrase);
            System.out.print("\n* " + frase + " ".repeat(cantidadEspacios) + " *");
        }
        System.out.print("\n" + "*".repeat(longitudMaximaFrase+4) );
    }

    public static int calcularPalabraMasLargar(String[] fraseImprimirLista){

        int longitudMaximaFrase = 0;
        for(String frase:fraseImprimirLista) {
            if (frase.length() > longitudMaximaFrase) {
                longitudMaximaFrase = frase.length();        
            }                
        }
        return longitudMaximaFrase;
    }

    public static int calcularCantidadEspacios(String frase, int longitudMaximaFrase) {

        int cantidadEspacios = 0;
        cantidadEspacios = longitudMaximaFrase - frase.length();
        return cantidadEspacios;
    }

}
