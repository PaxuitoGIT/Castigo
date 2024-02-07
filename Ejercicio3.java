import java.util.ArrayList;

public class Ejercicio3 {
    static ArrayList<Integer> MultiplosDeCinco() {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
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

    public static void main(String[] args) {
        ArrayList<Integer> MultiploCinco = MultiplosDeCinco();
        System.out.println("Los múltiplos de 5 del 1 al 100 son:");
        for (int multiplo : MultiploCinco) {
            System.out.println(multiplo);
        }
        int suma = sumarArray(MultiploCinco);
        System.out.println("La suma de todos los múltiplos de 5 del 1 al 100 es: " + suma);
    }
}
