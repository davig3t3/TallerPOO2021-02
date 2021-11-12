package taller.Biblioteca.dominio;

public class Tesis extends Recurso implements Copiable{


    public Tesis(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {
        copias=getCopias();
    }
}
