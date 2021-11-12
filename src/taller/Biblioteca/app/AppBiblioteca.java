package taller.Biblioteca.app;

import taller.Biblioteca.dominio.Biblioteca;
import taller.Biblioteca.dominio.Libro;
import taller.Biblioteca.dominio.Revista;

public class AppBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("EDC");

        Libro libro = new Libro(true,"Contacto Carl sagan");
        Revista revista = new Revista(false, "Science");

        biblioteca.addRecurso(libro, revista);
        biblioteca.prestarRecurso(revista);
        biblioteca.devolverRecurso(libro);
        biblioteca.listarPrestados();
    }
}
