public class Ejercicio6For {
    public static void main(String[] args) {
        System.out.println("--- Primeros 50 múltiplos de 5 ---");
        System.out.println("");

        // Iniciamos el contador en 1 y lo terminamos en 50
        for (int i = 1; i <= 50; i++) {
            // Multiplicamos 5 por la iteración actual (1, 2, 3...)
            int multiplo = 5 * i;
            System.out.println("5 x " + i + " = " + multiplo);
        }
    }
}