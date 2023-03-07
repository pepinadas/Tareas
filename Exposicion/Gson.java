public class EjemploGson {
    public static void main(String[] args) {
        Autor autor = new Autor("Brandon Sanderson", "Alta Fantasia", 47);
        String strAutor = new Gson().toJson(autor);
        System.out.println(autor);
        System.out.println(strAutor);


        Autor autorCreado = new Gson().fromJson(strAutor , Autor.class);
        System.out.println(autorCreado);
        System.out.println(autorCreado.getNombre());
    }
}