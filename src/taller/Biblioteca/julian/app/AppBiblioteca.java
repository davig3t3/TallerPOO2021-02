package taller.Biblioteca.julian.app;

import taller.Biblioteca.julian.dominio.Biblioteca;
import taller.Biblioteca.julian.dominio.Libro;
import taller.Biblioteca.julian.dominio.Revista;
import taller.Biblioteca.julian.dominio.Tesis;

public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("EDC");

        Libro libro = new Libro(true,"Contacto Carl sagan",2);
        Revista revista = new Revista(false, "Science",3);
        Tesis tesis = new Tesis(true, "Fotones condenzados",0);

        biblioteca.addRecurso(libro, revista);
        biblioteca.prestarRecurso(revista);
        biblioteca.devolverRecurso(libro);
        biblioteca.listarPrestados();
    }
}
