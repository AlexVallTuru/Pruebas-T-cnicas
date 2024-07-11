//package Ejercicio42.src;
package src;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ejercicio42 {

    public static void main(String[] args) {

        JSONObject jsonObject = stringToJSONObject("src/superheroes.JSON");
        List<Superheroes> listadoSuperheroes = jsonObjectToListSuperheroes(jsonObject);

        listadoSuperheroes = ordenarPorParametros("nombre real", listadoSuperheroes);

        JSONObject json = listToJsonObject(listadoSuperheroes);

        try (FileWriter file = new FileWriter("src/superheroesOrdenados.JSON")) {
            file.write(json.toJSONString());
            System.out.println("JSON Object escrito en el archivo superheroesOrdenados.JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    public static JSONObject listToJsonObject(List<Superheroes> listadoSuperheroes) {

        JSONObject json = new JSONObject(new LinkedHashMap<>());

        for (Superheroes superheroe : listadoSuperheroes) {
            JSONObject superheroeJson = new JSONObject(new LinkedHashMap<>());
            superheroeJson.put("nombreReal", superheroe.getNombreReal());
            superheroeJson.put("afiliacion", superheroe.getAfilacion());

            JSONArray poderesArray = new JSONArray();
            for (String poder : superheroe.getPoderes()) {
                poderesArray.add(poder);
            }
            superheroeJson.put("listapoderes", poderesArray);

            json.put(superheroe.getNombre(), superheroeJson);
        }

        return json;
    }

    public static List<Superheroes> ordenarPorParametros(String tipo, List<Superheroes> listadoOrdenar) {

        if (tipo.equals("nombre")) {
            listadoOrdenar.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        } else if (tipo.equals("nombre real")) {
            listadoOrdenar.sort((o1, o2) -> o1.getNombreReal().compareTo(o2.getNombreReal()));
        }

        return listadoOrdenar;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<Superheroes> jsonObjectToListSuperheroes(JSONObject jsonObject) {

        List<Superheroes> listadoSuperheroes = new ArrayList<>();

        for (Object key : jsonObject.keySet()) {
            Superheroes superheroe = new Superheroes();
            superheroe.setNombre((String) key);

            JSONObject detallesSuperheroe = (JSONObject) jsonObject.get(superheroe.getNombre());

            superheroe.setNombreReal((String) detallesSuperheroe.get("nombreReal"));
            superheroe.setAfilacion((String) detallesSuperheroe.get("afiliacion"));

            // Convertir JSONArray a List<String>
            JSONArray poderesArray = (JSONArray) detallesSuperheroe.get("poderes");
            List<String> listaSuperpoderes = new ArrayList<>();
            for (Object poder : poderesArray) {
                listaSuperpoderes.add((String) poder);
            }
            superheroe.setPoderes(listaSuperpoderes);

            /*List<String> listaSuperpoderes = new ArrayList(
                    Arrays.asList((JSONArray) detallesSuperheroe.get("poderes")));
            superheroe.setPoderes(listaSuperpoderes);*/
            listadoSuperheroes.add(superheroe);
        }

        return listadoSuperheroes;
    }

    public static JSONObject stringToJSONObject(String urlDocumento) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(urlDocumento)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            return jsonObject;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

}