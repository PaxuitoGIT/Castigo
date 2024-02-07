public class Ejercicio1 {
    static final short dias_en_ano = 365;
    static final short horas_en_dia = 24;
    static final short minutos_en_hora = 60;
    static final short segundos_en_minuto = 60;

    static long calcularSegundos(int anios, int meses, int dias) {
        int totalDias = anios * dias_en_ano + meses * 30 + dias;
        long totalHoras = totalDias * horas_en_dia;
        long totalMinutos = totalHoras * minutos_en_hora;
        long totalSegundos = totalMinutos * segundos_en_minuto;
        return totalSegundos;
    }
}
