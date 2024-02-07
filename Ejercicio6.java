public class Ejercicio6 {
    static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] generarPrimos(int N) {
        int[] primos = new int[N];
        int num = 2;
        int count = 0;
        while (count < N) {
            if(esPrimo(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }
        return primos;
    }
}
