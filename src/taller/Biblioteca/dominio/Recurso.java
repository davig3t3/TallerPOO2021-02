package taller.Biblioteca.dominio;

public abstract class Recurso {
    protected boolean prestado;
    private String nombre;
    protected int copias;

    public Recurso(boolean prestado, String nombre, int copias) {
        this.prestado = prestado;
        this.nombre = nombre;
        this.copias = copias;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCopias() {
        return copias;
    }
}
