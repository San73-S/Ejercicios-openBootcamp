import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Punto 6
        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves,
        // puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer>numeros = new ArrayList<>();

        cargarArrayList(numeros);
        eliminarYImprimir(numeros);
    }

    private static void cargarArrayList(ArrayList<Integer> numeros) {
        for(int i=1;i<=10;i++){
            numeros.add(i);
        }
    }

    private static void eliminarYImprimir(ArrayList<Integer> numeros){
        int count = -1;
        for (int i=1;i<numeros.size();i++){

            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
                count++;
            }
            System.out.println(numeros.get(count));
        }
    }

}