public class ejercicio19 {
  
    public static void main(String[] args) {
        
        dados();

    }

    public static void dados(){

        int resultadoDadoUno = (int) ((Math.random()*6) +1);
        int resultadoDadoDos = (int) ((Math.random()*6) +1);
        
        System.out.print("El resultado de los dados es el siguiente: " + (resultadoDadoUno + resultadoDadoDos));
    }
}
