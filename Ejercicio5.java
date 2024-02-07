public class Ejercicio5 {
    static int [][] generarTablasMultiplicar() {
        int[][] tablas = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas [i][j] = i * j;
            }
        }
        return tablas;
    }

    public static void main(String[] args) {
        int [][] tablasDeMultiplicar = generarTablasMultiplicar();
        for (int i = 0; i < tablasDeMultiplicar.length; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 0; j < tablasDeMultiplicar[i].length; j++) {
                System.out.println(i + " * " + j + " = " + tablasDeMultiplicar[i][j]);
            }
            System.out.println();
        }
    }
}
