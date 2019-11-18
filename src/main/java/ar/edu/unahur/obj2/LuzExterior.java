package ar.edu.unahur.obj2;

public class LuzExterior  implements productoElectronico{

    private boolean encendida = false;

    public void on() {
        encendida = true;
        System.out.println("Luz Exterior encendida");
    }

    public void off() {
        encendida = false;
        System.out.println("Luz Exterior apagada");
    }

    public boolean isEncendida() {
        return encendida;
    }
}
