package ar.edu.unahur.obj2;

public class PuertaGarage implements productoElectronico {

    private boolean encendida = false;
    //encenderLuz
    public void on() {
        System.out.println("Garage encender luz");
    }
    //apagarLuz
    public void off() {
        System.out.println("Garage apagar luz");
    }

    public boolean isEncendida() {
        return encendida;
    }
    public void arriba() {
        encendida = true;
        System.out.println("Garage puerta arriba");
    }

    public void abajo() {
        encendida = false;
        System.out.println("Garage puerta abajo");
    }

    public void parar() {
        encendida = false;
        System.out.println("Garage puerta detenida");
    }

}
