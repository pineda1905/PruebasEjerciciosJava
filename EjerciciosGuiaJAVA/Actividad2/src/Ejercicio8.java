import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, num3, mayor;

        System.out.println("Ingrese el primer número:");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer número:");
        num3 = entrada.nextDouble();

        // Asignamos el primer número como el mayor inicialmente
        mayor = num1;

        // Comparamos si el segundo o el tercero son mayores
        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("\nEl número mayor de los tres es: " + mayor);
    }
}