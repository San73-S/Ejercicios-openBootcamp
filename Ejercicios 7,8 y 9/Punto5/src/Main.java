import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Punto 5
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        //Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> listaDeNombres = new ArrayList<>();
        cargarArrayList(listaDeNombres);

        LinkedList<String> nombresLinkedList = new LinkedList<>(listaDeNombres);

        print(listaDeNombres);
        print(nombresLinkedList);
    }

    public static void cargarArrayList(ArrayList<String> listaDeNombres){
        listaDeNombres.add("Santiago");
        listaDeNombres.add("Dalila");
        listaDeNombres.add("Camilo");
        listaDeNombres.add("Barbara");
    }

    private static void print(LinkedList<String> nombresLinkedList) {
        System.out.println("\nImpresion de LinkedList.\n");
        for(String nombres : nombresLinkedList){
            System.out.println(nombres);
        }
    }

    private static void print(ArrayList<String> listaDeNombres) {
        System.out.println("Impresion de ArrayList.\n");
        for(String nombres : listaDeNombres){
            System.out.println(nombres);
        }
    }
}