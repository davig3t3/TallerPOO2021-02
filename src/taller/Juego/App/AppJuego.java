package taller.Juego.App;

import ProyectosHarby.Juego.Dominio.Juego_Piedra_Papel_Tijera;

import javax.swing.*;
import java.util.Arrays;

public class AppJuego {

    private static ImageIcon icono = new ImageIcon("C:\\Users\\Usuario\\Desktop\\POO Harby Garcia\\src\\ProyectosHarby\\Juego\\App\\uco.PNG");
    private static final int JUGAR = 0;
    private static final int PUNTAJE = 1;
    private static final int INSTRUCCIONES = 2;
    private static final int CAMBIAR_NOMBRE = 3;

    public static void main(String[] args) {
        int opcJugador = -1;
        Juego_Piedra_Papel_Tijera juego = new Juego_Piedra_Papel_Tijera("Piedra, Papel o Tijera");

        String nombre;

        while (true){


            int opcionElegida = JOptionPane.showOptionDialog(null,
                    "**** VAMOS A JUGAR ****",
                    "Piedra - Papel - Tijera", 0, 0, icono,
                    Arrays.asList("Jugar", "Puntaje", "Instrucciones", "Cambiar Nombre").toArray(), null);
            switch (opcionElegida){
                case JUGAR:

                    nombre = JOptionPane.showInputDialog(null,"Digite su nombre");
                    if(nombre == null || nombre.trim().isEmpty()){
                        JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador");
                    }


                    String opcElegida = (String) JOptionPane.showInputDialog(null, "Qué opción desea escoger" ,
                            "Piedra - Papel - Tijera", JOptionPane.QUESTION_MESSAGE, icono, Arrays.asList("Piedra", "Papel", "Tijera").toArray(), null);

                    opcJugador = "Piedra".equals(opcElegida) ? Juego_Piedra_Papel_Tijera.PIEDRA : "Papel".equals(opcElegida) ? Juego_Piedra_Papel_Tijera.PAPEL : Juego_Piedra_Papel_Tijera.TIJERA;
                    mostrarMensaje("El usuario eligió " + opcJugador);
                    break;
                case PUNTAJE:
                    break;
                case INSTRUCCIONES:
                    break;
                case CAMBIAR_NOMBRE:
                    break;
            }



        }





    }
    public String ingresarNombre() {return ingresarNombre();

    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }
}
