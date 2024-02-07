import java.util.Scanner;
public class Ejercicio9 {
    static int[] leerVector(int n) {
        int[] vector = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el elemento " + (i + 1) + " del vector");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }
}
