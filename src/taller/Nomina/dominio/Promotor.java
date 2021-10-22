package taller.Nomina.dominio;

public class Promotor extends Empleado {
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolante;

    public Promotor(String nombre,int volantesRepartidos,long valorVolante,int comprasVolante) {
        super(nombre);
        this.comprasVolante=comprasVolante;
        this.valorVolante=valorVolante;
        this.volantesRepartidos=volantesRepartidos;
    }

    @Override
    protected long calcularSalario() {
        return (volantesRepartidos*valorVolante)+(comprasVolante*17000);
    }
}
