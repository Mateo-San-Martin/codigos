package guia4;

public class FechaMain {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha();
        fecha1.setDia(1);
        fecha1.setMes(11);
        fecha1.setAño(2025) ;
        Fecha fecha2 = new Fecha();
        fecha2.setDia(17);
        fecha2.setMes(1);
        fecha2.setAño(2026);
        System.out.println(fecha2.diaHasta(fecha1));
        System.out.println(fecha1.diaEntreFechas(fecha1,fecha2));
        DiaSemana dia = fecha1.diaDeLaSemana();
        System.out.println(dia);
        System.out.println(fecha1.getMes());
    }
}
