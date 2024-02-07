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
        for (int i = 0; i < MultiploCinco.size(); i++) {
            System.out.print(MultiploCinco.get(i));
            if (i < MultiploCinco.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int suma = sumarArray(MultiploCinco);
        System.out.println("La suma de todos los múltiplos de 5 del 1 al 100 es: " + suma);
    }
}
