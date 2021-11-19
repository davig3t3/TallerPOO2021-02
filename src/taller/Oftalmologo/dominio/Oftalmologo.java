package taller.Oftalmologo.dominio;

import taller.Biblioteca.julian.dominio.Prestable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;
    public static final int EDAD_MAX=40;

    public Oftalmologo(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public void revisarPaciente(Paciente paciente){
        //paciente.getNombre();
        //paciente.getEdad();

        if (paciente.getNombre().toLowerCase(Locale.ROOT).contains("a") && paciente.getEdad()<EDAD_MAX){
            System.out.println(paciente.getNombre()+" Necesita cirugia");
        }else{
            System.out.println(paciente.getNombre()+" El paciente no cumple con los requisitos para ser operado");
        }
    }

    public void operarPaciente(){

        pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            System.out.println("Los pacientes que seran intervenidos son: " + paciente.getNombre());
        });

    }

    public void getPacientesAOperar(){

        pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            if (paciente.isNecesitaCirugia()==false){
                paciente.necesitaCirugia=true;
            }else{
                System.out.println("El paciente ya fue intervenido");
            }
            System.out.println("Los pacientes que seran intervenidos son: " + paciente.getNombre());
        });

    }



}
