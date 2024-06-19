
public class Ejercicio13 {

    public static void main(String[] args) {

        String json = "{ tipo: 'triangulo', base: 6, altura: 9}";
        // Gson gson = new Gson();
        // Forma figura = gson.fromJson(json, Forma.class);

        json = json.replaceAll("[{}]", "").trim(); // trim elimina espacios al inicio y al final
        // System.out.print(json);

        String[] partes = json.split(",");

        Forma forma = new Forma();

        for (String parte : partes) {
            if (parte.contains("tipo")) {
                parte = parte.replace("'", "");
                forma.setTipo(parte.replace("tipo: ", "").trim());
            } else if (parte.contains("base")) {
                parte = parte.replace("base:", "").trim();
                forma.setBase(Integer.parseInt(parte));
            } else if (parte.contains("altura")) {
                parte = parte.replace("altura:", "").trim();
                forma.setAltura(Integer.parseInt(parte));
            }
        }

        int area = calculaAreaPoligono(forma);
        System.out.print("El area del " + forma.getTipo() + " es: " + area);

    }

    public static int calculaAreaPoligono(Forma forma) {
        switch (forma.getTipo()) {
            case "triangulo":
                return (forma.getBase() * forma.getAltura()) / 2;
            case "cuadrado":
            case "rectangulo": {
                return forma.getBase() * forma.getAltura();
            }
            default:
                throw new IllegalArgumentException("Tipo de poligono no soportado");
        }

    }

    public static class Forma {
        String tipo;
        int base;
        int altura;

        public Forma(String tipo, int base, int altura) {
            this.tipo = tipo;
            this.base = base;
            this.altura = altura;
        }

        public Forma() {
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Forma {tipo=" + tipo + ", base=" + base + ", altura=" + altura + "}";
        }

    }

}