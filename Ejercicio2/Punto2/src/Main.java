public class Main {
    public static void main(String[] args) {

        Double precio = 15.50, precioFinal= 0D;

        precioFinal = asignarIVA(precio);

        System.out.println("El precio con el iva incluido es: $" + String.format("%.2f", precioFinal));
    }

    static Double asignarIVA(Double precio) {
        return precio = precio + (precio*0.21);
    }
}