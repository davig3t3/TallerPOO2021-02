package taller.Oftalmologo.dominio;

public class PacienteApto extends Paciente implements Operable {


    public PacienteApto(String nombre, int edad, boolean necesitaCirugia, String calidadVision) {
        super(nombre, edad, necesitaCirugia, calidadVision);
    }

    @Override
    public void operar() {
        necesitaCirugia = false;
        if(getEdad()<40){
            calidadVision = "20/20";
        }
        if (getEdad()>=40 && getEdad()<=60){

            calidadVision="10/10";

        }else{
            calidadVision="0/0";
        }
    }


}
