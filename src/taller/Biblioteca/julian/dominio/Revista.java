package taller.Biblioteca.julian.dominio;

public class Revista extends Recurso implements Prestable{


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
    public String toString() {
        return "Revista{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
