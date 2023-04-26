public class Main {
    public static void main(String[] args) {
        //Punto 1
        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        String nombres[] = {"Santiago","Pedro","Pablo","Monica","Pamela","Karina"};
        print(nombres);
    }

    public static void print(String[] nombres){
        for (int i=0; i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
    }
}