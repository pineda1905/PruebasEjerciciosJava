import java.util.Scanner;

public class Ejercicio3ParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;

        System.out.println("--- Contador de Pares e Impares ---");
        // Llenar el vector y verificar la condición
        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese un número entero [" + i + "]:");
            numeros[i] = entrada.nextInt();

            // Verificamos si el residuo de la división entre 2 es 0 (par)
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}