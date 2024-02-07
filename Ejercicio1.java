 import java.util.Scanner;

public class Ejercicio1 {
    static final short dias_en_ano = 365;
    static final short horas_en_dia = 24;
    static final short minutos_en_hora = 60;
    static final short segundos_en_minuto = 60;

    static long calcularSegundos(int anios, int meses, int dias) {
        int totalDias = anios * dias_en_ano + meses * 30 + dias;
        long totalHoras = (long) totalDias * horas_en_dia;
        long totalMinutos = totalHoras * minutos_en_hora;
        return totalMinutos * segundos_en_minuto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de años: ");
        int anios = scanner.nextInt();

        System.out.print("Ingrese el número de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Ingrese el número de días: ");
        int dias = scanner.nextInt();

        long segundos = calcularSegundos (anios, meses, dias);
        System.out.println("El número de segundos en un " + anios + " años, " + meses + " meses y " + dias + " días es: " + segundos + " segundos ");
    }
}
