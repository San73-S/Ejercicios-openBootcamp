import Entidades.Empleado;
import Servicios.EmpleadoServicios;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Santiago", 24, 180000D, true);
        Empleado empleado2 = new Empleado("Juan", 22, 150000D, true);
        Empleado empleado3 = new Empleado("Pedro", 20, 140000D, true);
        EmpleadoServicios empleServ = new EmpleadoServicios();

        /*Guardar*/
        empleServ.save(empleado1);
        empleServ.save(empleado2);
        empleServ.save(empleado3);

        /*Buscar*/
       List<Empleado> empleadosLista = empleServ.findAll();

        System.out.println(empleadosLista);




    }
}