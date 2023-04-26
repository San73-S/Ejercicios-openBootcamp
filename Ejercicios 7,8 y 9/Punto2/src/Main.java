public class Main {
    public static void main(String[] args) {

        //Punto 2
        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición
        // y el valor de cada elemento en ambas dimensiones.

        int numeros[][] = { {1, 2}, {3, 4}, {5,6}, {7,8} };
        print(numeros);
    }

    private static void print(int[][] numeros) {
        for (int i=0; i<numeros.length;i++){
            for (int j=0; j<numeros[0].length;j++){
                System.out.println("Posicion ["+i+"] ["+j+"] = " + numeros[i][j]);
            }
        }
    }
}