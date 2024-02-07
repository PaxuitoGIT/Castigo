import java.sql.Array;
import java.util.ArrayList;

public class Ejercicio3 {
    static ArrayList<Integer> MultiplosDeCinco(int begin, int end) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos.add(i);
            }
        }
        return multiplos;
    }

    static int sumarArray(ArrayList<Integer> array) {
        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }
        return suma;
    }
}
