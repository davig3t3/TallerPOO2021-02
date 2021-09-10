package taller.AgendaTelefonica.app;

import taller.AgendaTelefonica.dominio.Agenda;
import taller.AgendaTelefonica.dominio.Contacto;

import java.util.Collections;

public class App {
    public static void main(String[] args) {

        Agenda agenda = new Agenda("qwerty");

        Contacto contacto = new Contacto("Arturo", "Perez",2341432);
        Contacto contacto2 = new Contacto("Kevin", "Ramirez",243334);
        Contacto contacto3 = new Contacto("Sara", "Mesa", 43245675);
        Contacto contacto4 = new Contacto("Andres", "Quintero",5978654);

        agenda.agregar(contacto);
        agenda.agregar(contacto2);
        agenda.agregar(contacto3);
        agenda.agregar(contacto4);

        agenda.buscar("Kevin","Ramirez");
        agenda.buscar(243334);


    }
}
