package ar.edu.unahur.obj2;

public class VentiladorDeTecho implements productoElectronico {

    private boolean encendida = false;

    public void off() {
        encendida = false;
        System.out.println("Ventilador de apagado");
    }
    public void on() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad baja");
    }
    public void fuerte() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad fuerte");
    }

    public void media() {
        encendida = true;
        System.out.println("Ventilador de techo velocidad media");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
