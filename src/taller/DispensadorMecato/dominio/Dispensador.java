package taller.DispensadorMecato.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dispensador {

    private String nombre;
    private List<Mecato> productos;
    public static final int CANT_MAX_U = 10;

    public Dispensador(String nombre){
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public Mecato buscar(int codigo) {
        Mecato mecatoBuscado = null;

        for (Mecato mecato: this.productos) {
            if (mecato.getCodigo() == codigo) {
                mecatoBuscado = mecato;
                break;
            }
        }

        return mecatoBuscado;
    }

    public Mecato buscar(String nombre) {
        Mecato mecatoBuscado = null;

        for (Mecato mecato: this.productos) {
            if (mecato.getNombre().equalsIgnoreCase(nombre)) {
                mecatoBuscado = mecato;
                break;
            }
        }

        return mecatoBuscado;
    }

    public boolean agregar(Mecato mecato) {
        if (this.productos.size() < CANT_MAX_U) {
            Mecato m = buscar(mecato.getCodigo());
            if (m == null) {
                this.productos.add(mecato);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean sacar(Mecato mecato) {
        if (mecato != null) {
            mecato.setCantidad(mecato.getCantidad() - 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean sacarUnidad(int codigo) {
        Mecato mecatoBuscado = buscar(codigo);
        return sacar(mecatoBuscado);
    }

    public boolean sacarUnidad(String nombre) {
        Mecato mecatoBuscado = buscar(nombre);
        return sacar(mecatoBuscado);
    }

    public List<String> consultarAgotados() {
        List<String> agotados = new ArrayList<>();

        agotados = this.productos.stream()
                .filter(m -> m.getCantidad() == 0)
                .map(m -> m.getNombre())
                .collect(Collectors.toList());

        return agotados;
    }

    public int consultarUnidades(int codigo) {
        Mecato mecatoBuscado = buscar(codigo);
        return consultarUnidades(mecatoBuscado);
    }

    public int consultarUnidades(String nombre) {
        Mecato mecatoBuscado = buscar(nombre);
        return consultarUnidades(mecatoBuscado);
    }

    private int consultarUnidades(Mecato mecato) {
        if (mecato != null) {
            return mecato.getCantidad();
        }

        return 0;
    }

    public int consultarUnidadesTotales() {
        int totalUnidades = 0;

        totalUnidades = this.productos.stream()
                .mapToInt(m -> m.getCantidad())
                .sum();

        return totalUnidades;
    }

    public void aumentarStock(int codigo, int cantidadAAumentar) {
        Mecato mecato = buscar(codigo);

        if (mecato != null) {
            if ((mecato.getCantidad() + cantidadAAumentar) < Mecato.CANTIDAD_MAX) {
                mecato.setCantidad(mecato.getCantidad() + cantidadAAumentar);
            } else {
                mecato.setCantidad(Mecato.CANTIDAD_MAX);
            }
        }
    }

}
