public class Main {
    public static void main(String[] args) {

        String [] nombres = {"Santiago","Dalila","Julian","Juan","Leo"};
        String oracion = "";

        for (int i = 0; i<nombres.length;i++){
            oracion = oracion.concat(nombres[i] + " ");
        }

        System.out.println("La oracion que se formo fue: " + oracion);
    }
}