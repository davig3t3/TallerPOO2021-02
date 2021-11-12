package taller.Biblioteca.dominio;

public class Diccionario extends Recurso implements Prestable{
    public Diccionario(boolean prestado, String nombre, int copias) {
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
        return "Diccionario{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
