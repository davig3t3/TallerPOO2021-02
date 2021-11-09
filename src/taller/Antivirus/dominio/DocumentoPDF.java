package taller.Antivirus.dominio;

public class DocumentoPDF extends Documento {
    private boolean firmado;

    public DocumentoPDF(String nombre, boolean firmado) {
        super(nombre);
        this.firmado = firmado;
    }

    @Override
    public boolean tieneVirus() {
        return firmado == false ? true : false;
    }

    public boolean isFirmado() {
        return firmado;
    }
}
