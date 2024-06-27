
public class ejercicio21 {

    public static void main(String[] args) {
        
        generaMatriz(4);

    }

    public static void generaMatriz(int numeroDimension){

        int[][] matrizBidereccional = new int[numeroDimension][numeroDimension];
        int count = 0;

        System.out.print("[");
        for(int i = 0; i < matrizBidereccional.length; i++) {
            System.out.print("\n\t[");
            for(int j = 0; j < matrizBidereccional.length; j++){
                count++;
                matrizBidereccional[i][j] = count;
                if(j < matrizBidereccional[i].length -1){
                    System.out.print(" " +matrizBidereccional[i][j] + ", ");    
                } else {
                    System.out.print(" " +matrizBidereccional[i][j] + " ");
                }
                
            }
            System.out.print("]");
            if (i < matrizBidereccional.length -1){
                System.out.print(",");
            }
        }
        System.out.print("\n]");
    }
}