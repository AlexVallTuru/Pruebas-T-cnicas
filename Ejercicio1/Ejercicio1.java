package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        HashMap<String, SuperHeroe> superheroes = crearSuperheroes();

        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca el nombre de uno o varios superhéroes separados por comas:");
        String nombres = in.nextLine();
        ArrayList<String> nombresArray = convertirNombresInputArray(nombres);

        mostrarInformacionSuperheroes(superheroes, nombresArray);

        in.close();
    }

    public static ArrayList<String> convertirNombresInputArray(String nombres) {
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList(nombres.split(",")));
        ArrayList<String> listaNombresModificados = new ArrayList<>();
        for (String nombre : listaNombres) {
            nombre = nombre.trim(); // Eliminar espacios al principio y al final
            ArrayList<String> nombrePorPartes = new ArrayList<>(Arrays.asList(nombre.split(" ")));
            String nombreModificado = "";
            for (String parteNombre : nombrePorPartes) {
                parteNombre = parteNombre.substring(0, 1).toUpperCase() + parteNombre.substring(1).toLowerCase();
                nombreModificado += parteNombre + " ";
            }
            listaNombresModificados.add(nombreModificado.trim());
        }
        return listaNombresModificados;
    }

    public static void mostrarInformacionSuperheroes(HashMap<String, SuperHeroe> superheroes,
            ArrayList<String> nombresSuperheroes) {
        for (String nombre : nombresSuperheroes) {
            if (superheroes.containsKey(nombre)) {
                SuperHeroe heroe = superheroes.get(nombre);
                System.out.println("Información sobre el superhéroe " + nombre + ":" + heroe.toString());
            } else {
                System.out.println("No se ha encontrado información sobre el superhéroe " + nombre);
            }
        }
    }

    public static HashMap<String, SuperHeroe> crearSuperheroes() {
        HashMap<String, SuperHeroe> superheroes = new HashMap<>();
        superheroes.put("Iron Man", new SuperHeroe("Tony Stark",
                new ArrayList<>(Arrays.asList("Tecnología avanzada", "Movilidad aérea")), "Los vengadores"));
        superheroes.put("Capitán América",
                new SuperHeroe("Steve Rogers",
                        new ArrayList<>(Arrays.asList("Fuerza sobrehumana", "Agilidad y reflejos sobresalientes")),
                        "Los vengadores"));
        superheroes.put("Thor", new SuperHeroe("Thor Odinson",
                new ArrayList<>(Arrays.asList("Mjolnir", "Viento y trueno")), "Los vengadores"));
        superheroes.put("Spider-Man",
                new SuperHeroe("Peter Parker",
                        new ArrayList<>(Arrays.asList("Balanceo", "Telarañas pegajosas", "Sentido arácnido")),
                        "Los vengadores"));
        superheroes.put("Hulk", new SuperHeroe("Bruce Banner",
                new ArrayList<>(Arrays.asList("Fuerza sobrehumana", "Invulnerabilidad")), "Los vengadores"));
        return superheroes;
    }
}

class SuperHeroe {
    private String nombreReal;
    private ArrayList<String> poderes;
    private String equipo;

    public SuperHeroe(String nombreReal, ArrayList<String> poderes, String equipo) {
        this.nombreReal = nombreReal;
        this.poderes = poderes;
        this.equipo = equipo;
    }

    public String formarListaPoderesString() {
        StringBuilder listaPoderes = new StringBuilder();
        for (String poder : poderes) {
            listaPoderes.append(poder).append(", ");
        }
        if (listaPoderes.length() > 0) {
            listaPoderes.setLength(listaPoderes.length() - 2);
        }
        return listaPoderes.toString();
    }

    @Override
    public String toString() {
        return "SuperHéroe {" +
                "nombreReal='" + nombreReal + '\'' +
                ", poderes=" + formarListaPoderesString() +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
