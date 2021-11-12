package taller.Biblioteca.julian.dominio;

public class Tesis extends Recurso implements Copiable{


    public Tesis(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {
        copias=getCopias()+1;
    }

    @Override
    public String toString() {
        return "Tesis{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
