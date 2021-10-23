package taller.Nomina.app;

import taller.Nomina.dominio.*;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        Nomina nomina=new Nomina();
        ArrayList<Empleado> empleados=new ArrayList<>();
        Empleado juan=new Directo("Juan",6812000);
        Empleado julian=new Vendedor("Julian",2410000,62106200);
        Empleado johanna=new Freelancer("Johanna",120000,79);
        Empleado carolina=new Vendedor("Carolina",998000,71589600);
        Empleado david=new Directo("David",3578000);
        Empleado gustavo=new Freelancer("Gustavo",70500,64);
        Empleado pedro=new Promotor("Pedro",974,190,68);
        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(carolina);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);
        nomina.getEmpleados().add(pedro);


        nomina.getEmpleados().forEach(nominaactual->{StringBuilder vistaso = new StringBuilder();
            vistaso.append(nominaactual.getNombre()).append("  el salario es  : ").append(nominaactual.calcularSalario());
            System.out.println(vistaso);
        });
    }
}
