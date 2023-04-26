import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        //Punto 8
        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:"fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
        // dado en "fileOut".

        String fileIn="nombres.txt";
        String fileOut="copia.txt";

        copiaDeFicheros(fileIn,fileOut);
    }

    public static void copiaDeFicheros(String fileIn, String fileOut){
        try {
            InputStream fichero = new FileInputStream(Paths.get("src\\Archivos\\",fileIn).toFile());
            PrintStream info = new PrintStream(Paths.get("src\\Archivos\\",fileOut).toFile());

            byte[] datos = fichero.readAllBytes();
            info.write(datos);

            for (byte dato : datos){
                System.out.print((char)dato);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}