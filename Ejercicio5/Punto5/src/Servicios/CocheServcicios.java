package Servicios;

import Entidades.Coche;
import Interfaces.CocheInterface;

import java.util.List;

public class CocheServcicios implements CocheInterface {
    @Override
    public void save(Coche coche) {
        System.out.println("Metodo que guarda un auto en la base de datos.");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Metodo que retorna una lista de todos los autos ingresados en la base de datos.");
        return null;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Metodo que elimina un auto de la base de datos.");
    }
}
