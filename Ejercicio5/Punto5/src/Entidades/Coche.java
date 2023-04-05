package Entidades;

public class Coche {

    private String marca;
    private int anio;
    private int puertas;

    public Coche() {
    }

    public Coche(String marca, int anio, int puertas) {
        this.marca = marca;
        this.anio = anio;
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", anio='" + anio + '\'' +
                ", puertas='" + puertas + '\'' +
                '}';
    }
}
