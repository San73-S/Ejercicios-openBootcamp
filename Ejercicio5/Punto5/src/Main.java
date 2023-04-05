import Entidades.Coche;
import Servicios.CocheServcicios;

public class Main {
    public static void main(String[] args) {

        Coche audi = new Coche("Audi", 2022, 4);
        CocheServcicios CS = new CocheServcicios();

        CS.save(audi);
        CS.findAll();
        CS.delete(audi);

    }
}