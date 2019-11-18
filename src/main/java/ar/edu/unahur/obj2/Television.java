package ar.edu.unahur.obj2;

public class Television implements productoElectronico {

    private boolean encendida = false;

    private int volumen;
    private int canal;

    public void on() {
        encendida = true;
        System.out.println("Television encendida");
    }

    public void off() {
        encendida = false;
        System.out.println("Television apagada");
    }

    public void definirVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void definirCanal(int canal) {
        this.canal = canal;
    }
}
