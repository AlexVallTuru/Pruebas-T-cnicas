package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ejercicio18 {
    public static void main(String[] args) {

        List<Persona> personas = obtenerPersonaJson("src/persons.json");
        List<Persona> personasFiltradas = filtrarLista(personas);
        JSONArray jsonArray = listaFiltradaJson(personasFiltradas);

        System.out.print(jsonArray.toJSONString());

    }

    public static List<Persona> filtrarLista(List<Persona> personas){

        List<Persona> personasFiltras = personas.stream()
            .filter(p -> p.getEdad() > 20)
            .filter(p -> p.getNombre().contains("o") && p.getNombre().contains("n"))
            .collect(Collectors.toList());

        return personasFiltras;
    }

    public static JSONArray listaFiltradaJson(List<Persona> personas){

        JSONArray jsonArray = new JSONArray();

        for(Persona persona:personas){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("nombre", persona.getNombre());
            jsonObject.put("edad", persona.getEdad());
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    public static List<Persona> obtenerPersonaJson(String persons) {

        List<Persona> personas = new ArrayList<>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(persons)) {

            Object obj = parser.parse(reader);
            JSONArray listaPersonas = (JSONArray) obj;

            for (Object personaObj : listaPersonas) {

                JSONObject personaJson = (JSONObject) personaObj;

                String nombre = (String) personaJson.get("nombre");
                Long edad = (long) personaJson.get("edad");

                Persona persona = new Persona(nombre, edad.intValue());

                personas.add(persona);
            }
        }

        catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return personas;
    }

}