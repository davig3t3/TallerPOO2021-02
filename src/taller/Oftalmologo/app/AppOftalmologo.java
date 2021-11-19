package taller.Oftalmologo.app;

import taller.Oftalmologo.dominio.Oftalmologo;
import taller.Oftalmologo.dominio.PacienteApto;
import taller.Oftalmologo.dominio.PacienteNoApto;

public class AppOftalmologo {
    public static void main(String[] args) {
        Oftalmologo oftalmologo = new Oftalmologo("PEPE");

        PacienteApto pacienteApto = new PacienteApto("Arturo",39,false);
        PacienteNoApto pacienteNoApto = new PacienteNoApto("Jose Alberto",55,false);
        PacienteApto pacienteApto2 = new PacienteApto("Miguel",60,false);
        PacienteNoApto pacienteNoApto2 = new PacienteNoApto("Sara",23,true);

        oftalmologo.revisarPaciente(pacienteApto);
        oftalmologo.revisarPaciente(pacienteNoApto);
        oftalmologo.revisarPaciente(pacienteApto2);
        oftalmologo.revisarPaciente(pacienteNoApto2);

        oftalmologo.operarPaciente();
        oftalmologo.getPacientesAOperar();



    }
}
