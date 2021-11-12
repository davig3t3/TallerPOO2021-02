package taller.Biblioteca.dominio;

public class Revista extends Recurso implements Prestable{
    public Revista(boolean prestado, String nombre) {
        super(prestado, nombre);
    }

    public void prestar() {
        prestado =true;
    }

    @Override
    public void devolver() {

        prestado=false;
    }
}
