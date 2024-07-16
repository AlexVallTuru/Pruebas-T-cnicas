//package Ejercicio50;

public class ejercicio50 {

    public static void main(String[] args) {
  
        convertirTemperatura("29°C");  // Devuelve: "84.20°F"
        convertirTemperatura("77°F");  // Devuelve: "25.00°C"

    }

    public static void convertirTemperatura(String temperatura){
        double temperaturaNum = 0;
        if(temperatura.contains("F")){
            temperatura = temperatura.split("°")[0];
            //Al poner 5.0 el resultado sera un float y se calculara la division con decimales
            temperaturaNum = (Integer.parseInt(temperatura)-32)*(5.0/9);
            System.out.println(temperaturaNum + "C°"  );
        }else if(temperatura.contains("C")){
            temperatura = temperatura.split("°")[0];
            temperaturaNum = (Integer.parseInt(temperatura))* 1.80 + 32 ;                         
            System.out.println(temperaturaNum + "F°"  );
        }else {
            System.out.println("Introduce la temperatura con su formato correcto");
        }

    }

}
