package Entidades;

public abstract class SmartDevice {

    private int bateria;
    private int memoriaRam;
    private String procesador;
    private String tamanioPantalla;
    private String marca;
    private boolean camara;

    public SmartDevice() {
    }

    public SmartDevice(int bateria, int memoriaRam, String procesador, String tamanioPantalla, String marca, boolean camara) {
        this.bateria = bateria;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.tamanioPantalla = tamanioPantalla;
        this.marca = marca;
        this.camara = camara;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "bateria=" + bateria +
                ", memoriaRam=" + memoriaRam +
                ", procesador='" + procesador + '\'' +
                ", tamanioPantalla='" + tamanioPantalla + '\'' +
                ", marca='" + marca + '\'' +
                ", camara=" + camara +
                ' ';
    }
}
