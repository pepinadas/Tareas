public class Asiento {
    private int fila;
    private String asiento;

    private int precio;

    public Asiento(int fila, String asiento, int precio) {
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila +
                ", lugar='" + asiento + '\'' +
                ", precio=" + precio +
                '}';
    }
}
