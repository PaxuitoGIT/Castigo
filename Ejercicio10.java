import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    static void generarEImprimirMatrizSimetrica(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int num = random.nextInt(100);
                matriz[i][j] = num;
                matriz[j][i] = num;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j= 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz:");
        int n = scanner.nextInt();
        generarEImprimirMatrizSimetrica(n);
    }
}
