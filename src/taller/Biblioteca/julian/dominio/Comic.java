package taller.Biblioteca.julian.dominio;

public class Comic extends Recurso implements Prestable{

    public Comic(boolean prestado, String nombre, int copias) {
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
    public String toString() {
        return "Comic{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
