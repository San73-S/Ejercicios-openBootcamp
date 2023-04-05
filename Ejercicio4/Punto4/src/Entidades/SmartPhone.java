package Entidades;

public class SmartPhone extends SmartDevice {
    private boolean chipNFC;
    private boolean conectorAuricular;

    public SmartPhone() {
    }

    public SmartPhone(int bateria, int memoriaRam, String procesador, String tamanioPantalla, String marca, boolean camara, boolean chipNFC, boolean conectorAuricular) {
        super(bateria, memoriaRam, procesador, tamanioPantalla, marca, camara);
        this.chipNFC = chipNFC;
        this.conectorAuricular = conectorAuricular;
    }

    public boolean isChipNFC() {
        return chipNFC;
    }

    public void setChipNFC(boolean chipNFC) {
        this.chipNFC = chipNFC;
    }

    public boolean isConectorAuricular() {
        return conectorAuricular;
    }

    public void setConectorAuricular(boolean conectorAuricular) {
        this.conectorAuricular = conectorAuricular;
    }

    @Override
    public String toString() {
        return super.toString() +
                "chipNFC=" + chipNFC +
                ", conectorAuricular=" + conectorAuricular +
                '}';
    }
}
