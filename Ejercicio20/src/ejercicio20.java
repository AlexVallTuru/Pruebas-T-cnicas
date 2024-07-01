package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ejercicio20 {

    public static void main(String[] args) {

        final String edad = "edad";
        final String nombre = "nombre";
        
        JSONArray jsonArray = stringToJsonArray("src/persons.json");
        List<Person> listaPersons = jsonToObject(jsonArray);
        listaPersons = ordenacionArray(listaPersons,nombre);
        JSONArray jsonArrayOrdenado = ObjectToJson(listaPersons);

        System.out.print(jsonArrayOrdenado.toJSONString());
    }

    public static List<Person> ordenacionArray(List<Person> persons, String OrdenaEdadONombre) {

        switch (OrdenaEdadONombre) {
            case "edad":
                persons.sort(Comparator.comparingInt(Person::getEdad));
                break;
            case "nombre":
                persons.sort(Comparator.comparing(Person::getNombre));
                break;
            default:
                System.out.println("Opción no válida: " + OrdenaEdadONombre);
        }

        return persons;
    }

    public static JSONArray stringToJsonArray(String urlDocumento) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(urlDocumento)) {

            Object object = parser.parse(reader);
            JSONArray listaPersons = (JSONArray) object;
            return listaPersons;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Person> jsonToObject(JSONArray JSONArray) {

        List<Person> listaPersonas = new ArrayList<>();

        for (Object peronJsonArray : JSONArray) {

            JSONObject personaJson = (JSONObject) peronJsonArray;

            String nombre = (String) personaJson.get("nombre");
            Long edad = (long) personaJson.get("edad");

            Person person = new Person(nombre, edad.intValue());

            listaPersonas.add(person);
        }

        return listaPersonas;
    }

    public static JSONArray ObjectToJson(List<Person> persons){

        JSONArray jsonArray = new JSONArray();

        for(Person person:persons) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("nombre", person.getNombre());
            jsonObject.put("edad", person.getEdad());
            jsonArray.add(jsonObject);   
        }
        return jsonArray;
    }
}
