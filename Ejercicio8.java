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
}
