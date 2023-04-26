import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Sorpréndenos creando un programa de tu elección que utilice InputStream,
        // PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

//        Programa de registro de asistencias.
//        Lee de un archivo las asistencias y separa por un lado un archivo con los presentes
//        y otro con los ausentes.

        try {
            InputStream fichero = new FileInputStream(Paths.get("src\\Archivos\\","Asistencias.txt").toFile());
            PrintStream presentes = new PrintStream(Paths.get("src\\Archivos\\","Presentes.txt").toFile());
            PrintStream ausentes = new PrintStream(Paths.get("src\\Archivos\\","Ausentes.txt").toFile());

            ArrayList<String> listaAlumnos = cargarArrayList(fichero);

            HashMap<String, Boolean> alumnos = cargarHashMap(listaAlumnos);

            imprimirHashMapYCargarArchivos(alumnos, presentes,ausentes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<String> cargarArrayList(InputStream fichero) throws IOException {
        ArrayList<String> listaAlumnos = new ArrayList<>();
        String palabra ="";

        byte[] datos = fichero.readAllBytes();

        for (byte dato : datos){

            if (String.valueOf((char)dato).equalsIgnoreCase(",")){
                listaAlumnos.add(palabra);
                palabra="";
            } else if(dato != 13 && dato != 10){
                palabra = palabra.concat(String.valueOf((char)dato));
            }
        }
        return listaAlumnos;
    }


    private static HashMap<String, Boolean> cargarHashMap(ArrayList<String> listaAlumnos) {

        removerDatosInnecesarios(listaAlumnos);

        Iterator it = listaAlumnos.iterator();
        HashMap<String, Boolean> alumnos = new HashMap<>();

        while (it.hasNext()){
            String nombre = it.next().toString();
            String apellido = it.next().toString();
            String nombreCompleto = nombre + " " + apellido;
            String asistencia = it.next().toString();

            if(asistencia.equalsIgnoreCase("Presente")){
                alumnos.put(nombreCompleto,true);
            } else{
                alumnos.put(nombreCompleto,false);
            }
        }
        return alumnos;
    }

    private static void removerDatosInnecesarios(ArrayList<String> listaAlumnos) {
        //Evitar tener en cuenta el enunciado
        for (int i=0;i<3;i++){
            listaAlumnos.remove(0);
        }
    }

    private static void imprimirHashMapYCargarArchivos(HashMap<String, Boolean> alumnos,
                                               PrintStream presentes, PrintStream ausentes) throws IOException {
        for (Map.Entry<String, Boolean> elemento : alumnos.entrySet()) {
            String clave = elemento.getKey();
            Boolean valor = elemento.getValue();
            if(valor){
                presentes.write(clave.getBytes());
                presentes.write("\n".getBytes());
            }else{
                ausentes.write(clave.getBytes());
                ausentes.write("\n".getBytes());
            }
            System.out.println(clave + " esta " + (valor ? "Presente." : "Ausente." ));
        }
    }


}