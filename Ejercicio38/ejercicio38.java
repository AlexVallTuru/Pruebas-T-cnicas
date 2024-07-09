
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejercicio38 {
    
    final static int divisor = 2;

    public static void main(String[] args) {
        
        aBinario(10);
        
    }

    public static void aBinario(int dividendo){

        int residuo;
        List<Integer> numBinario = new ArrayList<>();

        while (dividendo > 0) {
            residuo = dividendo % divisor;
            dividendo = dividendo / divisor;
            numBinario.add(residuo);            
        }
        //String numBinarioFinal ="";
        StringBuilder numBinarioFinal = new StringBuilder();
        Collections.reverse(numBinario);
        for(int num:numBinario){
            //numBinarioFinal = numBinarioFinal.concat((String.valueOf(num)));
            numBinarioFinal.append(num);
        }
        System.out.println(numBinarioFinal.toString());

    }

}
