package guia4;

public class FechaMain {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha();
        fecha1.dia = 1;
        fecha1.mes = 11;
        fecha1.año = 2025;
        Fecha fecha2 = new Fecha();
        fecha2.dia = 17;
        fecha2.mes = 1;
        fecha2.año = 2026;

        System.out.println(fecha2.diaHasta(fecha1));
    }
}
