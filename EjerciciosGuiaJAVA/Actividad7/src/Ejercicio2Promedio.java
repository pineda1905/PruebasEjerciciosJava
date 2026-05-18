import java.util.Scanner;

public class Ejercicio2Promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        int suma = 0;
        double promedio;

        System.out.println("--- Promedio de Números ---");
        // Llenar el vector y sumar los valores
        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese un número entero [" + i + "]:");
            numeros[i] = entrada.nextInt();
            suma += numeros[i];
        }

        // Calcular el promedio (forzamos la división a decimal con double)
        promedio = (double) suma / 12;

        System.out.println("\nEl promedio de los 12 números ingresados es: " + promedio);
    }
}