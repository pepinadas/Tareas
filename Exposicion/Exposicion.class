public class EjemploJackson {
    public static void main(String[] args) {
        Autor autor = new Autor("Brandon Sanderson", "Alta Fantasia", 47);
        ObjectMapper mapeador = new ObjectMapper();
        try {
            String strAutor = mapeador.writeValueAsString(autor);
            System.out.println(strAutor);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
