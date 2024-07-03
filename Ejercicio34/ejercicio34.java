//agrupar([7.2, 5.3, 7.4], Math.floor)  
// Devuelve: { 7: [7.2, 7.4], 5: [5.3] }
 
//agrupar(["uno", "dos", "tres", "cuatro"], "length") 
// Devuelve: { 3: ["uno", "dos", "tres"], 6: ["cuatro"] }
 
//agrupar([{nombre: "victor", edad: 33}, {nombre: "paco", edad: 44}], "edad") 
// Devuelve: { 33: [{edad: 33}], 44: [{edad: 44}] }

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ejercicio34 {

    public static void main(String[] args) {
  
        List<Double> numeros = Arrays.asList(7.2, 5.3, 7.4);
        Map<Integer, List<Double>> resultatsNumeros = agrupar(numeros, d -> (int) Math.floor(d));
        System.out.println(resultatsNumeros);

        List<String> longitud = Arrays.asList("uno", "dos", "tres", "cuatro");
        Map<Integer, List<String>> resultadosLenght = agrupar(longitud, d -> (int) d.length());
        //Map<Integer, List<String>> resultadosLenght = agrupar(longitud, String::length);
        System.out.println(resultadosLenght);

        Person person1 = new Person("Alex Vall",33);
        Person person2 = new Person("Miquel Enrich",44);
        Person person3 = new Person("Rosa Melano",44);
        List<Person> personas = Arrays.asList(person1,person2,person3); 
        Map<Integer, List<Person>> resultatsEdads = agrupar(personas, d -> d.getEdad());
        System.out.println(resultatsEdads.toString());

    }

    public static <T, K> Map<K, List<T>> agrupar(List<T> elementos, Function<T, K> claveFunction){
        return elementos.stream().collect(Collectors.groupingBy(claveFunction));
    }  

}

class Person {

    String nombre;
    int edad;
    
    public Person() {
    }

    public Person(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{nombre=" + nombre + ", edad=" + edad + "}";
    }

    
}
