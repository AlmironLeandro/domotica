package ar.edu.unahur.obj2;

public class Stereo  implements productoElectronico {

    private boolean encendida = false;

    private String cd;
    private String dvd;
    private String radio;
    private int volumen;

   public void on() {
        encendida = true;
        System.out.println("Stereo encendido");
    }
    public void off() {
        encendida = false;
        System.out.println("Stereo apagado");
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isEncendida() {
        return encendida;
    }
}
