package taller.Oftalmologo.dominio;

public abstract class Paciente {
    private String nombre;
    private int edad;
    protected boolean necesitaCirugia;
    protected String calidadVision;

    public Paciente(String nombre, int edad, boolean necesitaCirugia, String calidadVision) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirugia = necesitaCirugia;
        this.calidadVision = calidadVision;
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

    public String getCalidadVision() {
        return calidadVision;
    }
}
