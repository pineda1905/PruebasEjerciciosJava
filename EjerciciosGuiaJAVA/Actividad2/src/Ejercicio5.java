import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese la primera nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera nota:");
        nota3 = entrada.nextDouble();

        // Calcular el promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nEl promedio es: " + promedio);

        // Determinar si está aprobado o reprobado (Asumiendo 6.0 como nota de aprobación)
        if (promedio >= 6.0) {
            System.out.println("El estudiante está: Aprobado");
        } else {
            System.out.println("El estudiante está: Reprobado");
        }
    }
}