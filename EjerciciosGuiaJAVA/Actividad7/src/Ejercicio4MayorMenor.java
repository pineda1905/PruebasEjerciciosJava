import java.util.Scanner;

public class Ejercicio4MayorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        double mayor, menor;

        System.out.println("--- Búsqueda de Mayor y Menor ---");

        // Solicitamos el primer número fuera del ciclo para poder 
        // inicializar las variables "mayor" y "menor" con ese primer dato.
        System.out.println("Ingrese un número [0]:");
        numeros[0] = entrada.nextDouble();
        mayor = numeros[0];
        menor = numeros[0];

        // Llenamos el resto del vector empezando desde la posición 1
        for (int i = 1; i < 10; i++) {
            System.out.println("Ingrese un número [" + i + "]:");
            numeros[i] = entrada.nextDouble();

            // Comparamos para encontrar el mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            // Comparamos para encontrar el menor
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);
    }
}