package taller.Antivirus.dominio;

public class Foto implements Viruseable{
    private int tamaxoPix;
    private int peso;

    public Foto(int tamaxoPix, int peso) {
        this.tamaxoPix = tamaxoPix;
        this.peso = peso;
    }

    @Override
    public boolean tieneVirus() {
        return this.peso <10 ? true : false;
    }

    @Override
    public String getNombre() {
        return null;
    }
}
