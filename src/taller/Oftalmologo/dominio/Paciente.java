package taller.Oftalmologo.dominio;

public abstract class Paciente {
    private String nombre;
    private int edad;
    protected boolean necesitaCirugia;

    public Paciente(String nombre, int edad, boolean necesitaCirugia) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirugia = necesitaCirugia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isNecesitaCirugia() {
        return necesitaCirugia;
    }
}
