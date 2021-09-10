package taller.DispensadorMecato.app;

import taller.DispensadorMecato.dominio.Dispensador;
import taller.DispensadorMecato.dominio.Mecato;

public class App {
    public static void main(String[] args) {

        Dispensador dispensador = new Dispensador("QWERTY");

        Mecato producto1 = new Mecato("doritos", 001, 222,8);
        Mecato producto2 = new Mecato("chtetos", 002, 222,7);
        Mecato producto3 = new Mecato("yogurt", 003, 322,3);
        Mecato producto4 = new Mecato("cholate jet", 004, 622, 6);

        dispensador.agregar(producto1);
        dispensador.agregar(producto2);
        dispensador.agregar(producto3);
        dispensador.agregar(producto4);

        dispensador.sacarUnidad(002);

        dispensador.aumentarStock(003, 4);

        dispensador.consultarUnidades(003);


        System.out.println(dispensador.consultarAgotados());
        System.out.println(dispensador.consultarUnidadesTotales());


    }
}
