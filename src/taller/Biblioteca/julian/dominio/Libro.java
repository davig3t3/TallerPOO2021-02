package taller.Biblioteca.julian.dominio;

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
        copias=getCopias()+1;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
