package src;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ejercicio29 {

    public static void main(String[] args) {

        JSONArray jsonArray = stringToJsonArray("src/peliculas.json");
        List<Peliculas> peliculas = jsonToObject(jsonArray);

        System.out.println(filtrarPorGenero(peliculas, "accion").toString());
        System.out.print(filtrarPerAnios(peliculas, "90s"));
    
    }

    public static int[] between(String decada) {

        Map<String, int[]> decadas = new HashMap<>();
        int[] rango = new int[2];

        decadas.put("50s", new int[] { 1950, 1959 });
        decadas.put("60s", new int[] { 1960, 1969 });
        decadas.put("70s", new int[] { 1970, 1979 });
        decadas.put("80s", new int[] { 1990, 1999 });
        decadas.put("90s", new int[] { 1990, 1999 });
        decadas.put("80s", new int[] { 1980, 1989 });
        decadas.put("2000s", new int[] { 2000, 2009 });
        decadas.put("2010s", new int[] { 2010, 2019 });

        if (decadas.containsKey(decada)) {
            rango = decadas.get(decada);
        } else {
            System.out.println("Decada no encontrada: " + decada);
        }
        return rango;
    }

    public static List<Peliculas> filtrarPerAnios(List<Peliculas> peliculas, String decada) {

        List<Peliculas> pelisFitradesAnios = new ArrayList<>();

        int[] rango = between(decada);

        pelisFitradesAnios = peliculas.stream().filter(p -> p.getAnio() >= rango[0] && p.getAnio() <= rango[1])
                .collect(Collectors.toList());

        return pelisFitradesAnios;
    }

    public static List<Peliculas> filtrarPorGenero(List<Peliculas> peliculas, String genero) {

        List<Peliculas> peliculasFiltradasGenero = new ArrayList<>();

        peliculasFiltradasGenero = peliculas.stream().filter(p -> p.getGenero().equals(genero))
                .collect(Collectors.toList());

        return peliculasFiltradasGenero;
    }

    public static JSONArray stringToJsonArray(String urlJson) {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(urlJson)) {

            Object object = parser.parse(reader);
            JSONArray listaPeliculas = (JSONArray) object;
            return listaPeliculas;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Peliculas> jsonToObject(JSONArray jsonArray) {

        List<Peliculas> listadoPeliculas = new ArrayList<>();

        for (Object pelicula : jsonArray) {

            JSONObject personJson = (JSONObject) pelicula;
            String titulo = (String) personJson.get("titulo");
            String genero = (String) personJson.get("genero");
            long anioLanzamiento = (long) personJson.get("anioLanzamiento");
            int anio = (int) anioLanzamiento;

            Peliculas peli = new Peliculas(titulo, genero, anio);
            listadoPeliculas.add(peli);
        }
        return listadoPeliculas;
    }

    public static JSONArray objectToJson(List<Peliculas> peliculas) {

        JSONArray jsonArray = new JSONArray();

        for (Peliculas peliucla : peliculas) {

            JSONObject peliculaJson = new JSONObject();
            peliculaJson.put("titulo", peliucla.getTitulo());
            peliculaJson.put("genero", peliucla.getGenero());
            peliculaJson.put("anioLanzamiento", peliucla.getAnio());
            jsonArray.add(peliucla);
        }
        return jsonArray;
    }

}
