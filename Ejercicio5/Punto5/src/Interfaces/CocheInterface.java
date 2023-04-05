package Interfaces;

import Entidades.Coche;

import java.util.List;

public interface CocheInterface {

    void save(Coche coche);

    List<Coche> findAll();

    void delete(Coche coche);
}
