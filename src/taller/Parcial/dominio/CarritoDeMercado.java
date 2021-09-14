package taller.Parcial.dominio;

import taller.AgendaTelefonica.dominio.Contacto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarritoDeMercado {

    public static final int CAPACIDAD = 20;
    private String supermercado;
    private List<Producto> productos;

    public CarritoDeMercado(String supermercado){
        this.supermercado = supermercado;
        this.productos = new ArrayList<>();

    }

    public Producto buscar(String nombre, String tipo){
        Producto productoBuscado = null;

        for (Producto producto: this.productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productoBuscado = producto;
                break;
            }
        }


        for (Producto producto: this.productos) {
            if (producto.getTipo().equalsIgnoreCase(tipo)) {
                productoBuscado = producto;
                break;
            }
        }

        return productoBuscado;

    }

    public boolean agregar(Producto producto){

        if (this.productos.size() < CAPACIDAD) {
            this.productos.add(producto);
            return true;
        } else {
            return false;
        }

    }


    public  boolean sacar(Producto producto){
        Producto p = buscar(producto.getNombre(),producto.getTipo());
        if (p != null){
            this.productos.remove(producto);
            return true;
        } else {
            return  false;
        }
    }


    public int CalcularValorTotal(){

        int valorTotal = 0;

        valorTotal = this.productos.stream().mapToInt(p -> p.getPrecio()).sum();

        return valorTotal;

    }

    public Producto ProductoCaro(){

        int comparacion = 0;
        System.out.println("El producto mas caro es:");
        Producto producto = null;
        for(Producto p: this.productos) {
            if(p.getPrecio()> comparacion) {
                comparacion = p.getPrecio();
                producto = p;
            }
        }
        System.out.println(producto.toString()+"\n");

        return producto;


    }

}
