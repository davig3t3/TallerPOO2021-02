package taller.Antivirus.app;

import taller.Antivirus.dominio.*;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus("AVG");

        DocumentoPDF pdf = new DocumentoPDF("ensayo.pdf", false);
        DocumentoWord word = new DocumentoWord("carta.docx", 1200);
        Cancion cancion = new Cancion("La canción", 254);
        Juego juego = new Juego("DOOM", "facil");
        Video video = new Video("Video.wva", 245);
        Foto foto = new Foto(23, 2);

        antivirus.agregar(pdf, word, cancion, juego, video, foto);
        antivirus.escanear();
    }
}
