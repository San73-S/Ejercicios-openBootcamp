package Servicios;

import Entidades.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServicios {

    private List<Empleado> empleadosLista = new ArrayList<>();

    public void save(Empleado emple){
        empleadosLista.add(emple);
    }

    public List<Empleado> findAll(){
       return this.empleadosLista;
    }

}
