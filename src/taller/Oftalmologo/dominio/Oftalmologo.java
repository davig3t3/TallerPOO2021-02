package taller.Oftalmologo.dominio;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Oftalmologo {
    private String nombre;
    private List<Paciente> pacientes;
    private List<PacienteApto> pacienteAptos;
    public static final int EDAD_MAX = 40;

    public Oftalmologo(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
        this.pacienteAptos = new ArrayList<>();
    }

    /*public void addPaciente(Paciente... p) {

        this.pacientes.addAll(Arrays.asList(p));

    }

     */

    public Paciente revisarPaciente(String nombre, int edad) {


        Paciente paciente = null;

        if (nombre.toLowerCase(Locale.ROOT).contains("a")) {
            System.out.println(paciente.getNombre() + " Necesita cirugia");
        }
        if (nombre.toLowerCase(Locale.ROOT).contains("a") && edad < EDAD_MAX) {
            System.out.println(paciente.getNombre() + " El paciente es apto");
            paciente = new PacienteApto(nombre, edad, true);
            pacientes.add(paciente);
        } else {
            System.out.println(paciente.getNombre() + " El paciente no cumple con los requisitos para ser operado");
            paciente = new PacienteNoApto(nombre, edad, false);
        }

        return paciente;
    }


    public void operarPacientes() {

        pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            ((Operable) paciente).operar();
        });

        /*pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            if (paciente.getNombre().toLowerCase(Locale.ROOT).contains("a") && paciente.getEdad() < EDAD_MAX) {
                System.out.println(paciente.getNombre() + " El paciente sera intervenido");
                ((Operable) paciente).operar();
            } else {
                System.out.println(paciente.getNombre() + " El paciente no sera intervenido");
            }
        });

         */


    }

    public void getPacientesAOperar() {

        pacientes.stream().filter(p -> p instanceof Operable).forEach(paciente -> {
            if (paciente.isNecesitaCirugia() == false) {
                paciente.necesitaCirugia = false;
                pacienteAptos.add((PacienteApto) paciente);
            } else {
                System.out.println("El paciente ya fue intervenido");
            }
            System.out.println("Los pacientes que seran intervenidos son: " + paciente.getNombre());
        });

    }


}
