package org.example;

public class Main {
    public static void main(String[] args) {

        //Primer enunciado
        // Escribe el código que devuelva una cadena al revés.

        String cadena = "Hola mundo";
        print(reverse(cadena));
    }
    public static String[] reverse(String texto) {
        String cadenaAux [] = texto.split("");
        return cadenaAux;
    }

    public static void print(String [] cadena){
        for (int i = cadena.length-1; i>=0;i--){
            System.out.print(cadena[i]);
        }
    }
}