public class Main {
    public static void main(String[] args) {

        //Punto 7
        //Crea una función DividePorCero.
        //Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        //que será capturada por su llamante (desde "main", por ejemplo).
        //Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        //Finalmente, mostraremos en cualquier caso: "Demo de código".

        int num1 = 10, num2 = 0;

        try {
            double resultado = dividePorCero(num1,num2);
        } catch (ArithmeticException a){
            System.out.println("Esto no puede hacerse.");
        } finally {
            System.out.println("Demo de código.");
        }
    }

    private static double dividePorCero(int num1, int num2) {
        double resultado = 0;
        return resultado = num1/num2;
    }
}