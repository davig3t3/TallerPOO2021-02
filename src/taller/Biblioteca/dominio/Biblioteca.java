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
                recursos.forEach(recurso -> {
                    if(recurso.isPrestado()){
                        System.out.println("El articulo ya se encuentra prestado: "+recurso.getNombre());
                    }
                });
                //System.out.println("El articulo ya se encuentra prestado");
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

    public boolean fotocopiarRecurso(Recurso r){
        if (r instanceof Copiable){
            if (r.isPrestado()==false){
                ((Copiable)r).fotocopiar();
                return true;
            }else {
                System.out.println("El articulo se ha fotocopiado");
                return false;
            }
        }else{
            System.out.println("Es un articulo fotocopiable");
            return false;
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

    public void listarCopiasPorCurso(){

        AtomicInteger cantidadCopiados = new AtomicInteger();

        recursos.forEach(recurso -> {
            if(recurso.getCopias()>0){
                cantidadCopiados.incrementAndGet();
                System.out.println("Los fotocopiados son: " + recurso.getNombre()+" Su cantidad de copias es: "+ recurso.getCopias());
            }
        });

        System.out.println("La cantidad de fotocopiados es: " + cantidadCopiados);

    }

}
