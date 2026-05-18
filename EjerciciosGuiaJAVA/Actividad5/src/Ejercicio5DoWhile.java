import java.util.Scanner;

public class Ejercicio5DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;
        double suma = 0;
        char continuar;

        System.out.println("--- Suma de Números ---");

        do {
            System.out.println("Escriba un número:");
            numero = entrada.nextDouble();

            // Sumamos el número ingresado a nuestra variable acumuladora
            suma += numero;

            System.out.println("¿Desea ingresar otro número? (s/n):");
            continuar = entrada.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("\nPrograma terminado.");
        System.out.println("La suma total de los números ingresados es: " + suma);
    }
}