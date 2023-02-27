import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] array_asientos =  {"A","B","C","D","E","F","G","H"} ;
        ArrayList<Asiento> asiento = new ArrayList<>();
        int precio = 0;

        for  (int i = 0; i < 10; i++) {
            if (i <=3) {
                precio = 10;
            } else {
                precio = 6;
            }
            for (int y = 0; y < 8; y++){
                asiento.add(new Asiento(i+1,array_asientos[y], precio));
            }
        }
        System.out.println(asiento);
    }

}