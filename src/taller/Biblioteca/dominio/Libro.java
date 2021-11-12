package taller.Biblioteca.dominio;

public class Libro extends Recurso implements Prestable{
    public Libro(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    @Override
    public void prestar() {
        prestado =true;
    }

    @Override
    public void devolver() {

        prestado=false;
    }
}
