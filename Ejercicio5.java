public class Ejercicio5 {
    static int [][] generarTablasMultiplicar(int N) {
        int[][] tablas = new int [N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablas [i][j] = i * j;
            }
        }
        return tablas;
    }
}
