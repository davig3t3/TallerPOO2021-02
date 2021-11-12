package taller.Biblioteca.dominio;

public class Revista extends Recurso implements Prestable,Copiable{


    public Revista(boolean prestado, String nombre, int copias) {
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
