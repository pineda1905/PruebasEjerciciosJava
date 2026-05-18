import java.util.Scanner;

public class Ejercicio7Tabla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Escriba un número natural para generar su tabla de multiplicar:");
        numero = entrada.nextInt();

        System.out.println("");
        System.out.println("--- Tabla de multiplicar del " + numero + " ---");

        // Ciclo for para iterar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
