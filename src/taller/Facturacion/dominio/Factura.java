package taller.Facturacion.dominio;

import java.time.LocalDateTime;

public abstract class Factura {

    private int numero;
    private long valor;
    private LocalDateTime fecha;

    public abstract long calcularTotal();


}
