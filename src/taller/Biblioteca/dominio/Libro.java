package taller.Biblioteca.dominio;

public class Libro extends Recurso implements Prestable,Copiable{


    public Libro(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void prestar() {
        prestado =true;
    }

    @Override
    public void devolver() {

        prestado=false;
    }

    @Override
    public void fotocopiar() {
        copias=getCopias();
    }

}
