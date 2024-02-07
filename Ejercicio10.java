import java.util.Random;
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
}
