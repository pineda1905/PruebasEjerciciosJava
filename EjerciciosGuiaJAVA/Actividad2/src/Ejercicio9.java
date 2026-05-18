import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double compra, descuento, totalPagar;

        System.out.println("Ingrese el valor de la compra en $: ");
        compra = entrada.nextDouble();

        // Determinar el descuento basado en las reglas
        if (compra < 100) {
            descuento = 0; // 0% de descuento
        } else if (compra >= 100 && compra <= 300) {
            descuento = compra * 0.10; // 10% de descuento
        } else {
            descuento = compra * 0.15; // 15% de descuento
        }

        // Calcular total a pagar
        totalPagar = compra - descuento;

        System.out.println("\n--- Resumen de su compra ---");
        System.out.println("Monto original: $" + compra);
        System.out.println("Descuento a aplicar: $" + descuento);
        System.out.println("Monto final a pagar: $" + totalPagar);
    }
}
