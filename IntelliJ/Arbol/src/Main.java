import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arbol> Arboles = new ArrayList<>();
            Arboles.add(new Arbol("Pino", 30 , 93));
            Arboles.add(new Arbol("Cerezo", 25 , 20));
            Arboles.add(new Arbol("Encino", 30 , 800));
        System.out.println(Arboles);
    }
}