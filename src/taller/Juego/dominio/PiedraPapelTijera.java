package taller.Juego.dominio;

import java.util.Arrays;
import java.util.List;

public class PiedraPapelTijera {

    public static final int PIEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TIJERA = 2;

    public static final List<Integer> OPCIONES = Arrays.asList(PIEDRA,PAPEL,TIJERA);
    private String nombreJuego;
    private String nombreJugador;
    private int ganadasJugador=0;
    private int ganadasPC=0;
    private int empate=0;


    public PiedraPapelTijera (String nombreJuego){
        this.nombreJuego = nombreJuego;
    }

    public PiedraPapelTijera(String nombreJugador, int ganadasJugador, int ganadasPC, int empate) {
        this.nombreJugador = nombreJugador;
        this.ganadasJugador = ganadasJugador;
        this.ganadasPC = ganadasPC;
        this.empate = empate;
    }

    public String play(int jugadaJugador, int jugadaMaquina) {
        if (jugadaJugador == PIEDRA && jugadaMaquina == TIJERA) {
            ganadasJugador++;
            return "¡Has ganado " + nombreJugador + "!";
        } else if (jugadaJugador == PAPEL && jugadaMaquina == PIEDRA) {
            ganadasJugador++;
            return "¡Has ganado " + nombreJugador + "!";
        } else if (jugadaJugador == TIJERA && jugadaMaquina == PAPEL) {
            ganadasJugador++;
            return "¡Has ganado " + nombreJugador + "!";
        } else if (jugadaJugador == jugadaMaquina) {
            empate++;
            return "Buen juego " + nombreJugador + ", fue un empate.";
        } else {
            ganadasPC++;
            return "¡Has perdido " + nombreJugador + "!";
        }
    }


    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getGanadasJugador() {
        return ganadasJugador;
    }

    public void setGanadasJugador(int ganadasJugador) {
        this.ganadasJugador = ganadasJugador;
    }

    public int getGanadasPC() {
        return ganadasPC;
    }

    public void setGanadasPC(int ganadasPC) {
        this.ganadasPC = ganadasPC;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
