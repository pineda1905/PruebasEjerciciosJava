import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

        System.out.println("Ingrese la primera nota (0 - 10):");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota (0 - 10):");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera nota (0 - 10):");
        nota3 = entrada.nextDouble();

        // Validar que las notas estén en el rango de 0 a 10
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {

            promedio = (nota1 + nota2 + nota3) / 3;
            System.out.println("\nEl promedio es: " + promedio);

            if (promedio >= 6.0) {
                System.out.println("El estudiante está: Aprobado");
            } else {
                System.out.println("El estudiante está: Reprobado");
            }

        } else {
            System.out.println("\nError: Una o más notas ingresadas no son válidas. Deben estar entre 0 y 10.");
        }
    }
}