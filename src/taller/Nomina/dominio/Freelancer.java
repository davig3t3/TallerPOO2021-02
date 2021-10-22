package taller.Nomina.dominio;

public class Freelancer extends Empleado{
    private long valorHora;
    private int horasTrabajadas;
    public Freelancer(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorHora=valorHora;
    }

    @Override
    protected long calcularSalario() {
        return valorHora*horasTrabajadas;
    }

}