import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Introduce un número entero positivo o un número negativo para finalizar:");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            } else if (numero < min) {
                min = numero;
            } else if (numero > max) {
                max = numero;
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("No se introdujo ningún número");
        } else {
            System.out.println("El número mínimo es: " + min);
            System.out.println("El número máximo es: " + max);
        }
    }
}
