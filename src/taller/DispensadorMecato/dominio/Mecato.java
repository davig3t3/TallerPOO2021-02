package taller.DispensadorMecato.dominio;

public class Mecato {

    private String nombre;
    private int codigo;
    private int cantidad;
    private int precio;
    public static final int CANTIDAD_MAX = 8;

    public Mecato(String nombre, int codigo, int precio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = CANTIDAD_MAX;
    }

    public Mecato(String nombre, int codigo, int precio, int cantidad){

        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getNombre(){
        return nombre;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
