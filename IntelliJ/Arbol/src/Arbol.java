public class Arbol {
    private String especie;
    private int tamanioProm;
    private int edadProm;


    public Arbol(String especie, int tamanioProm, int edadProm) {
        this.especie = especie;
        this.tamanioProm = tamanioProm;
        this.edadProm = edadProm;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTamanioProm() {
        return tamanioProm;
    }

    public void setTamanioProm(int tamanioProm) {
        this.tamanioProm = tamanioProm;
    }

    public int getEdadProm() {
        return edadProm;
    }

    public void setEdadProm(int edadProm) {
        this.edadProm = edadProm;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "especie='" + especie + '\'' +
                ", tamanioProm=" + tamanioProm +
                ", edadProm=" + edadProm +
                '}';
    }
}
