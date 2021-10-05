package taller.Juego.app;

import taller.Juego.dominio.PiedraPapelTijera;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class app {

    private static ImageIcon icono = new ImageIcon("C:\\Users\\zuiza\\Documents\\GitHub\\TallerPOO2021-02\\src\\taller\\Juego\\app\\uco.PNG");
    private static final int JUGAR = 0;
    private static final int PUNTAJE = 1;
    private static final int INSTRUCCIONES = 2;
    private static final int CAMBIAR_NOMBRE = 3;

    public static void main(String[] args) {
        int opcJugador = -1;
        PiedraPapelTijera juego = new PiedraPapelTijera("Piedra, Papel o Tijera");

        String nombre;

        while (true) {


            int opcionElegida = JOptionPane.showOptionDialog(null,
                    "**** VAMOS A JUGAR ****",
                    "Piedra - Papel - Tijera", 0, 0, icono,
                    Arrays.asList("Jugar", "Puntaje", "Instrucciones", "Cambiar Nombre").toArray(), null);
            switch (opcionElegida) {
                case JUGAR:


                    if (juego.getNombreJugador() == null) {
                        nombre = ingresarNombre();
                        juego.setNombreJugador(nombre);
                        if (nombre == null || nombre.trim().isEmpty()) {
                            JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador");
                        }
                    }


                    String opcElegida = (String) JOptionPane.showInputDialog(null, "Qué opción desea escoger",
                            "Piedra - Papel - Tijera", JOptionPane.QUESTION_MESSAGE, icono, Arrays.asList("Piedra", "Papel", "Tijera").toArray(), null);

                    opcJugador = "Piedra".equals(opcElegida) ? PiedraPapelTijera.PIEDRA : "Papel".equals(opcElegida) ? PiedraPapelTijera.PAPEL : PiedraPapelTijera.TIJERA;
                    mostrarMensaje("El usuario eligió " + opcJugador);

                    Random rand = new Random();
                    int randomElement = PiedraPapelTijera.OPCIONES.get(rand.nextInt(PiedraPapelTijera.OPCIONES.size()));

                    mostrarMensaje("La maquina eligio" + randomElement);

                    mostrarMensaje(juego.getNombreJugador() + juego.play(opcJugador, randomElement));

                    break;
                case PUNTAJE:
                    mostrarMensaje("PUNTAJE " + juego.getNombreJugador() + juego.getGanadasJugador() + "\n" + "PUNTAJE PC: " + juego.getGanadasPC() + "\n" + "EMPATE: " + juego.getEmpate() + "\n");
                    break;
                case INSTRUCCIONES:
                    JOptionPane.showMessageDialog(null, "Objetivo:\n" +
                            "\n" +
                            "Elegir un candidato. Seleccionar un candidato.\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "Instrucciones:\n" +
                            "\n" +
                            "Los jugadores cuentan juntos «1, 2, 3…, ¡piedra, papel o tijera!»\n" +
                            "\n" +
                            "Justo al acabar muestran todos al mismo tiempo una de sus manos, de modo que pueda verse el elemento que cada uno ha elegido:\n" +
                            "\n" +
                            "Piedra: un puño cerrado.\n" +
                            "Papel: todos los dedos extendidos, con la palma de la mano de lado, mirando hacia abajo o hacia arriba\n" +
                            "Tijera: dedos índice y corazón extendidos y separados formando una «V».\n" +
                            "El objetivo es vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n" +
                            "\n" +
                            "La piedra aplasta la tijera. (Gana la piedra.)\n" +
                            "La tijera corta el papel. (Gana la tijera.)\n" +
                            "El papel envuelve la piedra. (Gana el papel.)\n" +
                            "En caso de empate (que dos jugadores elijan el mismo elemento o que tres jugadores elijan cada uno un objeto distinto), se juega otra vez.\n" +
                            "Adaptado de Wikipedia\n" +
                            "\n" +
                            "Comentarios:\n" +
                            "\n" +
                            "A veces, esto se repite hasta que uno de los jugadores gana con tres puntos, o cinco, según se haya acordado previamente, y será entonces el vencedor del juego.\n" +
                            "\n" +
                            "Los ganadores pueden seguir jugando hasta quedarse un único ganador.");

                    break;
                case CAMBIAR_NOMBRE:
                    nombre = juego.getNombreJugador();
                    if (nombre != null) {
                        nombre = ingresarNombre();
                        juego.setNombreJugador(nombre);
                    }
                    break;
            }


        }


    }

    public static String ingresarNombre() {
        String nombreJugador;

        do {
            nombreJugador = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
        } while (nombreJugador == null || nombreJugador.trim().isEmpty());

        return nombreJugador;
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
    }
}
