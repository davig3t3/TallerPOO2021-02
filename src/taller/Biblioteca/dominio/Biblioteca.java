package taller.Biblioteca.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Biblioteca {

    private String nombre;
    private List<Recurso> recursos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.recursos = new ArrayList<>();
    }

    public void addRecurso(Recurso... r){

        this.recursos.addAll(Arrays.asList(r));

    }

    public boolean prestarRecurso(Recurso r){
        if (r instanceof Prestable){
            if (r.isPrestado()==false){
                ((Prestable)r).prestar();
                return true;
            }else {
                System.out.println("El articulo ya se encuentra prestado");
            return false;
            }
        }else{
            System.out.println("No es un articulo prestable");
            return false;
        }
    }

    public boolean devolverRecurso(Recurso r){
        if (r instanceof Prestable){
            if (r.isPrestado()==true){
                ((Prestable)r).devolver();
                return false;
            }else {
                System.out.println("El articulo ya ha sido devuelto");
                return true;
            }
        }else{
            System.out.println("Es un articulo prestable");
            return true;
        }
    }

    public void listarPrestados(){

        AtomicInteger cantidadPrestados = new AtomicInteger();

        recursos.forEach(recurso -> {
            if(recurso.isPrestado()){
                cantidadPrestados.incrementAndGet();
                System.out.println("Los prestados son: " + recurso.getNombre());
            }
        });

        System.out.println("La cantidad de prestados es: " + cantidadPrestados);

    }

}
