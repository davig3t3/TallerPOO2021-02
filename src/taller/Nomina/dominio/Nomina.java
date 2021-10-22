package taller.Nomina.dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleados=new ArrayList<>();
    Empleado juan=new Directo("Juan",6812000);
    Empleado julian=new Vendedor("Julian",2410000,62106200);
    Empleado johanna=new Freelancer("Johanna",120000,79);
    Empleado carolina=new Vendedor("Carolina",998000,71589600);
    Empleado david=new Directo("David",3578000);
    Empleado gustavo=new Freelancer("Gustavo",70500,64);
    Empleado pedro=new Promotor("Pedro",974,190,68);

    public long consultarNomina(){
        long nominas= empleados.stream().mapToLong(Empleado::calcularSalario).sum();
        return nominas;

    }

    public void listarDirecto(){
        System.out.println("Estos son los empleados directos");
        empleados.forEach(empleado -> {
            if(empleado instanceof Directo || empleado instanceof Vendedor){
                if(empleado instanceof Vendedor) System.out.println(empleado.getNombre() + " -> Vendedor");
                else System.out.println(empleado.getNombre() + " Directo");
            }
        });
        System.out.println();
    }
    public void listarFreelancer(){
        System.out.println("Estos son los empleados freenlance");
        empleados.forEach(empleado -> {
            if(empleado instanceof Freelancer ){
                System.out.println(empleado.getNombre() + " Freenlance");
            }
        });
        System.out.println();
    }
    public void listarPromotor(){
        System.out.println("Estos son los empleados promotor");
        empleados.forEach(empleado -> {
            if(empleado instanceof Promotor ){
                System.out.println(empleado.getNombre() + " Promotor");
            }
        });
        System.out.println();
    }



    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}

