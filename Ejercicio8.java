import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio8 {
    static ArrayList<Integer> recibirNumeros() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número entero (Pulse 0 para terminar):");
            num = scanner.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        } while (num != 0);
        return numeros;
    }

    static double calcularMedia(ArrayList<Integer> numeros) {
        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma / numeros.size();
    }

    static int calcularMinimo(ArrayList<Integer> numeros) {
        int minimo = numeros.getFirst();
        for (int num : numeros) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    static int calcularMaximo(ArrayList<Integer> numeros) {
        int maximo = numeros.getFirst();
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public static void main (String[] args) {
        ArrayList<Integer> numeros = recibirNumeros();
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);
        System.out.println("La media es: " + media);
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);
    }
}
