package taller.Juego.Dominio;

import java.util.Arrays;
import java.util.List;

public class Juego_Piedra_Papel_Tijera {
    public static final int PIEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TIJERA = 2;

    public static final List<Integer> OPCIONES = Arrays.asList(PIEDRA,PAPEL,TIJERA);
    private String nombreJuego;
    private String nombreJugador;
    private int ganadasJugador;
    private int ganadasPC;
    private int empate;

    public Juego_Piedra_Papel_Tijera (String nombreJuego){
        this.nombreJuego = nombreJuego;
    }

    public Juego_Piedra_Papel_Tijera(String nombreJugador, int ganadasJugador, int ganadasPC, int empate) {
        this.nombreJugador = nombreJugador;
        this.ganadasJugador = ganadasJugador;
        this.ganadasPC = ganadasPC;
        this.empate = empate;

    }



    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}
