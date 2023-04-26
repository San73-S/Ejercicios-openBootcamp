public class Main {
    public static void main(String[] args) {

        //Punto 3
        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        int[] numeros = {1,2,3,4,5};
        int[] nuevosNumeros = eliminarPosiciones(numeros);

        print(nuevosNumeros);
    }

    private static int[] eliminarPosiciones(int[] numeros) {
        int[] num = new int[3];
        int count=0;
        for (int i=0; i<numeros.length;i++){

            if(i!=1 && i!=2){
                num[count] = numeros[i];
                count++;
            }
        }
        return num;
    }

    private static void print(int[] numeros){
        for (int i=0; i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        }
    }
}