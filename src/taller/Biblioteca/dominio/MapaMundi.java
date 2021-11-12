package taller.Biblioteca.dominio;

public class MapaMundi extends Recurso implements Copiable{

    public MapaMundi(boolean prestado, String nombre, int copias) {
        super(prestado, nombre, copias);
    }

    @Override
    public void fotocopiar() {
        copias+=1;
    }

    @Override
    public String toString() {
        return "MapaMundi{" +
                "prestado=" + prestado +
                ", copias=" + copias +
                '}';
    }
}
