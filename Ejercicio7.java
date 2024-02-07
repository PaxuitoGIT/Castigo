import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio7 {
    static ArrayList<Integer> descomponerFactoresPrimos(int n) {
        ArrayList<Integer> factores = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factores.add(i);
                n /= i;
            }
        }
        return factores;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = scanner.nextInt();
        ArrayList<Integer> factoresPrimos = descomponerFactoresPrimos(numero);
        System.out.println("Los factores primos de " + numero + " son:");
        for (int factor : factoresPrimos) {
            System.out.println(factor);
        }
        scanner.close();
    }
}
