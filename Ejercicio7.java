import java.sql.Array;
import java.util.ArrayList;
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
}
