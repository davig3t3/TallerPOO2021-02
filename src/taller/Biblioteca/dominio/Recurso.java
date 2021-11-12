package taller.Biblioteca.dominio;

public abstract class Recurso {
    protected boolean prestado;
    private String nombre;

    public Recurso(boolean prestado, String nombre) {
        this.prestado = prestado;
        this.nombre = nombre;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }
}
