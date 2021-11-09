package taller.Antivirus.dominio;

public abstract class Documento implements Viruseable {
    protected String nombre;

    public Documento(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
