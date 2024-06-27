
public class ejercicio22 {
    
    public static void main(String[] args) {
        
        invertirTexto("Hola");

    }

    public static void invertirTexto(String texto){

        char[] textoPorCaracter = texto.toCharArray();
        char[] textoInvertidoPorCharacter = new char[textoPorCaracter.length];
        int contadorInverso = textoPorCaracter.length;


        for(int i = 0; i < textoPorCaracter.length; i++){
            textoInvertidoPorCharacter[i] = textoPorCaracter[contadorInverso-1];
            contadorInverso = contadorInverso-1;
        }

        System.out.print(textoInvertidoPorCharacter);

    }

}
