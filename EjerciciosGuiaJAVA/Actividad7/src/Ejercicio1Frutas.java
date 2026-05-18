import java.util.Scanner;

public class Ejercicio1Frutas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] frutas = new String[10];

        System.out.println("--- Registro de Frutas ---");
        // Llenar el vector
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre de la fruta [" + i + "]:");
            frutas[i] = entrada.nextLine();
        }

        // Mostrar el contenido en orden inverso
        System.out.println("\n--- Frutas en orden inverso ---");
        for (int i = 9; i >= 0; i--) {
            System.out.println("Fruta [" + i + "]: " + frutas[i]);
        }
    }
}