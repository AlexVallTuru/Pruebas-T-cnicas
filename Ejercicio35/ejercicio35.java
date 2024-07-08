import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicio35 {

    public static void main(String[] args) {
        System.out.println(esCompatible("Angular", "Java"));
        System.out.println(esCompatible("HTML", "CSSS"));
        System.out.println(esCompatible("HTML", "JavaScript"));

    }

    public static boolean esCompatible(String lenFront, String lenBack) {

        Map<String, List<String>> diccionarioDelDev = new HashMap<>();

        List<String> frontend = new ArrayList(Arrays.asList("Angular","React","Html","CSS","JavaScript"));
        List<String> backend = new ArrayList(Arrays.asList("Java","Goo","JavaScript"));

        diccionarioDelDev.put("frontend", frontend);
        diccionarioDelDev.put("backend", backend);

        boolean esFrontInFrontend = diccionarioDelDev.get("frontend").contains(lenFront);
        boolean esBackInBackend = diccionarioDelDev.get("backend").contains(lenBack);

        return esFrontInFrontend && esBackInBackend;
    }

}