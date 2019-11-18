package ar.edu.unahur.obj2;

public class LuzTecho implements productoElectronico {

    private boolean encendida = false;

    public void on() {
        encendida = true;
        System.out.println("Luz Techo encendida");
    }

    public void off() {
        encendida = false;
        System.out.println("Luz Techo apagada");
    }

    void dim() {
        System.out.println("Luz Techo bajando intensidad");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
