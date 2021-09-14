package taller.AgendaTelefonica.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Agenda {

    public static final int CANT_MAX_CONT = 20;
    private String directorio;
    private List<Contacto> contactos;

    public Agenda(String directorio){
        this.directorio = directorio;
        this.contactos = new ArrayList<>();
    }

    public Contacto buscar(String nombre, String apellido){
        Contacto contactoBuscado = null;
        for(Contacto contacto: this.contactos){
            if(contacto.getNombre().equalsIgnoreCase(nombre)){
                contactoBuscado = contacto;
            }
            if(contacto.getApellido().equalsIgnoreCase(apellido)){
                contactoBuscado = contacto;
            }
        }
        return contactoBuscado;
    }

    public Contacto buscar(int numero){

        Contacto contactoBuscado = null;

        for (Contacto contacto: this.contactos) {
            if (contacto.getNumero() == numero) {
                contactoBuscado = contacto;
                break;
            }
        }

        return contactoBuscado;

    }

    public boolean agregar(Contacto contacto){
        if (this.contactos.size() < CANT_MAX_CONT){
            Contacto c = buscar(contacto.getNumero());
            if (c == null) {
                this.contactos.add(contacto);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public  boolean eliminar(Contacto contacto){
        Contacto c = buscar(contacto.getNumero());
        if (c == null){
            this.contactos.remove(contacto);
            return true;
        } else {
            return  false;
        }
    }








}
