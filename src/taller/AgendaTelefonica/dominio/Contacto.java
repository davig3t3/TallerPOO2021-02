package taller.AgendaTelefonica.dominio;

public class Contacto {

    private String nombre;
    private String apellido;
    private int numero;

    public Contacto(String nombre, String apellido, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
