package Intefaces;

import Entidades.Empleado;

import java.util.List;

/**
 * SE declaran los metodos, no se implementan
 *
 * Actua como un contrado, dice lo que hay que hacer pero no lo hace
 */

public interface EmpleadosInteface {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
