package Entidades;

public class SmartWatch extends SmartDevice{
        /*
        reloj= frecuencia cardiaca
        * */
    private boolean frecuenciaCardiaca;

    public SmartWatch() {
    }

    public SmartWatch(int bateria, int memoriaRam, String procesador, String tamanioPantalla, String marca, boolean camara, boolean frecuenciaCardiaca) {
        super(bateria, memoriaRam, procesador, tamanioPantalla, marca, camara);
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public boolean isFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(boolean frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "frecuenciaCardiaca=" + frecuenciaCardiaca +
                '}';
    }
}
